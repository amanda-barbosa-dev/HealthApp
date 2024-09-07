package br.com.ead.senac.healthapp.model;

public class Reminder {

  private Long id;
  private String medicationName;

  private String date;

  private String time;

  public Reminder() {
  }
  public Reminder(Long id, String medicationName, String date, String time) {
    this.id = id;
    this.medicationName = medicationName;
    this.date = date;
    this.time = time;
  }

  public Long getId() {
    return id;
  }

  public String getMedicationName() {
    return medicationName;
  }

  public String getDate() {
    return date;
  }

  public String getTime() {
    return time;
  }

}


