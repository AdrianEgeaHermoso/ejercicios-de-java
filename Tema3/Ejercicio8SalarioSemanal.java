/**
 * 3. Lectura de datos desde teclado
 *
 * 8. Escribe un programa que calcule el salario semanal de un empleado
 *    en base a las horas trabajadas, a razón de 12 euros la hora.
 *
 * @author Adrián Egea Hermoso
 */

public class Ejercicio8SalarioSemanal {
  public static void main(String[] args) {

    System.out.println("Introduzca el número de horas trabajadas durante la semana: ");
    double horasTrabajadas = Double.parseDouble(System.console().readLine());
    System.out.println("Su salario semanal es de " + (horasTrabajadas * 12) + " euros.");
  }
}
