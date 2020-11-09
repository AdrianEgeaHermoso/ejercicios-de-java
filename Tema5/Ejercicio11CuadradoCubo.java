/**
 * 5. Bucles
 * 
 * 11. Escribe un programa que muestre en tres columnas, el cuadrado y
 *     el cubo de los 5 primeros números enteros a partir de uno que se
 *     introduce por teclado.
 * 
 * @author Adrián Egea Hermoso
 */

public class Ejercicio11CuadradoCubo {

  public static void main(String[] args) {
    
    System.out.print("Introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());

    for (int digito = numero; digito < numero + 5; digito++) {
      System.out.printf("%2d %4d %6d\n", digito, digito * digito, digito * digito * digito);
    }
  }
}
