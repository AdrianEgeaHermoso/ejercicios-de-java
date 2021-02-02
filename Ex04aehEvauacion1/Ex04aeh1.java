/**
 * 
 * 
 * @author Adrián Egea Hermoso
 * 
 * 
 */
public class Ex04aeh1{

  public static void main(String[] args) {
    
    int contador = 0;
    boolean esPrimo = false;
    boolean esImpar = true;
    
    while(!esPrimo) {
      esImpar = true;
      esPrimo = true;
      int num = (int) (Math.random()*198 + 2);
      for (int i = 2; i < (num/2); i++) {
        if (num % i == 0) {
          esPrimo = false;
        }
      }
      if(num % 2 == 0) {
        esImpar = false;
      }
      if(esImpar && !esPrimo) {
        System.out.print(num + " ");
        contador++;
      } else if (esImpar && esPrimo) {
        System.out.print(num + " ");
        contador++;
        System.out.println("");
        System.out.print("Se han generado " + contador + " números impares aleatorios");
      }
    }
  }
}
