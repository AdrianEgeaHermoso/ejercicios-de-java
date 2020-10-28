/**
 * 4. Sentencia Condicional
 *
 * 7. Realiza un programa que calcule la media de tres notas.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio07NotaMedia {

  public static void main(String[] args) {

    System.out.println("Este programa calcula la media de tres notas.");
    
    System.out.println("Introduzca la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduzca la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduzca la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());

    double notaMedia = (nota1 + nota2 + nota3) / 3;

    System.out.printf("La nota media es %.2f", notaMedia);
  }
}
