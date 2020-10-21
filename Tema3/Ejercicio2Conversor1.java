/**
 * 3. Lectura de datos desde teclado
 * 
 * 2. Realiza un conversor de euros a pesetas. La cantidad de euros que
 *    se quiere convertir debe ser introducida por teclado.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio2Conversor1 {
  public static void main(String[] args) {
    System.out.println("Introduce la cantidad de euros que quieres convertir a pesetas: ");
    double euros = Double.parseDouble(System.console().readLine());
    double resultado;
    
    resultado = (euros * 166.386);
    
    System.out.printf("La conversión de tus euros a pesetas es : %.2f" , resultado);
  }
}
