package cl.corona.bbookenvoc.service;

import cl.corona.bbookenvoc.model.bbookJson;
import cl.corona.bbookenvoc.repository.bbookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class bbookService {

    @Autowired
    bbookRepository bbookrepository;

    public ArrayList<bbookJson> obtenerJsob() {

        return (ArrayList<bbookJson>) bbookrepository.findAll();
    }

    public bbookJson guardarJsob(bbookJson bbookjson) {

        return bbookrepository.save(bbookjson);
    }

    public Optional<bbookJson> buscarJsob(Long idbk) {

        return bbookrepository.findById(idbk);
    }
}