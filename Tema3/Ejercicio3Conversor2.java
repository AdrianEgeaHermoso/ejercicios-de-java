/**
 * 3. Lectura de datos desde teclado
 * 
 * 2. Realiza un conversor de pesetas a euros. La cantidad de pesetas que
 *    se quiere convertir debe ser introducida por teclado.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio3Conversor2 {
  public static void main(String[] args) {
    System.out.println("Introduce la cantidad de pesetas que quieres convertir a euros: ");
    
    int pesetas;
    String linea;
    linea = System.console().readLine();
    pesetas = Integer.parseInt(linea);
    
    double resultado;
    resultado = (pesetas / 166.386);
    
    System.out.printf("La conversión de tus pesetas a euros es : %.2f" , resultado);
  }
}
