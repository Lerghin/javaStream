package org.example.lambdas.unary;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {


    /* Recibe un valor, lo procesa y devuelve un resultado del mismo tipo */

  public static void main (String[] args) {
      UnaryOperator<Integer> unaryOperator=(number)->{
      return number*number;
      };
      int result= unaryOperator.apply(10);
      System.out.println(result);
  }

}
