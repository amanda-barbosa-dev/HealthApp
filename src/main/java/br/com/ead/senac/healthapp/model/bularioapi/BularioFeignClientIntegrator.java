package br.com.ead.senac.healthapp.model.bularioapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Classe que define o métodos que chamarão a interface da API Bulário
@Component
public  class BularioFeignClientIntegrator {
    @Autowired
    private BularioFeignClient bularioFeignClient;

    public SearchMedResponse searchMedication(String medicationName) {
        return bularioFeignClient.searchMedication(medicationName);
    }


    public byte[] getBula(String idBulaProfissionalProtegido) {
        return bularioFeignClient.getBula(idBulaProfissionalProtegido);
    }
}

