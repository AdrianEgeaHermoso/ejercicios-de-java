/**
 * 3. Lectura de datos desde teclado
 *
 * 11. Realiza un conversor de Kb a Mb.
 *
 * @author Adrián Egea Hermoso
 */

public class Ejercicio11KbaMb {
  public static void main(String[] args) {

    System.out.println("Introduzca el número de Kb que quiere convertir a Mb: ");
    double kb = Double.parseDouble(System.console().readLine());
    
    double resultado = kb / 1024;
    System.out.printf("El resultado son %.2f Mbytes", resultado);
  }
}
