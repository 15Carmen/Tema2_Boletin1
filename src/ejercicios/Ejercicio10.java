package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    /*
     * Escribir un programa que pida al usuario tres números enteros, y que muestre por pantalla si la
     * suma de dos de esos números da como resultado el otro número.
     */
    public static void main(String[] args) {

        //Declaramos las variables
        int num1, num2, num3; //Variables enteras donde vamos a guardar los números introducidos por el usuario
        int resultado; //Resultado de la suma de dos de los números

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner (System.in);

        //Le pedimos al usuario que introduzca 3 numeros enteros y los guardamos en las variables declaradas previamente
        System.out.println("Introduzca un numero entero:");
        num1= sc.nextInt();
        System.out.println("Introduzca otro numero entero:");
        num2= sc.nextInt();
        System.out.println("Introduzca otro mas:");
        num3= sc.nextInt();

        if (num1+num2==num3){
            System.out.println("La suma de "+num1+" y "+num2+" es "+num3);
        }else if (num1+num3==num2){
            System.out.println("La suma de "+num1+" y "+num3+" es "+num2);
        }else if (num2+num3==num1){
            System.out.println("La suma de "+num2+" y "+num3+" es "+num1);
        }else {
            System.out.println("Ninguno de los numeros sumados entre si da otro de los numeros introducidos");
        }


    }
}
