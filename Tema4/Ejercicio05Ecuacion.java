/**
 * 4. Sentencia Condicional
 *
 * 5. Realiza un programa que resuelva una ecuación de primer grado
 *    (del tipo ax + b = 0).
 *
 * @author Adrián Egea Hermoso
 */

public class Ejercicio05Ecuacion {
  public static void main(String[] args) {

    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    
    System.out.println("Introduzca el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());

    if (a == 0) {
      System.out.println("No tiene solución real.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
