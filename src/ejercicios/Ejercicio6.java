package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    /*
     * Pedir los coeficientes de una ecuación de segundo grado y mostrar sus soluciones reales. Si no existen,
     * habrá que indicarlo. Hay que tener en cuenta que las soluciones de una ecuación de segundo grado
     * (ax2 + bx + c = 0) se calculan x=(-b+-raizCuadrada(b^2-(4ac)))/2a
     */
    public static void main(String[] args) {
       //Declaramos las variables
        int a, b, c; //Coeficientes que el usuario va a introducir por consola
        double x1, x2;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca los coeficientes y los guardamos en las variables homónimas
        System.out.printf("Introduzca el coeficiente a: ");
        a=sc.nextInt();
        System.out.printf("Introduzca el coeficiente b: ");
        b=sc.nextInt();
        System.out.printf("Introduzca el coeficiente c: ");
        c=sc.nextInt();

        //calculamos la ecuación de segundo grado
        if (a==0){
            x1=(-c)/b;
            System.out.println("El resultado de la ecuación "+a+"x2  "+b+"x + "+c+" = 0 es x="+x1);
        } else if (b==0) {
            System.out.println("El resultado de la ecuación "+a+"x2  "+b+"x + "+c+" = 0 no es un número real, es decir x = +- la raiz cuadrada de "+(-c)+"/"+a);
        } else {
            x1=(((-b)+Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a));
            x2=(((-b)-Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a));

            System.out.println("El resultado de la ecuación "+a+"x2  "+b+"x + "+c+" = 0 es x="+x1+" y x="+x2);
        }





    }
}
