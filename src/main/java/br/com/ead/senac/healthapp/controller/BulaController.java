package br.com.ead.senac.healthapp.controller;


import br.com.ead.senac.healthapp.model.bularioapi.BulaForm;
import br.com.ead.senac.healthapp.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BulaController {


    @Autowired
    private ClassService service;


    @GetMapping("/searchBula")
    public ModelAndView pesquisarBula() {
        ModelAndView mv = new ModelAndView("searchBula");
        mv.addObject("bulaForm", new BulaForm());
        return mv;
    }

    @PostMapping("/searchBula")
    public ModelAndView processarPesquisa(@ModelAttribute BulaForm bulaForm) {
        String medName = bulaForm.getMedicationName();
        String labName = bulaForm.getLabName();
        System.out.println(labName);
        byte[] pdf = service.getBula(medName, labName);
        System.out.println("PDF ENCONTRADO");
        ModelAndView mv = new ModelAndView("resultBula");
        mv.addObject("pdf", pdf);
        System.out.println("PDF ENCODER");
        return mv;
    }
}
