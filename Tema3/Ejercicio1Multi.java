/**
 * 3. Lectura de datos desde teclado
 *
 * 1. Realiza un programa que pida dos números y que luego muestre el
 *    resultado de su multiplicación.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio1Multi {
  public static void main(String[] args) {
    int x;
    int y;
    int resultado;
    String linea;

    System.out.println("Introduce el primer número: ");
    linea = System.console().readLine();
    x = Integer.parseInt(linea);
    
    System.out.println("Introduce el segundo número: ");
    linea = System.console().readLine();
    y = Integer.parseInt(linea);
    
    resultado = x * y;
    
    System.out.println("El resultado es: " + resultado);
  }
}
