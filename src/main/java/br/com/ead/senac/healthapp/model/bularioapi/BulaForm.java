package br.com.ead.senac.healthapp.model.bularioapi;

public class BulaForm {
    private String medicationName;

    public BulaForm() {
    }

    public BulaForm(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getMedicationName() { return medicationName;
    }

    public void setMedicationName(String medicamentionName) {
        this.medicationName = medicamentionName;
    }

}
