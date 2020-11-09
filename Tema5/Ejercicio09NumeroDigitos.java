/**
 * 5. Bucles
 * 
 * 9. Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * 
 * @author Adrián Egea Hermoso
 */

public class Ejercicio09NumeroDigitos {

  public static void main(String[] args) {
    
    int numeroDigitos = 1;
    int numeroIntroducido;

    System.out.print("Introduzca un número entero para ver cuantos digitos tiene: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    
    while (numeroIntroducido > 10) {
      
      numeroIntroducido /= 10;
      
      numeroDigitos++;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDigitos + " dígito/s.");

  }
}
