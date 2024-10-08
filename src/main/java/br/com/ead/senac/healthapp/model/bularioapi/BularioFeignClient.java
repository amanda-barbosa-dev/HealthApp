package br.com.ead.senac.healthapp.model.bularioapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Interface que define as informações da API Bulário
@FeignClient(name="bularioFeignClient", url="https://bula.vercel.app")
public interface BularioFeignClient {

    @GetMapping("/pesquisar")
    SearchMedResponse searchMedication(@RequestParam("nome") String medicationName);

    @GetMapping("/pdf")
    byte[] getBula(@RequestParam("id") String idBulaProfissionalProtegido);
}
