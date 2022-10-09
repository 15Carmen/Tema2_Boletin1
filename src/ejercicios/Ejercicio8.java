package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    /*
     * Escribir una aplicación que pida al usuario un número real y muestre por pantalla la nota del alumno, teniendo en cuenta:
     *      [0-5) es INSUFICIENTE (0 inclusive)
     *      [5-6) es SUFICIENTE (5 inclusive)
     *      [6-7) es BIEN (6 inclusive)
     *      [7-9) es NOTABLE (7 inclusive)
     *      [9-10] es SOBRESALIENTE (9 y 10 inclusives)
     */
    public static void main(String[] args) {

        //Delaramos las variables
        int nota; //Variable donde vamos a guardar la nota introducida por el usuario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca por consola la nota del alumno
        System.out.println("Introduzca la nota del alumno: ");
        nota=sc.nextInt();

        if (nota<0 || nota>10){ //Si la nota no se encuentra entre 0 y 10 imprimimos un mensaje de error
            System.out.println("Nota no valida");
        } else {
            if (nota>=0&&nota<5){ //Si se encuentra entre 0 y 4 la nota es insuficiente
                System.out.println("Su nota es INSUFICIENTE");
            }else if (nota==5){ //Si la nota es igual a 5 es suficiente
                System.out.println("Su nota es SUFICIENTE");
            }else if (nota==6){ //Si la nota es igual a 6 es bien
                System.out.println("Su nota es BIEN");
            }else if (nota>=7&&nota<9){ //Si se encuentra entre 7 y 8 la nota es notable
                System.out.println("Su nota es NOTABLE");
            }else{ //Si se encuentra entre 9 y 10 la nota es sobresaliente
                System.out.println("Su nota es SOBRESALIENTE");
            }
        }

        //Cerramos el scanner
        sc.close();


    }
}
