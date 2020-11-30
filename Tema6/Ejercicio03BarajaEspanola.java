/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 *Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de
 *48 cartas: 2, 3, 4, 5, 6, 7, 8, 9, sota, caballo, rey y as.
 * 
 * @author Adrián Egea Hermoso
 */
public class Ejercicio03BarajaEspanola {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    String palo = "";
    String carta = "";
    
     int numeroPalo = (int)(Math.random()*4) + 1;
     
     switch (numeroPalo){
      case 1:
        palo = "copas";
        break;
      case 2:
        palo = "espadas";
        break;
      case 3:
        palo = "oros";
        break;
      case 4:
        palo = "bastos";
      default:
        }
     
     int numeroCarta = (int)(Math.random()*11) + 1;
     
     switch (numeroCarta){
      case 1:
        carta = "As";
        break;
      case 8:
        carta = "Sota";
        break;
      case 9:
        carta = "Caballo";
        break;
      case 10:
        carta = "Rey";
        break;
      default:
        carta = String.valueOf(numeroCarta);
     }
      
     System.out.println(carta + " de " + palo);
  }
  
}
