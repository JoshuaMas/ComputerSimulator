package Adivinanzas;/*

-Project: Computer simulator

-Date: 17/12/2020

-Created by: Joshua Mas

*/

import java.util.Scanner;

/** Upgrade del programa Adivinanza2 hecho anteriormente, metemos un menú y ahora estamos interaccionando con una maquina tragaperras
 * cuando el bote de la maquina llegue a 0 se tendrá que reiniciar el programa ya que sería como si tuvieramos que llamar al dueño del local para
 * reponer el dinero de la maquina.
 */
public class Adivinanza3 {
    private int bote = 20;
    private Scanner lecturaTeclado = new Scanner(System.in);

    /** Menu del programa **/
    public void MenuMaquina() throws Exception{
        boolean bucle = true;
        while(bucle){
            System.out.println("Bienvenido al juego de adivinanzas! ");
            System.out.println("1 Iniciar Juego: \n" +
                    "2 Mirar Bote: \n" +
                    "3 Exit:");
            System.out.println("Escoge una opción por favor: ");
            switch (Integer.parseInt(lecturaTeclado.nextLine())){
                case 1:
                    System.out.println("----*El bote sube en 1 al insertar la moneda de 1€ al iniciar el juego.----");
                    start();
                    break;
                case 2:
                    mirarBote();
                    break;
                case 3:
                    bucle = false;
                    break;
                default:
                    throw new Exception("Tienes que elegir una de las opciones mencionadas anteriormente!");
            }
        }
    }
    /** Metodo para mirar el bote de la maquina **/
    public void  mirarBote(){
        System.out.println("Saldo en el bote: " + bote + "€");
    }

    /** Al comenzar un game, te tiene que restar 1€, tienes 5 intentos, si aciertas, ganas 5€ del bote. **/
    public void start(){
        if (bote > 0) {
            bote++;
            boolean correcto = false;
            int numIntentos = 5;
            int user;
            int numSecreto = (int) (Math.random() * 99 + 1);
            int [] numerosIntroducidosUsuario = new int[5];
            while (numIntentos > 0 && !correcto){
                System.out.println("Tienes  " + numIntentos + " intentos");
                System.out.print("Introduce un numero: ");
                user = Integer.parseInt(lecturaTeclado.nextLine());
                numerosIntroducidosUsuario[numIntentos- 1]=user;
                numIntentos--;
                if (user == numSecreto) {
                    correcto = true;
                } else if (numSecreto > user) {
                    System.out.println("El numero es MAYOR");
                } else {
                    System.out.println("El numero es MENOR");
                }
            }
            if (correcto) {
                System.out.println("Enhorabuena! Has acertado!. Intentos restantes:"+ numIntentos);
                bote -= 5;
            } else {
                System.out.println("Lo siento, no has acertado. El número secreto era: " + numSecreto  + "\n" +"Intentos utilizados son: " + numIntentos);
            }
            for (int i  = 0; i < numerosIntroducidosUsuario.length; i++) {
                System.out.println(numerosIntroducidosUsuario[i]);
            }
        }else {
            System.out.println("No queda dinero en el bote , llama al dueño para que rellene la maquina. ");
        }
    }
}
