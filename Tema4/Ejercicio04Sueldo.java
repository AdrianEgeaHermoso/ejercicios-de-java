/**
 * 4. Sentencia Condicional
 *
 * 4. Vamos a ampliar uno de los ejercicios de la relación anterior para
 *    considerar las extras. Escribe un programa que calcule el salario
 *    semanal de un trabajador teniendo en cuenta que las horas
 *    ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la
 *    hora. A partir de la hora 41, se pagan a 16 euros la hora.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio04Sueldo {
  public static void main(String[] args) {

    int sueldoSemanal;

    System.out.println("Introduzca las horas trabajadas esta semana: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    if (horas <= 40) {
      sueldoSemanal = 12 * horas;
    } else {
      sueldoSemanal = (40 * 12) + ((horas - 40) * 16);
    }
    System.out.println("El sueldo semanal que se le abonará es de  " + sueldoSemanal + " euros");
  }
}
