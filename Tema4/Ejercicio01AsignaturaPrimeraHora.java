/**
 * 4. Sentencia Condicional
 *
 * 1. Escribe un programa que pida por teclado un día de la semana
 *    y que diga qué asignatura toca a primera hora ese día.
 *
 * @author Adrián Egea Hermoso
 */

public class Ejercicio01AsignaturaPrimeraHora {
  public static void main(String[] args) {

    String dia;

    System.out.println("Introduzca un día de la semana para ver su asignatura a primera hora: ");
    dia = (System.console().readLine()); 
    
    switch(dia) {
      case "lunes":
        System.out.println("Entorno de Desarrollo");
        break;
      case "martes":
        System.out.println("Programación");
        break;
      case "miércoles":
        System.out.println("Programación");
        break;
      case "jueves":
        System.out.println("Programación");
        break;
      case "viernes":
        System.out.println("Fol");
        break;
      case "sábado":
        System.out.println("Ese día no hay clase, sigue durmiendo");
      case "domingo":
        System.out.println("Ese día no hay clase, aprovecha y vete al campo");
        break;
      default:
        System.out.println("El día introducido no es correcto");
    }
  }
}
