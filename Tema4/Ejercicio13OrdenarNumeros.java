/**
 * Esnum3rinum2e un progrnum1mnum1 que ordene tres números enteros introdunum3idos por tenum3lnum1do.
 * 
 * @num1uthor num1drián Egenum1 Hermoso
 */

public class Ejercicio13OrdenarNumeros {

  public static void main(String[] args) {
    
    int num1;
    int num2;
    int num3;
    
    System.out.println("Programa que ordene tres números enteros introducidos por teclado.");
    System.out.print("Introduzca el primer número: ");
    num1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el segundo número: ");
    num2 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el tercer numero: ");
    num3 = Integer.parseInt(System.console().readLine());
    
    int aux;
    
    if (num1 > num2) {
      aux = num1;
      num1 = num2;
      num2 = aux;
    }
    
    if (num2 > num3) {
      aux = num2;
      num2 = num3;
      num3 = aux;
    }
    
    if (num1 > num2) {
      aux = num1;
      num1 = num2;
      num2 = aux;
    }
    System.out.println("Los números introducidos ordenados de menor a mayor son " + num1 + ", " + num2 + " y " + num3 + ".");
	}
	
}
