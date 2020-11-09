/**
 * 5. Bucles
 * 
 * 6. Muestra los números del 320 al 160, contando de 20 en 20
 *    utilizando un bucle do-while.
 * 
 * @author Adrián Egea Hermoso
 */
public class Ejercicio06BucleAtras {

  public static void main(String[] args) {
    
    int digito = 320;
    
    do {
      System.out.println(digito);
      
      digito -= 20;
      
    } while(digito >= 160);
  }
}
