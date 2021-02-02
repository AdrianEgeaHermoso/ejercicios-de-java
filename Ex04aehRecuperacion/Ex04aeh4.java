/**
 *
 * 
 * 4.Realiza un programa que vaya tirando tres dados de forma aleatoria. Cada tirada va en
 *   una linea diferente. El programa parará cuando, al menos, dos de los dados sean iguales.
 *
 * @author Adrián Egea Hermoso
 */
public class Ex04aeh4 {

  public static void main(String[] args) {

    int dado1, dado2, dado3;
    
    do {
      dado1 = (int)(Math.random() * 6) + 1;
      dado2 = (int)(Math.random() * 6) + 1;
      dado3 = (int)(Math.random() * 6) + 1;
      System.out.println(dado1 + " " + dado2 + " " + dado3);
    } while (dado1 != dado2 && dado1 != dado3 && dado2 != dado3);
  }
}
