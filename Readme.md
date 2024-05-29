# Ordenador de Numeros
## Requiered
- Visual Studio
- Java JDK

<hr>
<br>

### Contexto

Aplicativo para ordenación de números de manera ascendente y/o descendente. 

### Criterios

- El usuario define la cantidad de numeros a ordenar.
- Ingresa los numeros a ordenar.
- Elige el orden ascendente o descendente.

### Desarrollo
Clases:
- Se importa la clase java.util.Scanner para la captura de los datos.

Definición de las variables claves y arreglo
- Tipo entero 
- numberLot: captura la cantidad de datos y define el tamaño del arreglo.
- Arreglo numbers: Captura los diferentes datos a ordenar.

Captura de datos y Restriccion del número 4:
- Mediante un bucle for se llena el arreglo incluyendo un condicional para impedir guardar el número 4.

Elección del Orden:
- Mediante uso de un condicional el usuario elige una opcion dentro de una lista.

Método de Ordenación
- Se definen dos variables tipo entero que inician en 0.
Mediante el uso del bucle for, el sistema compara los numeros guardados en las posiciones 0 y 1 para determinar si es mayor o menor que según el orden y en su efecto se intercambian hasta que se cumpla el ciclo del bucle. Este proceso se realiza hasta comparar todas las posiciones de los arreglos.
- Se imprime el arreglo numbers. 