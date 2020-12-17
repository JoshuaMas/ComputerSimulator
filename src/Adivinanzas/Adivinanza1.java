package Adivinanzas;/*

-Project: Computer simulator

-Date: 17/12/2020

-Created by: Joshua Mas

*/

import java.util.Scanner;

/*

-Project: Computer simulator

-Date: 17/12/2020

-Created by: Joshua Mas

*/
public class Adivinanza1 {
        /* Programa en el que cual se tiene que generar un número al azar entre 0 y 9, el usuario tiene que adivinarlo, primero se genera
       el número aleatorio entre 0 y 9, no se muestra al usuario. El programa solicitará al usuario que intente un número entre 0 y 9
       y comparará el número dado por el usuario con el número aleatorio. Si coinciden los números, se muestra una notificación de q-
       ue se ha acertado el número y que va a acabar el programa, enc aso contrario, el usuario tiene que seguir dando números hasta
       acertar. Comptabiliza el número de intentos y los muestra por pantalla.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Boolean lucky = false;
        int numIntentos = 0;
        int numSecreto = (int) (Math.random() * 9 + 1);
        int numIntroducido;
        System.out.println("Bienvenido al juego de adivinanzas 1, en este programa tienes que intentar adivinar el número secreto! ");
        do {

            System.out.print("Introduce un número del 0 al 9: ");
            numIntentos++;
            numIntroducido = teclado.nextInt();
            if (numIntroducido == numSecreto) {
                lucky = true;
                System.out.println("Has acertado, bien hecho!");
                System.out.println();
            } else {
                System.out.println("Unlucky, intentalo otra vez.");
            }
        } while (numIntentos > 0 && !lucky);
        if (lucky)
            System.out.println("Has tenido que usar " +numIntentos+ " Intentos");
    }
}

