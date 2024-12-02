# Proyecto de Ejemplo: Clases Genéricas en Java

## Introducción
Este proyecto demuestra el uso de **clases genéricas** en Java mediante ejemplos prácticos. Las clases genéricas permiten trabajar con diferentes tipos de datos sin necesidad de definir explícitamente un tipo específico, aumentando la flexibilidad y reutilización del código.

---

## Definición de datos y clases genéricas

### Clase `Repository<T>`
- **Definición**: Es una clase genérica que actúa como un repositorio para almacenar y recuperar elementos de cualquier tipo.
- **Genérico**: El parámetro `<T>` representa el tipo de dato que el repositorio manejará.
- **Métodos**:
  - `add(T item)`: Agrega un elemento al repositorio.
  - `getAll()`: Devuelve una lista de todos los elementos almacenados.

### Clase `Pair<K, V>`
- **Definición**: Es una clase genérica que almacena un par de valores relacionados.
- **Genéricos**:
  - `<K>`: Representa la clave.
  - `<V>`: Representa el valor.
- **Métodos**:
  - `getKey()`: Devuelve la clave.
  - `getValue()`: Devuelve el valor.

---

## Ejemplo de ejecución
El proyecto incluye ejemplos prácticos en la clase `Main.java`, tales como:
1. Crear un repositorio de usuarios (`Repository<User>`).
2. Agregar usuarios al repositorio y listarlos.
3. Crear y trabajar con un objeto `Pair<Integer, String>`.

---

## Interpretación de las clases genéricas
### Ventajas
1. **Flexibilidad**: Se pueden utilizar con cualquier tipo de dato sin necesidad de duplicar código.
2. **Seguridad en tiempo de compilación**: Previenen errores de tipo mediante el uso de parámetros genéricos.
3. **Reutilización del código**: Pueden reutilizarse con diferentes tipos de datos.

En este ejemplo, se usa la clase genérica `Repository` para manejar datos de tipo `User` y la clase `Pair` para manejar pares de valores relacionados. Esto demuestra cómo las clases genéricas simplifican el desarrollo de software modular y reutilizable.
