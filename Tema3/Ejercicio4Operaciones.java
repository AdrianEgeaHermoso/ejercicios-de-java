/**
 * 3. Lectura de datos desde teclado
 *
 * 4. Escribe un programa que sume, reste, multiplique y divida dos
 *    números introducidos por teclado.
 *
 * @author Adrián Egea Hermoso
 */

public class Ejercicio4Operaciones {
  public static void main(String[] args) {
    int x;
    int y;
    String linea;

    System.out.print("Introduzca el primer número: ");
    linea = System.console().readLine();
    x = Integer.parseInt(linea);
    
    System.out.print("Introduzca el segundo número: ");
    linea = System.console().readLine();
    y = Integer.parseInt(linea);
    
    int suma = x + y;
    int resta = x - y;
    int multiplicacion = x * y;
    int division = x / y;
    
    System.out.println("El resultado de la suma es: " + suma);
    System.out.println("El resultado de la resta es: " + resta);
    System.out.println("El resultado de la multiplicación es: " + multiplicacion);
    System.out.println("El resultado de la division es: " + division);
  }
}
