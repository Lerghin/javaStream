package org.example.lambdas.suplier;

import java.util.function.Supplier;

public class SuplierExample {

    public static void main(String[] args) {
        /*Suplier no recibe valores y retorna un valor*/
     Supplier<String> supplier = ()-> "Hola, soy un Supplier";
      String result= supplier.get();
      System.out.println(result);
    }

}
