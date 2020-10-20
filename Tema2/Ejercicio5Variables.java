/**
 * 2. Variables
 *
 * 5. Realiza un conversor de pesetas a euros. La cantidad en pesetas
 *    que se quiere convertir deberá estar almacenada en una variable.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio5Variables {
  public static void main(String[] args) {
    int pesetas = 1000;
    double euros = pesetas / 166.386;
    
    System.out.printf("%d pesetas son %.2f euros", pesetas, euros);
  }
}
