/**
 * 3. Lectura de datos desde teclado
 *
 * 5. Escribe un programa que calcule el área de un rectángulo.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio5Rectangulo {
  public static void main(String[] args) {
    System.out.println("Área de un rectángulo");
    System.out.println("Introduzca la longitud de la base (cms): ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduzca la altura (cms): ");
    double altura = Double.parseDouble(System.console().readLine());
    
    double area = base * altura;
    System.out.printf("El área del rectángulo es  %.2f cms", area);
  }
}
