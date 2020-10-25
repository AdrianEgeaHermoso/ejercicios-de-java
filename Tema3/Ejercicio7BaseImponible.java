/**
 * 3. Lectura de datos desde teclado
 *
 * 7. Escribe un programa que calcule el total de una factura a partir
 *    de la base imponible.
 *
 * @author Adrián Egea Hermoso
 */

public class Ejercicio7BaseImponible {
  public static void main(String[] args) {

    System.out.println("Introduzca la base imponible (precio del artículo sin IVA): ");
    double baseImponible = Double.parseDouble(System.console().readLine());

    System.out.printf("Base imponible %.2f\n", baseImponible);
    double iva = 1.21;
    System.out.printf("Total %.2f\n", (baseImponible * iva));
  }
}
