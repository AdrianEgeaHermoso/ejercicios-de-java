/*
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria entre
 * uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una largo
 * aleatoria entre 1 y 40 caracteres.
 */
package tema6;

/**
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio10PintaLineas {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int r;
    int largo;
    String caracter = "";
    
    for(int i = 1; i <= 10; i++) {
      
      largo = (int)(Math.random() * 40) + 1;
      r = (int)(Math.random() * 6);
      
      switch(r) {
        case 0:
          caracter = "c";
          break;
        case 1:
          caracter = "o";
          break;
        case 2:
          caracter = "l";
          break;
        case 3:
          caracter = "a";
          break;
        case 4:
          caracter = "e";
          break;
        case 5:
          caracter = "r";
          break;
        case 6:
          caracter = "o";
          break;
        default:
      }
      
      // pinta la línea
      for(int j = 1; j <= largo; j++) {
        System.out.print(caracter);
      }
      System.out.println();
    }
  }
  
}
