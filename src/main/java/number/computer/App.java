package number.computer;

import java.util.Scanner;



public final class App {
    private App() {
    }
    
       public static void main(String[] args) {
        System.out.println("ESTE UN PROGRAMA PARA ORDENAR NUMEROS!");
        Scanner lot = new Scanner(System.in);
       
        System.out.print("Cuantos numeros desea ordenar: ");
        int numberLot = lot.nextInt();
        int[] numbers = new int[numberLot];
       int num = numbers.length; //envia la longitud de la cadena string
        
        
for (int j=0; j < numberLot; j++) {
    System.out.print("Digite el numero " +(1+j)+ ": ");
    numbers[j] = lot.nextInt(); 
    if (numbers[j] == 4){ 
        j = j-1;
        System.out.println("Por politicas culturales del cliente este numero es inadmitido. Digite otro número por favor: ");
    }
} 
System.out.println("ELIGE EL ORDEN DE LOS NUMEROS:");
System.out.println("1. Orden Ascendente");
System.out.println("2. Orden Descendente");
System.out.print("Digita según la elección: ");
int orden = lot.nextInt();

 if (orden == 1) {
    System.out.println("La siguiente es la lista ordenada de manera ascendente:");  
       for (int a=0; a < num -1; a++) {
    
        for (int b=0; b < num - a - 1; b++) {
        if (numbers[b] > numbers[b + 1]) {
            int temp = numbers[b];
            numbers[b] = numbers[b + 1];
            numbers[b+1] = temp;
        }
         } 
        } 
    }

    if (orden == 2) {
        System.out.println("La siguiente es la lista ordenada de manera descendente:");  
        
        for (int a=0; a < num -1; a++) {
            for (int b=0; b < num - a - 1; b++) {
            if (numbers[b] < numbers[b + 1]) {
                int temp = numbers[b];
                numbers[b] = numbers[b + 1];
                numbers[b+1] = temp;
                }
             } 
            } 
        }
 else if (orden != 2 || orden != 1){
    System.out.println(+orden+  " no es una elección correcta. Vuelva a intentarlo");
     } 
    
     lot.close(); 
    

if ( orden == 1 || orden == 2){
for (int i : numbers) {
	System.out.println( i );
    }
    }
 }
}


