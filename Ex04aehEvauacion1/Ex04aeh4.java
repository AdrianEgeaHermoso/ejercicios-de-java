/**
 * Escriba un programa que dado un numero, lo parta en trocitos y muestre cada uno de esos
 * trocitos en una linea cogiendo los digitos de dos en dos, solo se puede partir si es par,
 * 
 * author: Adrián Egea Hermoso
 */
public class Ex04aeh4 {
  public static void main (String [] args){
    System.out.print("Introduzca un número: ");
    long num = Long.parseLong(System.console().readLine());
    long aux = num;
    long pares = 0;
    long impares = 0;
    int antes = 0;
    int despues = 0;
    while( aux > 0 ){
      if ( (aux % 10) % 2 != 0 ){
        System.out.println("Lo siento el numero introducido es impar");
      }else{
        pares = (pares * 10) + (aux % 10);
        antes++;
      }
      aux /= 10;
    }
    aux = pares;
    pares = 0;
    while( aux > 0 ){
      pares = (pares * 10) + (aux % 10);
      despues++;
      aux /= 10;
    }
    if( antes != despues ){
      pares *= 10;
    }
    
    System.out.println("Las cifras pares del número " + num + " son: " + pares);
  }
}
