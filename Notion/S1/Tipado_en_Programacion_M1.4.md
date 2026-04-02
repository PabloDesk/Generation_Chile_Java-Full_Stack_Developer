# Tipado en Programación

---

## Fuerte vs Débil — Estático vs Dinámico

<aside>

> 🎯 **Objetivo**
> 
> 
> Comprender cómo los lenguajes manejan los **tipos de datos** y cómo esto afecta la forma en que escribimos código.
> 
</aside>

Durante el bootcamp trabajaremos principalmente con:

- **JavaScript**
- **Java**

Por lo tanto, entender cómo manejan los tipos **evita muchos errores comunes**.

---

# 💡 Idea clave

En programación, cada valor tiene un **tipo de dato**.

Por ejemplo:

| Valor | Tipo |
| --- | --- |
| `5` | número |
| `"Hola"` | texto |
| `true` | booleano |

El sistema de tipos de un lenguaje define:

- cómo se **guardan los datos**
- qué **operaciones son válidas**
- cuándo se detectan **errores**

---

# 🧩 Dos dimensiones del tipado

Existen **dos conceptos diferentes** que muchas veces se confunden.

| Dimensión | Pregunta que responde |
| --- | --- |
| **Fuerte vs Débil** | ¿El lenguaje convierte tipos automáticamente? |
| **Estático vs Dinámico** | ¿Cuándo se verifica el tipo? |

---

# ⚙️ Tipado fuerte vs débil

## 💪 Tipado fuerte

Un lenguaje **no permite mezclar tipos incompatibles sin conversión explícita**.

El programador debe indicar claramente la conversión.

### Ejemplo en Python

```python
print("5" + 5)      # ❌ Error
print("5" + str(5)) # ✅ "55"
```

Beneficios:

- menos errores inesperados
- comportamiento más predecible

---

## 🔄 Tipado débil

El lenguaje puede **convertir automáticamente** los tipos.

Esto se llama **coerción de tipos**.

### Ejemplo en JavaScript

```jsx
console.log("5" + 5); // "55"
console.log("5" - 1); // 4
```

El lenguaje intenta **adaptar los tipos automáticamente**.

Ventaja:

- rapidez para escribir código

Riesgo:

- resultados inesperados si no se conocen las reglas.

---

# 🧠 Tipado estático vs dinámico

## 🏗 Tipado estático

Los tipos se verifican **antes de ejecutar el programa**, normalmente durante la compilación.

Ejemplo en **Java**:

```java
int edad = 30;
String nombre = "Hackerman";

// edad = "treinta"; ❌ error de compilación
```

Ventajas:

- errores detectados antes de ejecutar
- mejor autocompletado
- mayor seguridad en programas grandes

---

## ⚡ Tipado dinámico

El tipo se determina **cuando el programa se ejecuta**.

Ejemplo en **JavaScript**:

```jsx
let valor = 10;
valor = "texto";
valor = true;
```

La variable puede cambiar de tipo durante la ejecución.

Ventajas:

- flexibilidad
- rapidez para prototipos

Desventaja:

- algunos errores aparecen solo al ejecutar el programa.

---

# 🌍 Comparación entre lenguajes del bootcamp

| Lenguaje | Fortaleza | Momento del tipo | Notas |
| --- | --- | --- | --- |
| JavaScript | Débil (con coerción) | Dinámico | Conversión automática frecuente |
| Java | Fuerte | Estático | Tipos definidos antes de ejecutar |
| Python | Fuerte | Dinámico | Conversión explícita |

💡 Nota importante:

Los términos **“fuerte” y “débil”** no tienen una única definición universal.

Aquí los usamos como una forma práctica de describir **cuánta conversión automática permite el lenguaje**.

---

# ⚠️ Trampas comunes en JavaScript

JavaScript puede realizar conversiones automáticas que sorprenden a principiantes.

### Concatenación

```jsx
console.log("10" + 2); // "102"
```

### Operaciones matemáticas

```jsx
console.log("10" - 2); // 8
```

### Comparaciones

```jsx
console.log("5" == 5);  // true
console.log("5" === 5); // false
```

`==` permite conversión automática

`===` compara **tipo y valor**

<aside>
💡

> 👉 **Buena práctica en JavaScript:** usar siempre `===`.
> 
</aside>

---

# 🧩 Conversión explícita de tipos

Cuando el significado puede ser ambiguo, es mejor **convertir manualmente**.

### JavaScript

```jsx
let numero = Number("10");
let texto = String(100);
```

### Java

```java
int numero = Integer.parseInt("10");
String texto = String.valueOf(100);
```

---

# 🧪 Práctica guiada

## 1️⃣ Predice el resultado

Antes de ejecutar, intenta adivinar la salida.

### JavaScript

```jsx
console.log("10" + 5);
console.log("10" - 5);
console.log(true + 1);
```

### Java

```java
int x = 5;
String resultado = "10" + x;
System.out.println(resultado);
```

---

## 2️⃣ Corrige el código

Convierte correctamente los tipos.

### JavaScript

```jsx
let edad = prompt("Edad:");
let total = edad + 10;
```

Solución esperada:

```jsx
let edad = Number(prompt("Edad:"));
let total = edad + 10;
```

---

# 🧠 Regla práctica del programador

Si el significado puede ser ambiguo…

👉 **convierte el tipo tú mismo.**

Esto hace el código:

- más claro
- más seguro
- más predecible

---

# 🔑 Conceptos clave

| Concepto | Significado |
| --- | --- |
| Tipado fuerte | No mezcla tipos sin conversión |
| Tipado débil | Permite conversiones automáticas |
| Tipado estático | Tipos verificados antes de ejecutar |
| Tipado dinámico | Tipos determinados durante ejecución |
| Coerción | Conversión automática de tipos |

---

# 💬 Mantra del programador

🧠 Los tipos importan.

🔍 Entender cómo funciona el tipado evita muchos bugs.

🧱 Código claro siempre es mejor que código “mágico”.


