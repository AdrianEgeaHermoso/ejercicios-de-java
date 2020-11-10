/**
 * 5. Bucles
 * 
 * 12. Escribe un programa que muestre los n primeros términos de la
 *     serie de Fibonacci. El primer término de la serie de Fibonacci
 *     es 0, el segundo es 1 y el resto se calcula sumando los dos
 *     anteriores, por lo que tendríamos que los términos son 0, 1, 1,
 *     2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe
 *     introducir por teclado.
 * 
 * @author Adrián Egea Hermoso
 */

public class Ejercicio12Fibonacci {

  public static void main(String[] args) {
    
    System.out.println("Este programa muestra los primeros números de la serie de Fibonacci.");
    System.out.print("Introduzca numero: ");
    int n = Integer.parseInt(System.console().readLine());
    
    if(n <= 0){
      System.out.println("El numero introducido es incorrecto");
      }
      else if(n == 1){
      System.out.println("0");
      }
      else if (n == 2){
        System.out.println("0 1");
        }
      else {
        
       int primerNumero = 0;
       int segundoNumero = 1;
       int siguienteTermino = 1;
       
       System.out.print("0 1  ");
       
       for (int i = 3; i <= n; i++){
         System.out.print(siguienteTermino + "  ");
         primerNumero = segundoNumero;
         segundoNumero = siguienteTermino;
         siguienteTermino = primerNumero + segundoNumero;
         }
       }
  }
}
