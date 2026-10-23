# ☕ Java en práctica | Métodos y objetos

> Ocho ejercicios para practicar cómo crear métodos, enviar datos, devolver resultados y trabajar con objetos en Java.

## 📚 Sobre esta práctica

Este repositorio reúne los ejercicios de la **APE: Práctica Evaluativa — Clase Producto y Competencia Final**.

Cada ejercicio está presentado en un PDF independiente con su **enunciado y solución en Java**. Los códigos incluyen un método `main` para probar su funcionamiento.

## 🎯 Objetivo

Fortalecer los fundamentos de programación orientada a objetos mediante ejercicios de métodos, parámetros, tipos de retorno, validaciones e instanciación.

## 🧩 Ejercicios

| N.º | Ejercicio | ¿Qué se practica? |
| :---: | --- | --- |
| 01 | 📐 Tipos de retorno | Corregir un método que calcula el área y devolver el resultado con `double` y `return`. |
| 02 | 👋 Bienvenida | Crear un método `void` que reciba un nombre y una edad e imprima un saludo. |
| 03 | 🔢 Parámetros y argumentos | Diferenciar los parámetros `x`, `y` de los argumentos `4.0`, `5.5`. |
| 04 | 📦 Paso por valor | Comprobar por qué modificar un parámetro `int` no cambia la variable original. |
| 05 | 📝 Calcular promedio | Recibir tres notas y retornar su promedio. |
| 06 | ✅ Validar edad | Usar condiciones y un retorno `boolean` para validar edades entre 0 y 120. |
| 07 | 🛒 Clase Producto | Completar los atributos y el método que calcula el valor del inventario. |
| 08 | 🚀 Instanciación y main | Crear un objeto, asignar atributos, invocar un método y mostrar su resultado. |

## 🛠️ Conceptos aplicados

- **Clases y objetos:** definir una estructura y crear instancias con `new`.
- **Atributos:** almacenar información de un objeto.
- **Métodos:** organizar acciones y cálculos.
- **Parámetros y argumentos:** recibir y enviar información.
- **`void`:** declarar métodos que no devuelven un valor.
- **`return`:** finalizar un método y, cuando corresponde, devolver un resultado.
- **Tipos de datos:** trabajar con `String`, `int`, `double` y `boolean`.
- **Condicionales:** comprobar si los datos cumplen una condición.
- **Paso por valor:** entender que un parámetro recibe una copia del valor enviado.

## 💻 Cómo probar los códigos

1. Abre el PDF del ejercicio que deseas practicar.
2. Crea un proyecto Java en tu entorno de desarrollo.
3. Crea el archivo con el mismo nombre de la clase pública. Por ejemplo: `Bienvenida.java`.
4. Copia el código de la sección **Código Java · Solución**.
5. Ejecuta el método `main` y revisa el resultado en la consola.
6. Cambia los valores de prueba para observar cómo responde el programa.

> **Importante:** prueba cada ejercicio por separado. Algunos utilizan nombres de clase repetidos, como `Calculadora` y `Producto`.

## 🧪 Pruebas para practicar

| Ejercicio | Datos de prueba | Resultado esperado |
| --- | --- | --- |
| Área | Base `4.5` y altura `3.0` | `13.5` |
| Multiplicación | `4.0` y `5.5` | `22.0` |
| Paso por valor | `numero = 10` | La variable original conserva el valor `10`. |
| Promedio | Notas `8`, `9` y `10` | `9.0` |
| Validación de edad | Edad `19` | `true` |
| Validación de edad | Edad `-1` o `121` | Imprime `"Edad inválida"` y devuelve `false`. |
| Inventario | Stock `10` y precio unitario `25.5` | `255.0` |
 
Universidad Técnica de Ambato · Software

---

⭐ **La práctica consiste en entender el código, modificarlo y comprobar qué sucede.**
