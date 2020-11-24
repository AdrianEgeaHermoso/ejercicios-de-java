
/**
 * Realiza un programa que pinte una pirámide troceada de forma equitativa, es decir, en
 * porciones de la misma altura. Hay que tener en cuenta que el número de trozos no puede ser
 * superior al número de pisos (altura) que tiene la figura. El programa debe chequear los datos
 * introducidos y pedirlos de nuevo si no son correctos.
 * 
 * @author Adrián Egea Hermoso
 * 
 * 
 */

import java.util.Scanner;

public class Ex04aeh4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean datosCorrectos = false;
    int altura = 1;
    int trozos = 1;

    while (!datosCorrectos) {

      System.out.print("Introduzca la altura de la pirámide: ");
      altura = Integer.parseInt(sc.nextLine());

      System.out.print("Introduzca el número de trozos: ");
      trozos = Integer.parseInt(sc.nextLine());

      if (altura % trozos != 0) {
        System.out.println("Una pirámide de " + altura + " pisos no puede dividirse en " + trozos
            + " trozos de la misma altura. Vuelva a intentarlo.");
      } else if (trozos > altura) {
        System.out.println("No puede haber más trozos que pisos en la pirámide. Vuelva a intentarlo.");
      } else {
        datosCorrectos = true;
      }
    }

    System.out.print("\n");

    int canitdadDeLineasParaElSalto = altura / trozos;
    int saltoDelTrozo = canitdadDeLineasParaElSalto;

    for (int i = 0; i < altura; i++) {

      for (int j = 0; j < (altura - i); j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < (((i + 1) * 2) - 1); j++) {
        System.out.print("*");
      }
      System.out.print("\n");

      if (saltoDelTrozo == (i + 1)) {
        System.out.print("\n");
        saltoDelTrozo = saltoDelTrozo + canitdadDeLineasParaElSalto;
      }
    }

  }
}
