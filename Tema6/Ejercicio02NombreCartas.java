/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 *Realiza un programa que muestre al azar el nombre de una carta de
 *la baraja francesa. Esta baraja está dividida en cuatro palos: picas,
 *corazones, diamantes y tréboles. Cada palo está formado por 13 cartas,
 *de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7,
 *8, 9, 10, J, Q, K y A (que sería el 1). Para convertir un número en
 *una cadena de caracteres podemos usar String.valueOf(n).
 * 
 * @author Adrián Egea Hermoso
 */
public class Ejercicio02NombreCartas {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    String palo = "";
    String carta = "";
    
     int numeroPalo = (int)(Math.random()*4) + 1;
     
     switch (numeroPalo){
      case 1:
        palo = "picas";
        break;
      case 2:
        palo = "treboles";
        break;
      case 3:
        palo = "corazones";
        break;
      case 4:
        palo = "diamantes";
      default:
        }
     
     int numeroCarta = (int)(Math.random()*13) + 1;
     
     switch (numeroCarta){
      case 1:
        carta = "As";
        break;
      case 11:
        carta = "J";
        break;
      case 10:
        carta = "Q";
        break;
      case 13:
        carta = "K";
        break;
      default:
        carta = String.valueOf(numeroCarta);
     }
      
     System.out.println(carta + " de " + palo);
     
  }
  
}
