/*
 * Quiniela aleatoria con tres columnas rellenas y pleno al quince.
 */
package tema6;

/**
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio07Quiniela {

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
            System.out.print("1  |");
            break;
          case 2:
            System.out.print("  2|");
            break;
          case 3:
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
