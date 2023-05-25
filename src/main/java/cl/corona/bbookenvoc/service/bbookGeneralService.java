package cl.corona.bbookenvoc.service;

import cl.corona.bbookenvoc.model.bbookSdipmgcai;
import cl.corona.bbookenvoc.model.bbookSdipmgdti;
import cl.corona.bbookenvoc.model.bbookSdipmghdi;
import cl.corona.bbookenvoc.model.bbookSdivalmsi;
import com.jcraft.jsch.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@Service
@Transactional
public class bbookGeneralService {


    @Value("${sftp.ip}")
    private String sftpip;

    @Value("${sftp.prt}")
    private int sftpprt;

    @Value("${sftp.usr}")
    private String sftpusr;

    @Value("${sftp.pss}")
    private String sftppss;

    @Value("${sftp.dtn}")
    private String sftpdtn;

    @Value("${carpeta.general}")
    private String carpeta;

    @Value("${carpeta.bajada}")
    private String bajada;

    @Value("${carpeta.subida}")
    private String subida;

    @Value("${separador.carpetas}")
    private String separador;


    @Autowired
    private bbookSdivalmsiService bbooksdivalmsiservice;

    @Autowired
    private bbookSdipmgcaiService bbooksdipmgcaiservice;

    @Autowired
    private bbookSdipmgdtiService bbooksdipmgdtiservice;

    @Autowired
    private bbookSdipmghdiService bbooksdipmghdiservice;

    private static final Logger LOG = LoggerFactory.getLogger(bbookGeneralService.class);


    public void llamadaGeneral(long idbatchnum) throws IOException {

        String strDir = System.getProperty("user.dir");
        LOG.info("strDir (user.dir) = ({})", strDir);

        Date fecha = new Date(Calendar.getInstance().getTimeInMillis());
        SimpleDateFormat formatterf = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat formatterh = new SimpleDateFormat("HHmmss");
        final String nombreArchivoDescarga1 = "sdipmgcai_" + formatterf.format(fecha) + formatterh.format(fecha) + ".csv";
        final String nombreArchivoDescarga2 = "sdivalmsi_" + formatterf.format(fecha) + formatterh.format(fecha) + ".csv";
        final String nombreArchivoDescarga3 = "sdipmgdti_" + formatterf.format(fecha) + formatterh.format(fecha) + ".csv";
        final String nombreArchivoDescarga4 = "sdipmghdi_" + formatterf.format(fecha) + formatterh.format(fecha) + ".csv";
        final String nombreArchivoDescarga5 = "sdipmghdi_" + formatterf.format(fecha) + formatterh.format(fecha) + ".zip";
        final String nombreArchivoDescarga6 = "SDIPMGHDI_" + formatterf.format(fecha) + formatterh.format(fecha);

        final String pathCompletoArchivoResultanteDescarga = strDir + separador + carpeta + separador + bajada + separador;


        List<bbookSdipmgcai> bbooksdipmgcaiResult = bbooksdipmgcaiservice.writeToCsvDetailCsv(nombreArchivoDescarga1, pathCompletoArchivoResultanteDescarga, idbatchnum);

        List<bbookSdivalmsi> bbooksdivalmsiResult = bbooksdivalmsiservice.writeToCsvDetailCsv(nombreArchivoDescarga2, pathCompletoArchivoResultanteDescarga, idbatchnum);

        List<bbookSdipmgdti> bbooksdipmgdtiResult = bbooksdipmgdtiservice.writeToCsvDetailCsv(nombreArchivoDescarga3, pathCompletoArchivoResultanteDescarga, idbatchnum);

        List<bbookSdipmghdi> bbooksdipmghdiResult = bbooksdipmghdiservice.writeToCsvDetailCsv(nombreArchivoDescarga4, pathCompletoArchivoResultanteDescarga, idbatchnum);


        // Archivo de Contorl

        long bbooksdipmgcaisum = bbooksdipmgcaiResult.size() + 1;
        long bbooksdivalmsisum = bbooksdivalmsiResult.size() + 1;
        long bbooksdipmgdtisum = bbooksdipmgdtiResult.size() + 1;
        long bbooksdipmghdisum = bbooksdipmghdiResult.size() + 1;


        try {
            PrintWriter writer = new PrintWriter(pathCompletoArchivoResultanteDescarga + nombreArchivoDescarga6, "UTF-8");
            //writer.println(nombreArchivoDescarga1 + ";" + bbooksdipmgcaisum);
            writer.println(nombreArchivoDescarga2 + ";" + bbooksdivalmsisum);
            writer.println(nombreArchivoDescarga3 + ";" + bbooksdipmgdtisum);
            writer.println(nombreArchivoDescarga4 + ";" + bbooksdipmghdisum);

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

//Cear archivo Zip
        File f = new File(pathCompletoArchivoResultanteDescarga + nombreArchivoDescarga5);
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(f));

        Path xfile = null;
        ZipEntry ze = null;

      //  xfile = Paths.get(pathCompletoArchivoResultanteDescarga + nombreArchivoDescarga1);
      //  ze = new ZipEntry(nombreArchivoDescarga1);
      //  out.putNextEntry(ze);
      //  byte[] bytes = Files.readAllBytes(xfile);
      //  out.write(bytes, 0, bytes.length);
      //  out.closeEntry();

        xfile = Paths.get(pathCompletoArchivoResultanteDescarga + nombreArchivoDescarga2);
        ze = new ZipEntry(nombreArchivoDescarga2);
        out.putNextEntry(ze);
        //bytes = Files.readAllBytes(xfile);
        byte[] bytes = Files.readAllBytes(xfile);
        out.write(bytes, 0, bytes.length);
        out.closeEntry();

        xfile = Paths.get(pathCompletoArchivoResultanteDescarga + nombreArchivoDescarga3);
        ze = new ZipEntry(nombreArchivoDescarga3);
        out.putNextEntry(ze);
        bytes = Files.readAllBytes(xfile);
        out.write(bytes, 0, bytes.length);
        out.closeEntry();

        xfile = Paths.get(pathCompletoArchivoResultanteDescarga + nombreArchivoDescarga4);
        ze = new ZipEntry(nombreArchivoDescarga4);
        out.putNextEntry(ze);
        bytes = Files.readAllBytes(xfile);
        out.write(bytes, 0, bytes.length);
        out.closeEntry();

        out.close();

        JSch jsch = new JSch();
        try {
            Session session = jsch.getSession(sftpusr, sftpip, sftpprt);
            session.setConfig("PreferredAuthentications", "password");
            session.setConfig("StrictHostKeyChecking", "no");
            session.setPassword(sftppss);
            session.connect();
            Channel channel = session.openChannel("sftp");
            ChannelSftp sftp = (ChannelSftp) channel;
            sftp.connect();

            File file = new File(pathCompletoArchivoResultanteDescarga + nombreArchivoDescarga5);
            InputStream inputStream = new FileInputStream(file);
            sftp.cd(sftpdtn);
            sftp.put(inputStream, file.getName());
            inputStream.close();


            file = new File(pathCompletoArchivoResultanteDescarga + nombreArchivoDescarga6);
            inputStream = new FileInputStream(file);
            sftp.cd(sftpdtn);
            sftp.put(inputStream, file.getName());
            inputStream.close();

        } catch (JSchException e) {
            LOG.error("No se pudo realizar la conexión ,{}", e);
        } catch (SftpException e) {
            LOG.error("No se pudo subir el fichero ,{}", e);
        } catch (IOException e) {
            LOG.error("No se pudo crear el fichero ,{}", e);
        }

    }
}
