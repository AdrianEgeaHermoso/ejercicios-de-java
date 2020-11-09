/**
 * 5. Bucles
 * 
 * 3. Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 * 
 * @author Adrián Egea Hermoso
 */

public class Ejercicio03DoWhile {

  public static void main(String[] args) {
    
    int digito = 0;
    
    do {System.out.println(digito);
      
      digito += 5;
      
    } while(digito <= 100);
  }
}
