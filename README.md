# Proyecto de Ejemplos de Lambda y Streams en Java

Este proyecto contiene ejemplos básicos de cómo utilizar expresiones lambda y la API de Streams en Java. Los ejemplos están organizados en diferentes clases que demuestran el uso de interfaces funcionales como `Supplier`, `Function`, `BiConsumer` y `BiFunction`.

## Requisitos

- Java 17 o superior
- Maven

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes y clases:

- `org.example.lambdas.Supplier`
  - `SuplierExample.java`: Demuestra el uso de la interfaz `Supplier` que no recibe valores y retorna un valor.
  
- `org.example.lambdas.Function`
  - `FunctionExample.java`: Demuestra el uso de la interfaz `Function` que recibe un valor y retorna un valor.
  
- `org.example.lambdas.BiConsumer`
  - `BiConsumerExample.java`: Demuestra el uso de la interfaz `BiConsumer` que recibe dos valores y no retorna nada.
  
- `org.example.lambdas.BiFunction`
  - `BiFunctionExample.java`: Demuestra el uso de la interfaz `BiFunction` que recibe dos valores y retorna un valor.

## Ejecución

Para ejecutar los ejemplos, puedes usar el siguiente comando de Maven:

```sh
mvn exec:java -Dexec.mainClass="org.example.lambdas.<NombreClase>"
```

Reemplaza `<NombreClase>` con el nombre de la clase que deseas ejecutar, por ejemplo, `Supplier.SuplierExample`.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un issue o un pull request para discutir cualquier cambio que desees realizar.
