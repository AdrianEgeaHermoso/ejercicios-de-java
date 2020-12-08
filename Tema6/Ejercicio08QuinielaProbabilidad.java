/*
 * Quiniela aleatoria con tres columnas rellenas dando más peso
 * al 1, luego a la x y luego al 2.
 * Se incluye el pleno al quince.
 */
package tema6;

/**
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio08QuinielaProbabilidad {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int resultado;
    int columnas = 3;
    
    for (int fila = 1; fila <= 14; fila++) {
      
      System.out.printf("%4d. |", fila);

      for (int apuesta = 1; apuesta <= columnas; apuesta++) {
        resultado = (int)(Math.random() * 3) + 1;
        
        switch(resultado) {
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
            System.out.print("1  |");
            break;
          case 6:
          case 7:
          case 8:
            System.out.print("  2|");
            break;
          case 9:
          case 10:
            System.out.print(" X |");
          default:
        }
      }
      System.out.println();
    }
    
    System.out.print("\nPLENO AL 15 - Local...");
    int goles = (int)(Math.random() * 4);
    System.out.print(goles < 3 ? goles : "M");
    
    System.out.print("   Visitante...");
    goles = (int)(Math.random() * 4);
    System.out.print(goles < 3 ? goles : "M");
  }
  
}
