
/**
 * Realiza un programa que convierta un numero al sistema Morse.
 * 
 * @author Adrián Egea Hermoso
 */
public class Ex04aeh2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    System.out.print("Introduzca un número: ");

    long numeroIntroducido = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;

    long volteado = 0;


    while (numero > 0) {

      volteado = (volteado * 10) + (numero % 10);

      numero /= 10;

    }


    do {

      long digito = volteado % 10;

      volteado = volteado / 10;


      switch ((int)digito) {

        case 0:

          System.out.print("_ _ _ _ _");

          break;

        case 1:

          System.out.print(". _ _ _ _");

          break;

        case 2:

          System.out.print(". . _ _ _");

          break;

        case 3:

          System.out.print(". . . _ _");

          break;

        case 4:

          System.out.print(". . . . _");

          break;

        case 5:

          System.out.print(". . . . .");

          break;

        case 6:

          System.out.print("- . . . .");

          break;

        case 7:

          System.out.print("_ _ . . .");

          break;

        case 8:

          System.out.print("_ _ _ . .");

          break;

        case 9:

          System.out.print("_ _ _ _ .");

          break;

        default:

      }

    } while (volteado > 0);

    System.out.println();

  }

}
