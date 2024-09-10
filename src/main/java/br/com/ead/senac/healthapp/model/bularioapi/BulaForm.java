package br.com.ead.senac.healthapp.model.bularioapi;

//Classe que define as informações do formulário de Pesquisa de Bula
public class BulaForm {
    private String medicationName;

    private String labName;

    public BulaForm() {
    }

    public BulaForm(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getMedicationName() { return medicationName;
    }

    public String getLabName() { return labName; }

    public void setMedicationName(String medicamentionName) {
        this.medicationName = medicamentionName;
    }

    public void setLabName (String labName) { this.labName = labName; }
}
