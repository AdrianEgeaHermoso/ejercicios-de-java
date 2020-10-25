/**
 * 3. Lectura de datos desde teclado
 *
 * 9. Escribe un programa que calcule el volumen de un cono según la
 *    fórmula V = (1/3)πr^2h
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio9VolumenCono {
  public static void main(String[] args) {

    double PI = 3.1416;
    
    System.out.println("Volumen de un cono");
    System.out.println("Introduzca la altura (cms): ");
    double altura = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduzca el radio (cms): ");
    double radio = Double.parseDouble(System.console().readLine());
    
    double volumen = (1.0/3.0) * PI * radio * radio * altura;
    System.out.printf("El volumen del cono es de %.2f cms", volumen);
  }
}
