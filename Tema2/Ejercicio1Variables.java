/**
 * 2. Variables
 *
 * 1. Escribe un programa en el que se declaren las variables enteras x
 *    e y. Asignales los valores 444 y 211 respectivamente. A continuación,
 *    muestra por pantalla el valor de cada variable, la suma, la resta,
 *    la división y la multiplicación.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio1Variables {
  public static void main(String[] args) {
    int x = 444;
    int y = 211;
    
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("x + y = " + (x + y));
    System.out.println("x - y = " + (x - y));
    System.out.println("x / y = " + ((float)x / (float)y));
    System.out.println("x * y = " + (x * y));
  }
}
