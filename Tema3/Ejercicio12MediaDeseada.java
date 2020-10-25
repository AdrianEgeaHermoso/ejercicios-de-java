/**
 * 3. Lectura de datos desde teclado
 *
 * 12.  Realiza un programa que calcule la nota que hace falta sacar en el segundo
 *      examen de la asignatura **Programación** para obtener la media deseada.
 *      Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la
 *      del segundo examen un 60%.
 *
 * @author Adrián Egea Hermoso
 */

public class Ejercicio12MediaDeseada {
  public static void main(String[] args) {

    System.out.println("Introduce la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.println("¿Qué nota quieres sacar en el trimestre? ");
    double notaFinal = Double.parseDouble(System.console().readLine());
    
    double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
    
    System.out.printf("Para tener un %.2f en el trimestre necesitas sacar un %.2f en el segundo examen", notaFinal,nota2);
  }
}
