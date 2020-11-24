/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenreal;

import java.util.Scanner;

/**
 *
 * @author Adrián Egea Hermoso
 */
public class Ex04aeh4 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un número: ");

    long numeroIntroducido = Long.parseLong(s.nextLine());


    // Le da la vuelta al número introducido

    long numero = numeroIntroducido;

    long volteado = 0;


    while (numero > 0) {

      volteado = (volteado * 10) + (numero % 10);

      numero /= 10;

    } // while


    do {

      long digito = volteado % 10;

      volteado = volteado / 10;


      switch ((int)digito) {

        case 0:

          System.out.print("O");

          break;

        case 1:

          System.out.print("I");

          break;

        case 2:

          System.out.print("Z");

          break;

        case 3:

          System.out.print("B");

          break;

        case 4:

          System.out.print("A");

          break;

        case 5:

          System.out.print("S");

          break;

        case 6:

          System.out.print("G");

          break;

        case 7:

          System.out.print("L");

          break;

        case 8:

          System.out.print("H");

          break;

        case 9:

          System.out.print("N");

          break;

        default:

      }

    } while (volteado > 0);

    System.out.println();

  }

}
