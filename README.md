# Algoritmos de Pilas

Este proyecto corresponde a la **Semana 4** del curso *Estructuras de Datos y Análisis de Algoritmos* del programa de Ingeniería de Software en UNIMINUTO. El trabajo consistió en desarrollar una simulación del almacenamiento de contenedores en una bodega, aplicando el principio de funcionamiento de una **estructura de datos tipo pila (LIFO)**.

El programa fue desarrollado en **Java**, usando el paradigma de programación orientado a objetos y la clase `Stack` para representar las pilas físicas que se encuentran en una bodega real.

---

## 👨‍💻 Autor

**Gehiner Ferley Sierra Rincón**  
ID: 997326

---

## 📚 Curso

**NRC-7848 – Estructuras de Datos y Análisis de Algoritmos**  
**Docente**: Ricardo Antonio Botero Ríos

---

## 🏛️ Institución

**Corporación Universitaria Minuto de Dios**  
Rectoría UNIMINUTO Virtual  
Centro Universitario Virtual  
Programa Ingeniería de Software

**Abril de 2025**

---

## 🧠 Descripción del proyecto

El sistema simula una bodega con una capacidad limitada, dividida en varias pilas. A través de un menú interactivo, el usuario puede:

- Ingresar contenedores identificados por un ID y un nombre de producto.
- Visualizar la organización actual de los contenedores en la bodega.
- Retirar contenedores por ID, reorganizando temporalmente los que están encima.
- Generar mensajes de error cuando se intenta superar la capacidad o retirar un ID inexistente.

Este ejercicio permitió aplicar el conocimiento sobre estructuras de datos no lineales y comprender la lógica detrás de operaciones básicas como *push*, *pop* y *peek*.

---

## 🧩 Estructura del código

El código está organizado en tres clases principales:

- `Contenedor.java`: Modelo de objeto contenedor (ID y producto).
- `Bodega.java`: Lógica de almacenamiento, ingreso, retiro y visualización.
- `Main.java`: Menú interactivo y control del flujo principal.

---

## ▶️ Ejecución

Para compilar y ejecutar el programa:

```bash
javac Main.java
java Main
