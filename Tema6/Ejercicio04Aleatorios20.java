/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
 * separados por espacios.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio04Aleatorios20 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Muestra 20 números enteros aleatorios entre 0 y 10 separados por espacios: ");
    for (int i = 0; i < 20; i++) {
      System.out.print((int) (Math.random() * 11) + " ");
    }
  }
}
