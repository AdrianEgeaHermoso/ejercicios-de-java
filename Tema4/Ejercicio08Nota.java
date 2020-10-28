/**
 * 4. Sentencia Condicional
 *
 * 8. Amplía el programa anterior para que diga la nota del boletín
 *    (insuficiente, suficiente, bien, notable o sobresaliente).
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio08Nota {

  public static void main(String[] args) {

    System.out.println("Este programa calcula la media de tres notas reflejándolo con palabras");
    
    System.out.println("Introduzca la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduzca la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduzca la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());

    double notaMedia = (nota1 + nota2 + nota3) / 3;

    System.out.printf("La media es %.2f ", notaMedia);
    
    if (notaMedia < 5) {
      System.out.println("Insuficiente");
    }
    
    if ((notaMedia >= 5) && (notaMedia < 6)) {
      System.out.println("Suficiente");
    }
    
    if ((notaMedia >= 6) && (notaMedia < 7)) {
      System.out.println("Bien");
    }
    
    if ((notaMedia >= 7) && (notaMedia < 9)) {
      System.out.println("Notable");
    }
    
    if (notaMedia >= 9) {
      System.out.println("Sobresaliente");
    }
  }
}
