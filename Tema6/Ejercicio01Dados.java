/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 *Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 *también la suma total (los puntos que suman entre los tres dados).
 * 
 * @author Adrián Egea Hermoso
 */
public class Ejercicio01Dados {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Este programa muestra la tirada de tres dados y a continuación su suma: ");
    System.out.println("Su tirada es la siguiente: ");
    int tirada;
    int suma = 0;
    for (int i = 0; i < 3; i++) {
      tirada = ((int)(Math.random()*6) + 1);
      System.out.print(tirada + " ");
      suma += tirada;
        }
    System.out.println("\nLa suma es: " + suma);
  }
  
}
