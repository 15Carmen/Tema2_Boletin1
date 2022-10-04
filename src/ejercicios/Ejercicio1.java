package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    /**
     * Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.
     */
    public static void main(String[] args) {
        //Declaramos las variables
        int num;//Variable donde guardaremos el número introducido por el usuario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un número entero cualquiera
        System.out.println("Introduzca un número entero: ");
        num=sc.nextInt();

        /*
         * Usando condicionales comprobamos si el número introducido es par. Lo es si el resto al dividirlo entre 2
         * el resto es igual a 0
         */
        if (num%2==0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }

        //Cerramos el scanner
        sc.close();

    }
}