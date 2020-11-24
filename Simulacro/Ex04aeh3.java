
/**
 * Realiza un programa que recorte un número con los siguientes criterios:
 *• El primer dígito determina cuántos dígitos tendrá el número recortado.
 *• Si el primer dígito es mayor que la longitud del número original, el número recortado
 *  será igual que el original.
 *• Se cogen los dígitos en orden, de izquierda a derecha.
 * 
 * @author Adrián Egea Hermoso
 * 
 * 
 */

import java.util.Scanner;

public class Ex04aeh3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un número: ");
    long numero = Long.parseLong(sc.nextLine());

    int digitos = 1;
    long primerDigito = numero;

    while (primerDigito > 10) {
      primerDigito = primerDigito / 10;
      digitos++;
    }

    if (!(primerDigito > digitos)) {

      for (int i = 0; i < (digitos - primerDigito); i++) {
        numero = numero / 10;
      }

    }

    System.out.println("El número recortado es " + numero);
  }
}
