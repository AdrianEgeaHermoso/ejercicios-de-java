
/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */
public class Ex04aeh3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    System.out.println("Introduzca un numero");
    long numero = Long.parseLong(System.console().readLine());
    
    int longitud = 0;
    long copia =numero;
    
    do{
      copia /= 10;
      longitud++;
      }while(copia > 0);
      
      if(longitud % 2 !=0){
        System.out.println("No se puede partir,es impar");
        }
        else{
          for(int i = 2; i <= longitud; i+=2){
            System.out.println((numero/(long)Math.pow(10,longitud-i))%100);
            }
          }
    }
}
