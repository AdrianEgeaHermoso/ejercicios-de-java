/**
 * 1. Salida por pantalla
 *
 * 4. Escribe un programa que muestre tu horario de clase. Puedes usar
 *    espacios o tabuladores para alinear el texto.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio5HorarioColor {
  public static void main(String[] args) {
    System.out.println("*******\t*******\t*******\t*******\t*******");
    System.out.println("Lunes\tMartes\tMiérc.\tJueves.\tViernes");
    System.out.println("*******\t*******\t*******\t*******\t*******");
    System.out.println("\033[31mEEDD\t\033[32mPRO\tPRO\tPRO\t\033[34mFOL");
    System.out.println("*******\t*******\t*******\t*******\t*******");
    System.out.println("\033[33mLM\t\033[32mPRO\t\033[32mPRO\t\033[33mLM\t\033[34mFOL");
    System.out.println("*******\t*******\t*******\t*******\t*******");
    System.out.println("\033[33mLM\t\033[31mEEDD\t\033[32mPRO\t\033[33mLM\t\033[34mFOL");
    System.out.println("*******\t*******\t*******\t*******\t*******");
    System.out.println("\033[32mPRO\t\033[31mEEDD\t\033[35mBBDD\t\033[36mSINF\tSINF");
    System.out.println("*******\t*******\t*******\t*******\t*******");
    System.out.println("\033[32mPRO\t\033[35mBBDD\tBBDD\t\033[36mSINF\tSINF");
    System.out.println("*******\t*******\t*******\t*******\t*******");
    System.out.println("\033[35mBBDD\tBBDD\tBBDD\t\033[36mSINF\tSINF");
    System.out.println("*******\t*******\t*******\t*******\t*******");
  }
}
