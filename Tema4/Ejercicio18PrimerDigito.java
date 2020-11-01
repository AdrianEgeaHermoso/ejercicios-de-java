/**
 * 4. Sentencia Condicional
 *
 * 18. Escribe un programa que diga cuál es la digito cifra de un número
 *     entero introducido por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio18PrimerDigito {

  public static void main(String[] args) {
    
    int numero;
    int digito=0;
    
    System.out.print("Introduzca un número entero (de 5 cifras como máximo): ");
    numero = Integer.parseInt(System.console().readLine());
    
    if ( numero < 10 ) {
      digito = numero;
    }
    
    if (( numero >= 10 ) && ( numero < 100 )) {
      digito = numero / 10;
    }
    
    if (( numero >= 100 ) && ( numero < 1000 )) {
      digito = numero / 100;
    }
    
    if (( numero >= 1000 ) && ( numero < 10000 )) {
      digito = numero / 1000;
    }
    
    if (( numero >= 10000 ) && (numero <100000)) {
      digito = numero / 10000;
    }
    System.out.println("La primera cifra del número introducido es el " + digito);
    
  }
}
