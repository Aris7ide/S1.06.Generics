# Ejercicio 1 — Genéricos con tipos acotados ('bounded types')

## 📌 Enunciat del exercici
En este nivel combinarás genéricos avanzados con interfaces , limitaciones de tipos ( bounded types) y polimorfismo. Simularás un ejemplo real con dispositivos que pueden realizar llamadas y fotos.

Ejercicio 1 — Genéricos con tipos acotados ('bounded types')
Crea una interfaz llamada Phonecon el método call().

Después, crea tres clases:

- Smartphone, que implementa Phone y añade el método takePhoto().
- GenericUtils, con dos métodos genéricos :
- El primero, llamado usePhone(), acepta un argumento limitado por la interfaz Phone( T extends Phone) y llama al método call().
- El segundo, llamado useSmartphone(), acepta un argumento limitado por la clase Smartphone( T extends Smartphone) y llama tanto call()como takePhoto().
- Main, con el método main(), donde se crea un objeto de tipos Smartphoney se pasa a ambos métodos de la clase GenericUtils.

## ✨ Funcionalitats
- Polimorfismo
- Interfaces
- Bounded types

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Excecution
- creo la interfaz Phone
- creo Smartphone implementando Phone y el metodo takePhoto()
- he creado el util GenericUtils con dos metodos limitados a T extends Phone y T extends Smartphone