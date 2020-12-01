/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 *Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 *separados por espacios. Muestra el máximo, el mínimo y la media de esos números.
 * 
 * @author Adrián Egea Hermoso
 */
public class Ejercicio05MaximoMinimoMedia {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    int n;
    
    for (int i = 0; i < 50; i++) {
      n = (int)(Math.random()*100) + 100;
      System.out.print(n + " ");
      suma += n;
      
      if (n < minimo) {
        minimo = n;
      }
      
      if (n > maximo) {
        maximo = n;
      }
    }
    
    System.out.println("\nMínimo: " + minimo + "\nMáximo: " + maximo + "\nMedia: " + suma / 50);
  }
  
}
