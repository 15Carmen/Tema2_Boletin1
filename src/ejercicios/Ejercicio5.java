package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    /*
     * Pedir tres números y mostrarlos ordenados de mayor a menor.
     */
    public static void main(String[] args) {

        //Declaramos las variables
        int num1, num2, num3; //Variables donde guardaremos las respuestas introducidas por el usuario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca tres números enteros y los guardamos en las variables previamente declaradas
        System.out.println("Introduzca un número entero cualquiera: ");
        num1 = sc.nextInt();
        System.out.println("Introduzca otro número entero: ");
        num2 = sc.nextInt();
        System.out.println("Introduzca otro número entero: ");
        num3 = sc.nextInt();

        //Usamos condicionales para averiguar el orden de mayor a menor de los números introducidos y lo imprimimos por consola
        if (num1 > num2) {
            if (num1 > num3) {
                if (num2 > num3) {
                    System.out.println(num1 + ">" + num2 + ">" + num3);
                } else {
                    System.out.println(num2 + ">" + num3 + ">" + num1);
                }
            } else {
                System.out.println(num3 + ">" + num1 + ">" + num2);
            }

        } else {
            if (num2 > num3) {
                if (num1 > num3) {
                    System.out.println(num2 + ">" + num1 + ">" + num3);
                } else {
                    System.out.println(num2 + ">" + num3 + ">" + num1);
                }
            }else {
                System.out.println(num3+">"+num2+">"+num1);
            }
        }

        //cerramos el scanner
        sc.close();
    }
}
