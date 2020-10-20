/**
 * Escribe un programa que declare variables de tipo char y de tipo String . Intenta
mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
de Java (con un solo println ) ¿es posible?
* 
* @author Adrián Egea Hermoso
 */


public class Ejercicio7Variables {
  public static void main(String[] args) {
    char primeraLetra = 'a';
    char ultimaLetra = 'o';
    String palabra = "alocado";
    
    System.out.println(primeraLetra + " " + ultimaLetra + " " + palabra);
  }
}
