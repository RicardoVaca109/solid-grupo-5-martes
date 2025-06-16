# SOLID Principles Java Demos

Este repositorio contiene demostraciones prácticas en Java para entender, aplicar correctamente y profundizar en los *principios SOLID* en el desarrollo de software. Cada principio está representado en un proyecto independiente que incluye ejemplos prácticos, escenarios de antes y después de aplicar el principio, explicación detallada del código refactorizado, y código ejecutable con Maven para facilitar el aprendizaje y la comprensión.

## Tabla de contenidos

* [Descripción General](#descripción-general)
* [Objetivos del Proyecto](#objetivos-del-proyecto)
* [Requisitos Técnicos](#requisitos-técnicos)
* [Estructura del Proyecto](#estructura-del-proyecto)
* [Instalación](#instalación)
* [Guía de Ejecución de Proyectos](#guía-de-ejecución-de-proyectos)
* [Descripción Detallada de los Proyectos](#descripción-detallada-de-los-proyectos)

  * [Single Responsibility Principle (SRP)](#single-responsibility-principle-srp)
  * [Open/Closed Principle (OCP)](#openclosed-principle-ocp)
  * [Liskov Substitution Principle (LSP)](#liskov-substitution-principle-lsp)
  * [Interface Segregation Principle (ISP)](#interface-segregation-principle-isp)
  * [Dependency Inversion Principle (DIP)](#dependency-inversion-principle-dip)

## Descripción General

Los principios SOLID son esenciales para desarrollar software robusto, limpio, mantenible y escalable. Este repositorio tiene como objetivo brindar ejemplos prácticos y claros para ilustrar cómo identificar problemas de diseño comunes, cómo aplicar correctamente cada principio SOLID, y los beneficios inmediatos que trae su correcta implementación.

## Objetivos del Proyecto

* Facilitar el entendimiento práctico y teórico de los principios SOLID.
* Mostrar ejemplos concretos de código antes y después de aplicar cada principio.
* Proporcionar un entorno listo para ejecutar con Maven para verificar y probar ejemplos.
* Fomentar buenas prácticas de programación en la comunidad Java.

## Requisitos Técnicos

Para ejecutar estos proyectos necesitas:

* Java 17 o superior
* Maven 3.8 o superior

Verifica que tienes estos requisitos ejecutando:

bash
java --version
mvn --version


## Estructura del Proyecto

bash
solid-grupo-5-martes/
├── pom.xml
└── src/
    └── main/
        ├── srp/   # Single Responsibility Principle
        ├── ocp/   # Open/Closed Principle
        ├── lsp/   # Liskov Substitution Principle
        ├── isp/   # Interface Segregation Principle
        └── dip/   # Dependency Inversion Principle


Cada carpeta contiene archivos Java organizados y explicados, además de un Main.java que permite la ejecución directa del ejemplo.

## Instalación

Clona el repositorio:

bash
git clone https://github.com/RicardoVaca109/solid-grupo-5-martes.git

cd solid-grupo-5-martes


## Guía de Ejecución de Proyectos

Compilar todos los proyectos:

bash
mvn clean compile


Ejecutar un proyecto específico (por ejemplo, SRP):

bash
mvn exec:java -Dexec.mainClass=srp.Main


## Descripción Detallada de los Proyectos

### Single Responsibility Principle (SRP)

> *"Una clase debe tener una sola razón para cambiar."*

* *Problema*: Una sola clase realizando múltiples tareas (cálculo e impresión).
* *Solución*: Separar responsabilidades en clases específicas (Invoice y InvoicePrinter).

### Open/Closed Principle (OCP)

> *"Las entidades deben estar abiertas para extensión, pero cerradas para modificación."*

* *Problema*: Modificar clase existente cada vez que se añade un nuevo método de pago.
* *Solución*: Implementar interfaces y utilizar polimorfismo.

### Liskov Substitution Principle (LSP)

> *"Las clases derivadas deben ser sustituibles por sus clases base sin alterar el comportamiento."*

* *Problema*: Métodos inaplicables heredados por subclases (por ejemplo, peces intentando caminar).
* *Solución*: Interfaces específicas para comportamientos concretos.

### Interface Segregation Principle (ISP)

> *"Una clase no debe implementar interfaces que no utiliza."*

* *Problema*: Implementar métodos innecesarios por obligación de una interfaz genérica.
* *Solución*: Segregar interfaces según necesidades reales del dispositivo.

### Dependency Inversion Principle (DIP)

> *"Módulos de alto nivel no deben depender de módulos de bajo nivel, ambos deben depender de abstracciones."*

* *Problema*: Alta dependencia directa de implementaciones concretas.
* *Solución*: Aplicar abstracciones e inyección de dependencias para desacoplar componentes.

## Integrantes:
* Carlos Esteban Larco Escobar
* Andrei David Flores Espinoza
* Luis Elian Pineda Revelo
* Ricardo David Vaca Flores
