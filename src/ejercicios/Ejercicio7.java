package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    /*
     * Escribir una aplicación que indique cuántas cifras tiene un número introducido por teclado,
     * que está comprendido entre 0 y 99.999.
     */

    public static void main(String[] args) {

        //Declaramos las variables
        int num; //Variable donde vamos a guardar el número introducido por el usuario
        int contador = 0; //Variable donde iremos contando las cifras que tiene el numero introducido

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero entre 0 y 99.999 y lo guardamos en la variable num
        System.out.println("Introduzca un numero entre 0 y 99.999: ");
        num= sc.nextInt();


        if (num>0&&num<=99999){//Si num se encuentra entre 0 y 99.999
            /*
             * Mientras que num sea distinto de 0, divido el numero entre 10 y aumento la variable contador en 1. El número de
             * cifras de num dependerá de cuantas veces se tenga que dividir num entre 10 antes de que de 0.
             */
            while (num!=0){
                num = num/10;
                contador++;
            }
            //Imprimimos por consola el número de cifras que está guardado en la variable contador
            System.out.println(contador);
        }else { //Si num no se encuentra en el rango especificado, enviamos un mensaje de error
            System.out.println("Error, numero no valido");
        }

        //cerramos el scanner
        sc.close();

    }
}
