package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    /*
     * Pedir dos números enteros y decir si son iguales o no.
     */
    public static void main(String[] args) {
        //Declaramos las variables
        int num1, num2;//Variables donde guardaremos los números introducidos por el usuario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un número entero cualquiera y lo guardamos en la variable  num1
        System.out.println("Introduzca un número entero: ");
        num1=sc.nextInt();
        //Le pedimos al usuario que introduzca otro número entero cualquiera y lo guardamos en la variable  num2
        System.out.println("Introduzca otro número entero: ");
        num2=sc.nextInt();

        /*
         * Usando condicionales comprobamos si los números introducidos son iguales
         */
        if (num1==num2){
            System.out.println("Los números son iguales");
        }else {
            System.out.println("Los números no son iguales");
        }

        //Cerramos el scanner
        sc.close();

    }
}
