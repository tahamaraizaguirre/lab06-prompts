# Bitacora de prompts

Laboratorio 06: Fundamentos de Ingenieria de Prompts. Herramienta de IA usada: (escribe aqui cual usaste) 
## Ejercicio 2: Tokens y ventana de contexto
Al repetir la misma pregunta en un chat nuevo, la IA sí reconoció la información de mi chat anterior y respondió teniendo en cuenta ese contexto.
Esto indica que probablemente estaba activa una función de memoria entre chats

| Texto | Caracteres | Tokens |
|---|---:|---:|
| Los estudiantes programan en Java. | 34 | 7 |
| The students program in Java. | 29 | 6 |
| desafortunadamente | 18 | 3 |
| **Total** | 81 | 16|


## Ejercicio 3: Temperatura

| Temperatura | % de BiblioTec | Nombres en los 5 intentos |
|-------------|----------------|---------------------------|
| 0 | 100,0% | BiblioTec, BiblioTec, BiblioTec, BiblioTec, BiblioTec |
| 0.5 | 65,3% | BiblioTec, BiblioTec, LibroYa, LibroYa, LibroYa |
| 1 | 44,5% | LibroYa, LibroYa, LibroYa, BiblioTec, BiblioTec |
| 1.8 | 32,2% | BiblioTec, LectoGo, PrestaLibro, LibroYa, LectoGo |

**Conclusión:**

Al subir la temperatura, los nombres son más variados y se repiten menos porque aumenta la probabilidad de elegir otras opciones.

El simulador nunca inventa nombres nuevos porque solo selecciona nombres de una lista que ya está definida.

## Ejercicio 4: Prompt vago vs estructurado 

| Criterio | Prompt vago | Prompt estructurado |
|---|---|---|
| Menciona el objetivo del sistema | Sí | Sí |
| Menciona a los usuarios principales | No | Sí |
| Tiene exactamente 3 funcionalidades | No | Sí |
| Está en 3 párrafos | No | Sí |
| Lo usaría en un informe real | No | Sí |

## Ejercicio 5: Anatomia de un prompt


| Componente | Texto de mi prompt |
|---|---|
| Rol | Actúa como desarrollador Java. |
| Instrucción | Crea un programa en Java para gestionar los productos de una tienda. |
| Contexto | Usando una clase Producto con los atributos codigo, nombre, precio y stock. |
| Ejemplo | Usa este estilo para los métodos: getPrecio(), setPrecio(double precio). |
| Formato | Explica primero la estructura de la clase y luego presenta el código Java. |

### Diferencia entre niveles

**Nivel 1:** La respuesta generó un programa básico en Java para gestionar productos de una tienda.

**Nivel 2:** Al agregar los atributos de la clase Producto, el código tuvo una estructura más específica y organizada.

**Nivel 3:** Al indicar el formato y dar ejemplos de métodos, la respuesta incluyó una explicación de la clase y un código con métodos get y set.
