package br.com.ead.senac.healthapp.model;

import org.springframework.format.annotation.DateTimeFormat;

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

  public void setMedicationName(String medicationName) {
    this.medicationName = medicationName;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public void setId(Long id) {
    this.id = id;
  }
}


