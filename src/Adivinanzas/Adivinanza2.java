package Adivinanzas;/*

-Project: Computer simulator

-Date: 17/12/2020

-Created by: Joshua Mas

*/

import java.util.Scanner;
/** Upgrade del programa Adivinanza1, en este programa tenemos que adivinar un número entre el 0 y el 99, disponses de 5 intentos para
 * adivinarlo, da indicaciones si el número probado no es el correcto, da una pista sobre si es MAYOR o MENOR, en caso de acertar el número, se
 * tienen que mostrar por pantalla todos los intentos hechos y números utilizados. **/
public class Adivinanza2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean acertado = false;
        int intentos = 5;
        int i;
        int numSecreto = (int) (Math.random() * 99 + 1);
        int [] numIntroducido = new int[5];
        do {
            System.out.println("Te quedan " + intentos + " intentos");
            System.out.print("Introduce el numero a adivinar: ");
            i = teclado.nextInt();
            numIntroducido[intentos- 1]=i;
            intentos--;
            if (i == numSecreto) {
                acertado = true;
            } else if (numSecreto > i) {
                System.out.println("El numero secreto es MAYOR");
            } else {
                System.out.println("El numero secreto es MENOR.");
            }
        } while (intentos > 0 && !acertado);

        if (acertado) {
            System.out.println("Enhorabuena! Has acertado!. El numero de intentos ha quedado:"+ intentos);
        } else {
            System.out.println("Lo siento, no has acertado. El número era: " + numSecreto);
        }
        for (i  = 0; i < numIntroducido.length; i++) {

            System.out.println("Los numeros intentados han sido: " +numIntroducido[i]+"\t");
        }
    }
}
