/**
 * 4. Sentencia Condicional
 *
 * 14. Realiza un programa que diga si un número introducido por teclado
 *     es par y/o divisible entre 5.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio14ParoImpar {

  public static void main(String[] args) {
        
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());

    if ((numero % 2) == 0) {
      System.out.print("El número introducido es par");
    } else {
      System.out.print("El número introducido es impar");
    }

    if ((numero % 5) == 0) {
      System.out.println(" y divisible entre 5.");
    } else {
      System.out.println(" y no es divisible entre 5.");
    }
  }
}
