/**
 * 4. Sentencia Condicional
 *
 * 11. Escribe un programa que dada una hora determinada (horas y minutos),
 *     calcule los segundos que faltan para llegar a la medianoche.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio11Calculo24Horas {

  public static void main(String[] args) {
    
    System.out.println("Debe introducir primero la hora y luego los minutos.");
    
    System.out.println("hora: ");
    int hora = Integer.parseInt(System.console().readLine());  
    
    System.out.print("minuto: ");
    int minuto = Integer.parseInt(System.console().readLine());

    int resultado = 86400 - ((hora * 60) * 60 + (minuto * 60));
            
    System.out.println("Los segundos restantes hasta la medianoche son " + resultado);
  }
}
