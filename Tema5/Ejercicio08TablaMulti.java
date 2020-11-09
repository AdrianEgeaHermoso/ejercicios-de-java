/**
 * 5. Bucles
 * 
 * 8. Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Adrián Egea Hermoso
 */
public class Ejercicio08TablaMulti {

  public static void main(String[] args) {
    
    System.out.print("Introduce un numero para ver su tabla de multiplicación: ");
    int numero = Integer.parseInt(System.console().readLine());
        
    for (int digito = 0; digito <= 10; digito++) {
      System.out.println(numero + " x " + digito + " = " + numero * digito);
    }

  }
}
