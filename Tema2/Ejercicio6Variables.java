/**
 * 2. Variables
 *
 * 6. Escribe un programa que calcule el total de una factura a partir
 *    de la base imponible (precio sin IVA). La base imponible estará
 *    almacenada en una variable.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio6Variables {
  public static void main(String[] args) {
    double baseImponible = 22.75;
    double iva =1.21;

    System.out.printf("Base imponible %.2f\n", baseImponible);
    System.out.printf("Iva            %.2f\n", (baseImponible * 0.21));
    System.out.printf("Total          %.2f\n", (baseImponible * iva));
  }
}
