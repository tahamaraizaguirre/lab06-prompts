
# Tarea: Mi prompt profesional

## Funcionalidad 

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
