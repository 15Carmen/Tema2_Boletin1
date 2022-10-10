package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    /*
     * Escribir un programa que simule el juego de PIEDRA, PAPEL, TIJERA, pidiendo a cada jugador
     * que escriba PIEDRA, PAPEL o TIJERA. El juego debe mostrar por pantalla quién ha ganado el juego
     * tras jugar una partida. Hay que contemplar el caso de que empaten.
     */
    public static void main(String[] args) {

        //Declaramos las constantes
        final int PIEDRA = 1;
        final int PAPEL = 2;
        final int TIJERAS = 3;

        //Declaramos las variables donde vamos a guardar las respuestas del usuario introducidas por consola
        int jugador1, jugador2;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al jugador 1 que introduzca una de las opciones posibles y la guardamos en la variable jugador1
        System.out.println("Jugador 1, elija piedra[1], papel[2] o tijeras[3]: ");
        jugador1 = sc.nextInt();

        //Le pedimos al jugador 2 que introduzca una de las opciones posibles y la guardamos en la variable jugador2
        System.out.println("Jugador 2, elija piedra[1], papel[2] o tijeras[3]: ");
        jugador2 = sc.nextInt();

        //Si alguno de los numeros introducidos no se encuentra en el rango (1,3) enviamos un mensaje de error
        if (jugador1 < 1 || jugador1 > 3 && jugador2 < 1 || jugador2 > 3) {
            System.out.println("Numero introducido no valido");
        } else {
            if (jugador1 == jugador2) { //Si los numeros introducidos son iguales entonces hay un empate
                System.out.println("EMPATE");
            } else if (jugador1 == PIEDRA && jugador2 == TIJERAS || // Si jugador1=piedra y jugador2=tijeras o
                    jugador1 == PAPEL && jugador2 == PIEDRA || // Si jugador1=papel y jugador2=piedra o
                    jugador1 == TIJERAS && jugador2 == PAPEL) { // Si jugador1=tijeras y jugador2=papel
                System.out.println("Gana el jugador 1");
            } else { //Si no
                System.out.println("Gana el jugador 2");
            }
        }
    }
}

