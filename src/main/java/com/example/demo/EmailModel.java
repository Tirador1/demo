package com.example.demo;

public class EmailModel {
  private int id;
  private int ammount;

  public EmailModel(int id, int ammount) {
    this.id = id;
    this.ammount = ammount;
  }

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public int getAmmount() {
    return ammount;
  }
  public void setAmmount(int ammount) {
    this.ammount = ammount;
  }

}
