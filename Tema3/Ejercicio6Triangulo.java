/**
 * 3. Lectura de datos desde teclado
 *
 * 6. Escribe un programa que calcule el área de un triángulo.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio6Triangulo {
  public static void main(String[] args) {

    System.out.println("Área de un triángulo");
    System.out.println("Introduzca la longitud de la base (cms): ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.println("Inroduzca la altura (cms): ");
    double altura = Double.parseDouble(System.console().readLine());
    
    double area = (base * altura) / 2;
    System.out.printf("El área del triángulo es %.2f cms", area);
  }
}
