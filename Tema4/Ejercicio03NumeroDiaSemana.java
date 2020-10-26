/**
 * 4. Sentencia Condicional
 *
 * 3. Escribe un programa en que dado un número del 1 a 7 escriba el
 *    correspondiente nombre del día de la semana.
 *
 * @author Adrián Egea Hermoso
 */

public class Ejercicio03NumeroDiaSemana {
  public static void main(String[] args) {

    String dia;

    System.out.print("Introduzca un número del 1 al 7: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    switch(numero) {
      case 1:
        dia = "lunes";
        break;
      case 2:
        dia = "martes";
        break;
      case 3:
        dia = "miércoles";
        break;
      case 4:
        dia = "jueves";
        break;
      case 5:
        dia = "viernes";
        break;
      case 6:
        dia = "sábado";
        break;
      case 7:
        dia = "domingo";
        break;
      default:
        dia = "Error, introduce un número del 1 al 7";
    }
    
    System.out.println(dia);

  }
}
