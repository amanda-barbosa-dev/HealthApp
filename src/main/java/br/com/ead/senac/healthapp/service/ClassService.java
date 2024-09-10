package br.com.ead.senac.healthapp.service;

import br.com.ead.senac.healthapp.model.bularioapi.BularioFeignClientIntegrator;

import br.com.ead.senac.healthapp.model.bularioapi.Content;
import br.com.ead.senac.healthapp.model.bularioapi.SearchMedResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public  class ClassService {

    @Autowired
    BularioFeignClientIntegrator bularioFeignClientIntegrator;

    public byte[] getBula(String medicationName, String labName ) {
        SearchMedResponse response = bularioFeignClientIntegrator.searchMedication(medicationName);
        var contentList = response.getContent();
        String id = null;
        for (Content content : contentList) {
            if (content.getRazaoSocial().contains(labName.toUpperCase())){
                id = content.getIdBulaPacienteProtegido();
                System.out.println(id);
                break;
            }
        }
        return bularioFeignClientIntegrator.getBula(id);
    }
}

