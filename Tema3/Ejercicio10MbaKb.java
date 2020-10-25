/**
 * 3. Lectura de datos desde teclado
 *
 * 10. Realiza un conversor de Mb a Kb.
 *
 * @author Adrián Egea Hermoso
 */

public class Ejercicio10MbaKb {
  public static void main(String[] args) {

    System.out.println("Introduzca el número de Mb que quiere convertir a Kb: ");
    double mb = Double.parseDouble(System.console().readLine());
    
    double resultado = mb * 1024;
    System.out.printf("El resultado son %.2f Kbytes", resultado);
  }
}
