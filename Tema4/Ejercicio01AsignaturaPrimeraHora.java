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

    String dia, asignatura;

    System.out.println("Introduzca un día de la semana para ver su asignatura a primera hora: ");
    dia = (System.console().readLine()); 
    
    switch(dia) {
      case "lunes":
        asignatura = "Entorno de Desarrollo";
        //System.out.println("Entorno de Desarrollo");
        break;
      case "martes":
        asignatura = "Entorno de Desarrollo";
        //System.out.println("Programación");
        break;
      case "miércoles":
        asignatura = "Entorno de Desarrollo";
        //System.out.println("Programación");
        break;
      case "jueves":
        asignatura = "Entorno de Desarrollo";
        //System.out.println("Programación");
        break;
      case "viernes":
        asignatura = "Entorno de Desarrollo";
        //System.out.println("Fol");
        break;
      case "sábado":
        asignatura = "Entorno de Desarrollo";
        //System.out.println("Ese día no hay clase, sigue durmiendo");
      case "domingo":
        asignatura = "Entorno de Desarrollo";
        //System.out.println("Ese día no hay clase, aprovecha y vete al campo");
        break;
      default:
        //System.out.println("El día introducido no es correcto");
        
        
    }
        System.out.println(asignatura);
  }
}
