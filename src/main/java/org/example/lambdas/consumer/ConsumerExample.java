package org.example.lambdas.consumer;

public class ConsumerExample {
        public static void main(String[] args) {
          /*Consumer recibe un valor y no retorna nada*/
            java.util.function.Consumer<String> consumer =(params)-> System.out.println(params);

            consumer.accept("Santiago");
        }
    }

