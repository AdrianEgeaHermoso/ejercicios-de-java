/**
 * 
 * 
 * @author Adrián Egea Hermoso
 * 
 * 
 */
public class Ex04aeh2{

  public static void main(String[] args) {
    
    int longitud = 0;
    
    while(longitud< 7) {
      System.out.print("Introduzca la longitud total del puente (un número mayor que 6): ");
      longitud = Integer.parseInt(System.console().readLine());
      
      if(longitud < 7) {
        System.out.println("El dato introducido es incorrecto");
        }
    }
    System.out.println("");
    System.out.print("  ");
    for (int i = 0;i < longitud - 4 ; i++) {
      if((Math.random())< 0.33) {
        System.out.print("&");
      } else {
        System.out.print(" ");
      }
    }
    
    System.out.println("");
    System.out.print("  ");
    for (int i = 0;i < longitud -4; i++) {
        System.out.print("*");
    }
    
    System.out.println("");
    System.out.print(" *");
    for (int i = 0;i < longitud -4; i++){
      System.out.print(" ");
    }
    System.out.print("*");
    
    System.out.println("");
    System.out.print("*");
    for (int i = 0;i < longitud -2; i++){
      System.out.print(" ");
    }
    System.out.print("*");
  }
}











