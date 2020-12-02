/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.Scanner;

/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número
 * introducido es menor o mayor que el que ha pensado.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio06AdivinaNumero {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int numeroSecreto = (int) (Math.random() * 101);
    int intentos = 10;
    int numeroIntroducido;
    boolean acertado = false;

    System.out.println("Tienes 10 intentos para adivinar un numero entre 0 y 100");
    do {
      System.out.println("Introduce un numero");
      numeroIntroducido = Integer.parseInt(s.nextLine());
      intentos--;

      if ((numeroIntroducido > numeroSecreto) && (intentos > 0)) {
        System.out.println("El numero secreto es menor que el introducido");
        System.out.println("Ha perdido un intento, vuelva a intentarlo");
      }

      else if ((numeroIntroducido < numeroSecreto) && (intentos > 0)) {
        System.out.println("El numero secreto es mayor que el introducido");
        System.out.println("Ha perdido un intento, vuelva a intentarlo");
      }

      else if (numeroIntroducido == numeroSecreto) {
        acertado = true;
        System.out.println("Has acertado!!!, era el numero: " + numeroSecreto);
      }

    } while (!acertado && (intentos > 0));

    if (!acertado) {
      System.out.println("Te quedaste sin intentos,el numero era:  " + numeroSecreto);
    }

  }
}
