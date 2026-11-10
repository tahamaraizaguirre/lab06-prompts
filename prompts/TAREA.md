
# Tarea: Mi prompt profesional

## Funcionalidad elegida

La funcionalidad elegida es un programa en Java para calcular las notas de estudiantes. El programa debe permitir ingresar tres notas, calcular el promedio y determinar si el estudiante está aprobado o desaprobado.


## Versión 1: prompt básico

### Prompt v1

```text
Crea un programa en Java para calcular notas de estudiantes.
```

### Resultado de la versión 1

Respuesta de la primera version:

```text
Ingrese el nombre del estudiante: Tahamara
Ingrese la primera nota: 20
Ingrese la segunda nota: 18
Ingrese la tercera nota: 19

--- RESULTADOS ---
Estudiante: Tahamara
Promedio: 19,00
```

**¿Qué cambié?**

Se utilizó una instrucción básica para solicitar un programa en Java.

**¿Por qué?**

Para observar cómo responde la IA cuando recibe una instrucción general sin muchos detalles.

**¿Qué mejoró en la respuesta?**

Se obtuvo una solución inicial para calcular notas, pero faltó indicar cómo determinar si el estudiante aprueba o desaprueba.



## Versión 2: prompt mejorado

### Prompt v2

```text
Actúa como desarrollador Java. Crea un programa de consola que permita registrar el nombre de un estudiante y sus tres notas de 0 a 20.

El programa debe calcular el promedio de las tres notas y mostrar si el estudiante está aprobado cuando obtiene 11 o más, o desaprobado cuando obtiene menos de 11.
```

### Resultado de la versión 2

Ejemplo de respuesta esperada:

```text
Ingrese el nombre del estudiante: Sophia
Ingrese la nota 1 (0-20): 18
Ingrese la nota 2 (0-20): 14
Ingrese la nota 3 (0-20): 20

--- RESULTADO ---
Estudiante: Sophia
Promedio: 17,33
Estado: APROBADO
```

**¿Qué cambié?**

Agregué el rol de desarrollador Java, el registro del nombre, el rango de notas y la condición para aprobar o desaprobar.

**¿Por qué?**

Porque el primer prompt era demasiado general y no explicaba todas las funcionalidades necesarias.

**¿Qué mejoró en la respuesta?**

La respuesta fue más específica, ya que ahora incluye el nombre del estudiante, el promedio y su estado académico.



## Versión 3: prompt final

### Prompt v3

```text
Actúa como desarrollador Java con experiencia en programación orientada a objetos.
Crea un programa de consola en Java que permita registrar estudiantes, calcular sus promedios y determinar si aprobaron o desaprobaron.
El programa será utilizado para registrar las calificaciones de estudiantes de un instituto. Cada estudiante tiene un código, nombre y tres notas entre 0 y 20. El promedio se calcula sumando las tres notas y dividiendo el resultado entre 3. Un estudiante aprueba si su promedio es mayor o igual a 11.

Ejemplo:
Si el estudiante tiene el código E001, nombre Carlos y las notas 15, 12 y 18, el resultado debe mostrar:

Código: E001
Nombre: Carlos
Promedio: 15.00
Estado: APROBADO

Explica primero los atributos y métodos de la clase Estudiante. Después, presenta el código Java completo.
Utiliza una clase Estudiante con métodos como calcularPromedio() y obtenerEstado(). Valida que las notas estén entre 0 y 20, muestra el promedio con dos decimales y no utilices librerías externas.
```

### Resultado de la versión 3

Ejemplo de ejecución:

```text
Ingrese código: T101
Ingrese nombre: Tahamara Sophia
Ingrese nota 1: 20
Ingrese nota 2: 12
Ingrese nota 3: 18

--- RESULTADO ---
Código: T101
Nombre: Tahamara Sophia
Promedio: 16.67
Estado: APROBADO
```


**¿Qué cambié?**

Agregué los cinco componentes del prompt: rol, instrucción, contexto, ejemplo y formato. También incluí una clase Estudiante y métodos específicos.

**¿Por qué?**

Para que la IA comprenda exactamente qué programa necesito, cómo debe funcionar y cómo debe presentar su respuesta.

**¿Qué mejoró en la respuesta?**

La respuesta esperada es más completa y organizada. Incluye programación orientada a objetos, validación de notas, cálculo del promedio y estado académico.

## Componentes del prompt final

| Componente | Texto de mi prompt |
|---|---|
| Rol | Actúa como desarrollador Java con experiencia en programación orientada a objetos. |
| Instrucción | Crea un programa de consola en Java que permita registrar estudiantes, calcular sus promedios y determinar si aprobaron o desaprobaron. |
| Contexto | El programa será utilizado para registrar las calificaciones de estudiantes de un instituto. Cada estudiante tiene un código, nombre y tres notas entre 0 y 20. |
| Ejemplo | Si el estudiante tiene el código E001, nombre Carlos y las notas 15, 12 y 18, debe mostrar un promedio de 15.00 y el estado APROBADO. |
| Formato | Explica primero los atributos y métodos, después presenta el código Java completo y finalmente muestra un ejemplo de ejecución. |

### Restricciones utilizadas

- No utilizar librerías externas.
- Validar que las notas estén entre 0 y 20.
- Utilizar una clase Estudiante

## Evaluación del resultado

La siguiente tabla compara los requisitos solicitados en cada versión del prompt y el resultado esperado.

| Criterio | V1 | V2 | V3 |
|---|---|---|---|
| Indica el lenguaje Java | Sí | Sí | Sí |
| Define el rango de notas | No | Sí | Sí |
| Calcula el promedio | Sí | Sí | Sí |
| Determina si aprueba o desaprueba | No | Sí | Sí |
| Utiliza una clase Estudiante | No | No | Sí |
| Solicita validación de notas | No | No | Sí |
| Incluye un ejemplo de resultado | No | No | Sí |
| Especifica el formato de respuesta | No | No | Sí |
| Incluye restricciones | No | No | Sí |

## Errores que evité

### 1. Ser demasiado general

En la primera versión solamente solicité un programa para calcular notas, sin explicar qué datos debía registrar ni cómo determinar el estado del estudiante.

**¿Cómo lo evité?**

En las siguientes versiones agregué el registro de datos, las tres notas, el cálculo del promedio y la condición para aprobar o desaprobar.

### 2. No indicar el formato

En las primeras versiones no expliqué cómo quería recibir la respuesta de la IA, por lo que podía mostrar solamente el código sin una explicación.

**¿Cómo lo evité?**

En el prompt final indiqué que primero debía explicar los atributos y métodos, después mostrar el código Java completo y finalmente presentar un ejemplo de ejecución.