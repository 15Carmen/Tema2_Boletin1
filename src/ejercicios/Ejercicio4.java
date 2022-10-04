package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    /*
     * Pedir dos números y mostrarlos ordenados de menor a mayor.
     */
    public static void main(String[] args) {

        //Declaramos las variables
        int num1, num2; //Variables donde guardaremos los números introducidos por el usuario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un número entero cualquiera y lo guardamos en la variable  num1
        System.out.println("Introduzca un número entero: ");
        num1=sc.nextInt();
        //Le pedimos al usuario que introduzca otro número entero cualquiera y lo guardamos en la variable  num2
        System.out.println("Introduzca otro número entero: ");
        num2=sc.nextInt();

        /*
         * Usando condicionales comprobamos que número introducido es menor y los ordenamos en consecuencia
         */
        if (num1<num2){
            System.out.println("Los números ordenados de menor a mayor: "+num1+" < "+num2);
        }else {
            System.out.println("Los números ordenados de menor a mayor: "+num2+" < "+num1);
        }

        //Cerramos el scanner
        sc.close();

    }
}
