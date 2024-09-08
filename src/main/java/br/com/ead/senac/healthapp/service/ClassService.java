package br.com.ead.senac.healthapp.service;

import br.com.ead.senac.healthapp.model.bularioapi.BularioFeignClientIntegrator;

import br.com.ead.senac.healthapp.model.bularioapi.SearchMedResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class ClassService {

    @Autowired
    BularioFeignClientIntegrator bularioFeignClientIntegrator;

    public byte[] getBula(String medicationName) {
        SearchMedResponse response = bularioFeignClientIntegrator.searchMedication(medicationName);
        var contentList = response.getContent();
        System.out.println(contentList.toString());
        var id =  contentList.get(0).getIdBulaPacienteProtegido();
        return bularioFeignClientIntegrator.getBula(id);
    }
}

