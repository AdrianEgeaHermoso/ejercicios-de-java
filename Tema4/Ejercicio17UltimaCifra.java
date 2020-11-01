/**
 * 4. Sentencia Condicional
 *
 * 17. Escribe un programa que diga cuál es la última cifra de un número
 *     entero introducido por teclado.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio17UltimaCifra {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número introducido es el " + (numero % 10));
  }
}
