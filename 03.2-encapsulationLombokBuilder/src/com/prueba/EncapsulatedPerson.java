package com.prueba;

import lombok.Builder;
import lombok.Getter;

/* File name : EncapsulatedPerson.java */
@Builder
@Getter
public class EncapsulatedPerson {

  private String name;
  private String idNum;
  private int age;
}