# Introducción a la Programación

## 🧭 **1. Propósito general**

<aside>

> Aprender a pensar como programador, entender cómo los lenguajes comunican instrucciones al computador y reconocer que la clave no es memorizar, sino entender la lógica detrás del código.
> 
</aside>

---

## 🧩 **2. Niveles de lenguaje**

### 🔽 Bajo nivel

- Cercano al hardware (máquina/ensamblador).
- Muy rápido ⚡ pero poco legible 🤯.
- Usado en sistemas embebidos o controladores.

### ⚙️ Medio nivel

- Ejemplo: **C / C++**.
- Equilibran control y legibilidad.

Permiten controlar memoria y hardware.

### 🔼 Alto nivel

- Ejemplo: **Python, Java, JavaScript, C#, Go, Rust.**
- Más lentos, pero mucho más productivos.

Son lenguajes más cercanos al lenguaje humano y permiten desarrollar aplicaciones más rápido.

<aside>
💡

> JavaScript fue creado para que los navegadores puedan ejecutar lógica directamente en las páginas web.
> 
</aside>

<aside>
💡

> “C y C++ son un puente entre hardware y lógica. Python está más cerca de nosotros.”
> 
</aside>

---

## 🧠 **3. Qué es un programa**

<aside>

Un programa es una serie de instrucciones que un computador ejecuta paso a paso.

</aside>

Ejemplo en JavaScript:

```jsx
console.log("Hola mundo");
```

Esto le dice al computador:

1. ejecutar `console.log`
2. mostrar texto en la consola

<aside>
💡

> El computador **no interpreta contextos** ni ambigüedades: hace exactamente lo que se le dice.
> 
</aside>

<aside>
💡

> Cada lenguaje tiene su **propia sintaxis**, pero comparten principios comunes: variables, funciones, condicionales, ciclos.
> 
</aside>

---

## 🧩 **4. Lógica de programación**

<aside>
💡

> La lógica de programación consiste en **ordenar instrucciones para resolver un problema**.
> 
</aside>

La lógica de programación consiste en **ordenar instrucciones para resolver un problema**.

Patrón universal:

```
**Entrada → Proceso → Salida**
```

Ejemplo web:

- Entrada: Usuario hace clic en un botón.
- Proceso: JavaScript procesa la acción.
- Salida : Aparece un mensaje en pantalla.

---

## 🔢 **5. Algoritmos y pseudocódigo**

| Concepto | Descripción |
| --- | --- |
| **Algoritmo** | Conjunto de pasos finitos y ordenados para resolver un problema. |
| **Pseudocódigo** | Representación escrita del algoritmo en lenguaje natural (sin sintaxis de programación). |

**Ejemplo de pseudocódigo:**

```markdown
Inicio
	Leer año_actual
	Leer año_nacimiento
	edad ← año_actual - año_nacimiento
	Escribir "La edad es:", edad
Fin
```

```jsx
let nombre = prompt("¿Cómo te llamas?");
console.log("Hola " + nombre);
```

<aside>
💡

> El pseudocódigo es el puente entre la idea y el programa.
> 
</aside>

---

## ⚙️ **6. Mentalidad del programador**

Un desarrollador no necesita saber todo.

Lo importante es saber:

- investigar
- probar
- fallar
- ajustar

Habilidades clave:

🧠 pensamiento lógico

🔎 investigación

🧩 dividir problemas grandes en pequeños

---

## 💬 **7. “¡Hola, Mundo!”en JavaScript, mi primer paso como Dev**

<aside>
💡

> El clásico programa que imprime texto en pantalla.
> 
> 
> Sirve para aprender la **sintaxis básica** de cualquier lenguaje.
> 
</aside>

---

Es el primer programa que normalmente se escribe al aprender un lenguaje.

Sirve para comprobar que **todo funciona correctamente**.

---

### Node.js

```jsx
console.log("Hola mundo");
```

---

### Navegador

```jsx
alert("Hola mundo");
```

---

### 🌍 **Ejemplos en múltiples lenguajes**

### 🌐 **JavaScript (Node.js)**

```jsx
console.log("Hola, mundo");
```

### 🐍 **Python**

```python
print("Hola, mundo")
```

### ☕ **Java**

```java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hola, mundo");
  }
}
```

### ⚙️ **C**

```c
#include <stdio.h>

int main() {
  printf("Hola, mundo\n");
  return 0;
}
```

### 💻 **C#**

```csharp
using System;

class Program {
  static void Main() {
    Console.WriteLine("Hola, mundo");
  }
}
```

### 🌀 **Go**

```go
package main
import "fmt"

func main() {
  fmt.Println("Hola, mundo")
}
```

### 🦀 **Rust**

```rust
fn main() {
  println!("Hola, mundo");
}
```

### ⚙️ Assembly

```nasm
section .data
    msg db "Hola, mundo", 10
    len equ $ - msg

section .text
    global _start

_start:
    mov rax, 1      ; syscall: write
    mov rdi, 1      ; file descriptor: stdout
    mov rsi, msg    ; dirección del mensaje
    mov rdx, len    ; longitud del mensaje
    syscall

    mov rax, 60     ; syscall: exit
    xor rdi, rdi    ; código de salida 0
    syscall
```

---

## 🧩 **8. Ideas para reforzar**

| Tema | Idea clave | Aplicación práctica |
| --- | --- | --- |
| **Lenguajes** | Cada lenguaje tiene su sintaxis, pero el pensamiento es el mismo. | Aprende la lógica, no solo las palabras. |
| **Lógica** | Pensar paso a paso. | Divide los problemas grandes en partes pequeñas. |
| **Algoritmos** | Resolver con estructura. | Diseña antes de programar. |
| **Pseudocódigo** | Escribir con claridad. | Usa lenguaje natural para planear tu código. |
| **Hola Mundo** | Entender la base del lenguaje. | Ver cómo se comunica cada lenguaje con la máquina. |
| **Mindset** | Aceptar lo desconocido y aprender rápido. | Google, Stack Overflow, documentación. |

---

## 🧭 **9. Frases clave para recordar**

- “El computador no piensa, ejecuta instrucciones.”
- “No existe un lenguaje mejor: existe el adecuado para cada tarea.”
- “Primero la lógica, después el código.”
- “Los errores son mensajes de aprendizaje.”

*fuente: https://righteous-baron-17e.notion.site/Introducci-n-a-la-Programaci-n-31e4db47a2558006870dd1db0ce75430*
