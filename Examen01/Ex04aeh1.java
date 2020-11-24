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
public class Ex04aeh1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int altura;
    boolean datosValidos;
    
    do{
      datosValidos = true;
      System.out.println("Por favor, introduzca la altura: ");
      altura = Integer.parseInt(s.nextLine());
      
      if ((altura < 3) || (altura % 2 == 0)){
        datosValidos = false;
        System.out.println("Datos incorrectos, introduzca un numero impar, mayor o igual a 3");
      }
      }while (!datosValidos);
    
    //parte superior
    System.out.println("\n*    *   ****   *     ****");
    
    for (int i = 0; i < (altura -3) / 2; i++ ){
      System.out.println("*    *  *    *  *    *    *");
    }
    //parte central
    System.out.println("******  *    *  *    ******");
    
    
    //parte inferior
    for (int i = 0; i < (altura -3) / 2; i++ ){
      System.out.println("*    *  *    *  *    *    *");
    }
    
    System.out.println("*    *   ****   **** *    *");
    
  }
  
}
