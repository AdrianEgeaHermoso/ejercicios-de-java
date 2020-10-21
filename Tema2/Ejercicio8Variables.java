/**
 * Escribe un programa que declare 5 variables de tipo char . A continuación, crea
   otra variable como cadena de caracteres y asígnale como valor la concatena-
   ción de las anteriores 5 variables. Por último, muestra la cadena de caracteres
   por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 * 
 * @author Adrián Egea Hermoso
 */


public class Ejercicio8Variables {
  public static void main(String[] args) {
    char c1 = 'a';
    char c2 = 'l';
    char c3 = 'o';
    char c4 = 'c';
    char c5 = 'a';
    char c6 = 'd';
    char c7 = 'o';
    
    // La siguiente línea da error porque el resultado de sumar variables
    // de tipo carácter es un número entero.
    // String palabra = c1 + c2 + c3 + c4 + c5 + c6 + c7;
    
    // Se soluciona concatenando al principio la cadena vacía.
    String palabra = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7;
    
    System.out.println(palabra);
  }
}
