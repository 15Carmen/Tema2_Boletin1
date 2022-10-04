package ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero,
     * que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad, aunque curiosamente
     * el 0 no se considera un número casi-cero. Es decir, un número casi-cero es el que se encuentra en el
     * intervalo (-1, 1), donde se excluye el -1, el 0 y el 1.
     */
    public static void main(String[] args) {
        //Declaramos las variables
        double num;//Variables donde guardaremos el número introducido por el usuario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Para poder introducir decimales con un punto en vez de una coma cambiamos el uso local al de EEUU
        sc.useLocale(Locale.US);

        //Le pedimos al usuario que introduzca un número real cualquiera y lo guardamos en la variable num1
        System.out.println("Introduzca un número real: ");
        num = sc.nextDouble();

        /*
         * Usando condicionales comprobamos si el número introducido es casi cero primero comprobando si el número
         * introducido se encuentra entre -1 y 1 (sin que sean iguales a estos). Si se encuentra entre ese rango numérico
         * nos aseguramos que no sea igual a 0.
         */
        if ((num > -1) && (num < 1) && (num != 0)) {
            System.out.println("El número es casi-cero");
        } else {
            System.out.println("El número no es casi-cero");
        }

        //Cerramos el scanner
        sc.close();

    }
}
