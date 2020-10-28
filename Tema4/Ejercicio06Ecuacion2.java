/**
 * 4. Sentencia Condicional
 *
 * 6. Realiza un programa que calcule el tiempo que tardará en caer un
 *    objeto desde una altura h.
 *    t = raiz(2h/g) siendo g = 9.81 m/s2
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio06Ecuacion2 {
  public static void main(String[] args) {

    System.out.println("Cálculo del tiempo de caída de un objeto.");
    System.out.println("Introduzca la altura (en metros) desde la que cae el objeto: ");
    double h = Double.parseDouble(System.console().readLine());
    
    double g = 9.81;
    double resultado = Math.sqrt(2*h/g);

    System.out.printf("El objeto tarda %.2f segundos en caer.", resultado);
  }
}
