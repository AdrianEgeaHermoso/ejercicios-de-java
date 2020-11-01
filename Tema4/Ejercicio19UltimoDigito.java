/**
 * 4. Sentencia Condicional
 *
 * 19. Realiza un programa que nos diga cuántos dígitos tiene un número
 *     entero que puede ser positivo o negativo. Se permiten números de
 *     hasta 5 dígitos.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio19UltimoDigito {

  public static void main(String[] args) {
    
    int numero;
    int digitos = 0;
    
    System.out.print("Introduzca un número entero (de 5 cifras como máximo): ");
    numero = Integer.parseInt(System.console().readLine());
    
    if ( numero < 10 ) {
      digitos = 1;
    }
    
    if (( numero >= 10 ) && ( numero < 100 )) {
      digitos = 2;
    }
    
    if (( numero >= 100 ) && ( numero < 1000 )) {
      digitos = 3;
    }
    
    if (( numero >= 1000 ) && ( numero < 10000 )) {
      digitos = 4;
    }
    
    if ( numero >= 10000 ) {
      digitos = 5;
    }
    
    System.out.println("El número introducido tiene " + digitos + " dígitos.");
  }
}
