/**
 * 
 * 3. Escribe un programa que lea 10 números por teclado y que luego
 *    los muestre en orden inverso, es decir, el primero que se
 *    introduce es el último en mostrarse y viceversa.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio03NumerosInversos {

  public static void main(String[] args) {
    
    int[] n = new int[10];
    int i;
    
    System.out.println("Por favor, introduzca 10 números enteros y pulsando enter despues de cada numero");

    for (i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("\nLos números introducidos, al revés, son los siguientes:");
    for (i = 9; i >= 0; i--) {
      System.out.println(n[i]);
    }
  }
}
