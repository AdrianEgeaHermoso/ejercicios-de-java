/**
 * 5. Bucles
 * 
 * 5. Muestra los números del 320 al 160, contando de 20 en 20 hacia
 *    atrás utilizando un bucle while.
 * 
 * @author Adrián Egea Hermoso
 */
public class Ejercicio05BucleAtras {

  public static void main(String[] args) {
    
    int digito = 320;
    
    while(digito >= 160) {
        System.out.println(digito);
        digito-=20;
    }
  }
}
