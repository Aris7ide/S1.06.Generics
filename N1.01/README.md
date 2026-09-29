# Ejercicio 1 — Clase sin genéricos

## 📌 Enunciat del exercici
En este nivel te introducirás en los conceptos fundamentales de los genéricos. Aprenderás a crear clases y métodos que trabajen con cualquier tipo de datos , y observarás cómo Java gestiona la tipificación flexible pero segura .

## ✨ Funcionalitats
- 

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Ejercicio 1
#### Crea una clase llamada NoGenericMethodsque almacene tres argumentos del mismo tipo , junto con:

#### un constructor que los inicialice,
#### y métodos getElement1(), getElement2(), getElement3()para acceder a ellos.
#### Comprueba que puedes pasar los argumentos en cualquier orden al constructor.

#### Este ejercicio sirve para comparar después el comportamiento con una versión genérica.
- he creado la clase NoGenericMethods, almacenando tres elementos String
- he comprobado con un test que se pueden pasar los argumentos en cualquier orden

##  Ejercicio 2
#### Crea una clase Personcon los atributos name, surnamey age. Después, crea una clase llamada GenericMethodscon un método genérico llamado printElements()que acepte tres argumentos de tipo genérico y los imprima por pantalla.

#### Al main()de la clase principal, llama a este método con diferentes tipos de parámetros (por ejemplo: un objeto Person, uno Stringy un valor numérico primitivo).

#### Con este ejercicio verificarás que los métodos genéricos pueden aceptar cualquier combinación de tipos y en cualquier orden.
- he creado la clase Person y la clase GenericMethod
- in GenericMethod he creado un metodo que usa <T,U,V> y enseña en pantalla tres elementos que le pasamos
- desde el main he llamado el metodo pasando diferentes elementos, incluido el Person person y le da igual que le pasamos.
