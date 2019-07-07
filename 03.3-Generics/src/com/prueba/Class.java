
package com.prueba;

// CLASS VARIABLE
public class Class {

  public static <T> String addOne(T param) {
    if(param instanceof String) {
      param = (T) ((String) param).concat("añado uno");
    } else if(param instanceof Integer) {
    }
    return param.toString();
  }

  public static void main(String[] args) {
    
    String hola = "";
    hola = addOne(hola);
  }
}