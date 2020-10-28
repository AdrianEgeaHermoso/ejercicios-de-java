/**
 * 4. Sentencia Condicional
 *
 * 10. Escribe un programa que nos diga el horóscopo a partir del día y
 *     el mes de nacimiento.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio10Horoscopo {

  public static void main(String[] args) {

    System.out.println("Este programa le dirá cuál es su horóscopo a partir de su fecha de nacimiento.");
    System.out.println("Introduzca el número del mes en que nació (1-12): ");
    int mes = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el día (1-31): ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String horoscopo = "";
  
    switch(mes) {
      case 1:
        if (dia < 21) {
          horoscopo = "capricornio";
        } else {
          horoscopo = "acuario";
        }
        System.out.print("Su horóscopo es " + horoscopo);
        break;
      case 2:
        if (dia < 20) {
          horoscopo = "acuario";
        } else {
          horoscopo = "piscis";
        }
        System.out.print("Su horóscopo es " + horoscopo);
        break;
      case 3:
        if (dia < 21) {
          horoscopo = "piscis";
        } else {
          horoscopo = "aries";
        }
        System.out.print("Su horóscopo es " + horoscopo);
        break;
      case 4:
        if (dia < 21) {
          horoscopo = "aries";
        } else {
          horoscopo = "tauro";
        }
        System.out.print("Su horóscopo es " + horoscopo);
        break;
      case 5:
        if (dia < 20) {
          horoscopo = "tauro";
        } else {
          horoscopo = "géminis";
        }
        System.out.print("Su horóscopo es " + horoscopo);
        break;
      case 6:
        if (dia < 22) {
          horoscopo = "géminis";
        } else {
          horoscopo = "cáncer";
        }
        System.out.print("Su horóscopo es " + horoscopo);
        break;
      case 7:
        if (dia < 22) {
          horoscopo = "cáncer";
        } else {
          horoscopo = "Leo";
        }
        System.out.print("Su horóscopo es " + horoscopo);
        break;
      case 8:
        if (dia < 24) {
          horoscopo = "leo";
        } else {
          horoscopo = "virgo";
        }
        System.out.print("Su horóscopo es " + horoscopo);
        break;
      case 9:
        if (dia < 23) {
          horoscopo = "virgo";
        } else {
          horoscopo = "libra";
        }
        System.out.print("Su horóscopo es " + horoscopo);
        break;
      case 10:
        if (dia < 23) {
          horoscopo = "libra";
        } else {
          horoscopo = "escorpio";
        }
        System.out.print("Su horóscopo es " + horoscopo);
        break;
      case 11:
        if (dia < 23) {
          horoscopo = "escorpio";
        } else {
          horoscopo = "sagitario";
        }
        System.out.print("Su horóscopo es " + horoscopo);
        break;
      case 12:
        if (dia < 21) {
          horoscopo = "sagitario";
        } else {
          horoscopo = "capricornio";
        }
        System.out.print("Su horóscopo es " + horoscopo);
        break;
      default:{
        System.out.print("Dato introducido erroneo ");
        }
        break;
    }

  }
}
