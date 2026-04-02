# Variables y Tipos de Datos
# 💡 Concepto General

Una **variable** es un **nombre que usamos para guardar información en memoria**.

Los **tipos de datos** determinan:

- qué tipo de valor se almacena
- qué operaciones se pueden realizar con ese valor

<aside>

> En programación, todo valor tiene un tipo, aunque el lenguaje no siempre lo muestre explícitamente.
> 
</aside>

---

# ⚙️ Variables en JavaScript

En JavaScript las variables se declaran principalmente con:

- `let`
- `const`

### Ejemplo

```jsx
let edad = 30;
let nombre = "Hackerman";
let activo = true;
```

### Diferencia entre `let` y `const`

| Declaración | Uso |
| --- | --- |
| `let` | Variable que puede cambiar |
| `const` | Valor que no debe cambiar |

Ejemplo:

```jsx
let contador = 1;
contador = 2; // permitido

const pi = 3.1416;
// pi = 4; ❌ error
```

---

# 🧠 Tipado en JavaScript

JavaScript tiene **tipado dinámico**.

Esto significa que el tipo se determina **en tiempo de ejecución**.

```jsx
let valor = 10;       // number
valor = "texto";      // ahora string
valor = true;         // ahora boolean
```

---

## 📋 Características del tipado en JavaScript

| Característica | Descripción |
| --- | --- |
| Tipado dinámico | El tipo se define cuando se ejecuta el programa |
| Tipado débil | JavaScript puede convertir tipos automáticamente |
| Coerción de tipos | Puede transformar valores sin que el programador lo indique |

---

# 🧮 Tipos de datos básicos en JavaScript

| Tipo | Ejemplo | Descripción | Uso común |
| --- | --- | --- | --- |
| `number` | `let edad = 30` | Números enteros o decimales | cálculos |
| `string` | `"Hola"` | Texto | nombres, mensajes |
| `boolean` | `true` / `false` | Valores lógicos | condiciones |
| `undefined` | variable sin valor | valor no definido | inicialización |
| `null` | ausencia intencional | sin valor | limpiar variables |

---

## Ejemplo

```jsx
let edad = 25;          // number
let nombre = "Ana";     // string
let activo = true;      // boolean
let dato;               // undefined
let valor = null;       // null
```

---

# 🔄 Conversión de tipos (Type Conversion)

En JavaScript los tipos pueden convertirse de forma:

- **explícita**
- **automática**

---

## Conversión explícita

```jsx
let x = "10";

let numero = Number(x);   // "10" → 10
let texto = String(100);  // 100 → "100"
let decimal = Number("3.14");
```

---

## Conversión automática (coerción)

JavaScript puede convertir tipos automáticamente.

```jsx
console.log("5" + 5); // "55"
console.log("5" - 5); // 0
```

Esto ocurre porque JavaScript intenta **adaptar los tipos automáticamente**.

---

# 🧩 Comparación entre lenguajes

| Lenguaje | Tipado | Verificación | Ejemplo `"5" + 2` | Resultado |
| --- | --- | --- | --- | --- |
| JavaScript | Débil / Dinámico | En ejecución | `"5" + 2` | `"52"` |
| Python | Fuerte / Dinámico | En ejecución | `"5" + 2` | Error |
| Java | Fuerte / Estático | En compilación | `"5" + 2` | `"52"` |

---

### 🌐 JavaScript

```jsx
console.log("5" + 5); // "55"
console.log("5" - 5); // 0
```

---

### 🐍 Python

```python
print("5" + str(5))
```

---

### ☕ Java

```java
int x = 5;
String s = "5" + x;
```

---

# 🧠 Variables y memoria en JavaScript

En JavaScript una variable **no guarda el valor directamente**, sino una **referencia al valor en memoria**.

Ejemplo con objetos:

```jsx
let lista = [1,2,3];
let otraLista = lista;

otraLista.push(4);

console.log(lista); // [1,2,3,4]
```

Ambas variables apuntan al **mismo objeto en memoria**.

---

# 🧰 Buenas prácticas para nombres de variables

| Recomendado | Evitar |
| --- | --- |
| `userAge` | `x` |
| `totalPrice` | `dato1` |
| `isActive` | `a` |

---

## Convenciones en JavaScript

| Convención | Uso |
| --- | --- |
| camelCase | variables y funciones |
| PascalCase | clases |
| UPPER_CASE | constantes globales |

Ejemplo:

```jsx
let userAge = 30;
let totalPrice = 100;

class UserAccount {}

const MAX_USERS = 100;
```

---

# 🧩 Mostrar información en pantalla

En JavaScript usamos `console.log()` para imprimir valores.

```jsx
let nombre = "Hackerman";
let edad = 30;

console.log("Hola " + nombre);
console.log("Edad:", edad);
```

---

## Template strings (mejor práctica)

```jsx
let nombre = "Hackerman";
let edad = 30;

console.log(`Hola ${nombre}, tienes ${edad} años`);
```

Las **template strings** usan:

```jsx
``
${variable}
```

---

# 🧠 Resumen Técnico

| Aspecto | JavaScript | Python | Java |
| --- | --- | --- | --- |
| Declaración | `let x = 5` | `x = 5` | `int x = 5` |
| Tipado | Débil / Dinámico | Fuerte / Dinámico | Fuerte / Estático |
| Verificación | En ejecución | En ejecución | En compilación |
| Conversión | Automática o explícita | Explícita | Controlada |
| Todo es objeto | Casi todo | Sí | No |

---

# 💬 Recordatorio

<aside>
💡

> 
> 
> 
> En JavaScript los tipos pueden cambiar durante la ejecución del programa
> 
</aside>

Esto da mucha **flexibilidad**, pero también puede generar **errores si no se controla bien**.

Por eso es importante:

- nombrar bien las variables
- saber qué tipo de dato estás usando
- evitar depender demasiado de conversiones automáticas.
