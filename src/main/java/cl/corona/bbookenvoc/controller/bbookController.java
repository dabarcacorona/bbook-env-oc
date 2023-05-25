package cl.corona.bbookenvoc.controller;

import cl.corona.bbookenvoc.model.bbookJson;
import cl.corona.bbookenvoc.repository.*;
import cl.corona.bbookenvoc.service.bbookGeneralService;
import cl.corona.bbookenvoc.service.bbookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.dao.InvalidDataAccessResourceUsageException;
import org.springframework.web.bind.annotation.*;
import javax.persistence.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/CreaOC")
public class bbookController {

    private static final Logger LOG = LoggerFactory.getLogger(bbookController.class);

    @Value("${tokken}")
    private String tokken;

    @Autowired
    bbookService bbookservice;

    @Autowired
    bbookSpInvoke bbookspinvoke;

    @Autowired
    bbookGeneralService bbookgeneralservice;

    @Autowired
    bbookSdipmgcaiRepository bbooksdipmgcairepository;

    @Autowired
    bbookSdipmgdtiRepository bbooksdipmgdtirepository;

    @Autowired
    bbookSdipmghdiRepository bbooksdipmghdirepository;

    @Autowired
    bbookSdivalmsiRepository bbooksdivalmsirepository;

    @Autowired
    private EntityManager entityManager;

    @GetMapping()
    public ArrayList<bbookJson> obtenerJsob(){

        return bbookservice.obtenerJsob();
    }

    @PostMapping()
    @ResponseBody
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    //public Optional<BbookJson> guardarJsob(@RequestBody String StrBbookJson, @RequestHeader(value="Authorization") String token) throws IOException{
    public String  guardarJsob(@RequestBody String StrBbookJson, @RequestHeader(value="Authorization") String token) throws IOException {
        String response;
        if(token == null) {

            return "{\"status\":\"Err\",\"statusCode\":401,\"internalCode\":\"00\",\"message\":\"Unauthorized\",\"alert\":\"Llamada sin token \"}";
        }

        if(token.equals(tokken)) {

            BigDecimal id_bk = (BigDecimal) entityManager.createNativeQuery("select bbook_number.nextval from dual").getSingleResult();
            bbookJson bbookjson = new bbookJson(id_bk.longValue(),StrBbookJson, null);

            try {
                bbookservice.guardarJsob(bbookjson);
            }catch (Exception e) {
                LOG.debug("{} Err al guardar json ", e);
                return "{\"status\":\"Err\",\"statusCode\":000,\"internalCode\":\"01\",\"message\":\"Error al guardar json\",\"alert\":\"Error al guardar json\"}";
            }

            try {
                bbookspinvoke.CallSp(id_bk.longValue());
            }catch (Exception e) {
                LOG.debug("{} El Proceso Almacenado BBOOK CARGA OC con error", e);
                return "{\"status\":\"Err\",\"statusCode\":000,\"internalCode\":\"02\",\"message\":\"Error sp carga oc\",\"alert\":\"Error sp carga oc\"}";
            }

            try {
                bbookgeneralservice.llamadaGeneral(id_bk.longValue());

            } catch (InvalidDataAccessResourceUsageException e) {
                LOG.error("{}: Ocurrio un error al momento de enviar las OC: ", e );
                return "{\"status\":\"Err\",\"statusCode\":000,\"internalCode\":\"03\",\"message\":\"Error al enviar oc a pmm\",\"alert\":\"Error al enviar oc a pmm\"}";
            }

            bbooksdipmgcairepository.updSdipmgcai(id_bk.longValue());
            bbooksdipmgdtirepository.updSdipmgdti(id_bk.longValue());
            bbooksdipmghdirepository.updSdipmghdi(id_bk.longValue());
            bbooksdivalmsirepository.updSdiValmsi(id_bk.longValue());

            return "{\"status\":\"OK\",\"statusCode\":201,\"internalCode\":\"00\",\"message\":\"Created\",\"alert\":\"Solicitud de oc creada\"}";

        } else {

            return "{\"status\":\"Err\",\"statusCode\":403,\"internalCode\":\"00\",\"message\":\"Forbidden\",\"alert\":\"Llamada con token invalido\"}";
        }

    }
}

