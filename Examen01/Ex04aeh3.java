/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenreal;

import java.util.Scanner;

/**
 *
 * @author Adrián Egea Hermoso
 */
public class Ex04aeh3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int cantidadPaquetes;
    
    do{
    System.out.print("Introduzca la cantidad de paquetes que desea: ");
    cantidadPaquetes = Integer.parseInt(s.nextLine());
    if (cantidadPaquetes < 20){
    System.out.println("El pedido minimo es de 20 paquetes. Inténtelo de nuevo. ");}
    }while (cantidadPaquetes < 20);
    
    int numeroColores;
    do{
      System.out.print("Numero de colores de la impresión de la taza: ");
      numeroColores = Integer.parseInt(s.nextLine());
    }while(numeroColores <= 0);
    
    int llavero;
    
    do{
    System.out.print("Llavero plástico(1) Llavero metálico (2) ");
    llavero = Integer.parseInt(s.nextLine());
    }while (llavero != 1 && llavero != 2);

    double precioUnitario = 4.90;

    if (cantidadPaquetes >= 40 && cantidadPaquetes <= 99) {
      precioUnitario = 3.90;
    } else if (cantidadPaquetes >= 100) {
      precioUnitario = 3.20;
    }
    

    if (numeroColores > 3) {
      precioUnitario = precioUnitario * 1.20;
    }

    double totalTazas = cantidadPaquetes * precioUnitario;

    double precioLlavero;

    if (llavero == 1) {
      if (cantidadPaquetes < 50) {
        precioLlavero = 2;
      } else {
        precioLlavero = 1.50;
      }
    }else{
      if (cantidadPaquetes < 50) {
        precioLlavero = 3;
      } else {
        precioLlavero = 2.50;
      }
    }
    
    double totalLlaveros = precioLlavero * cantidadPaquetes;
    double tazaLLavero = totalTazas + totalLlaveros;
    double iva = tazaLLavero * 0.21;
    double total = tazaLLavero + iva;
    
    System.out.println("PROMOCIONES COMERCIALES - PRESUPUESTO");
    System.out.println(" ");
    System.out.printf("Taza                  %4dunid.\n", cantidadPaquetes);
    System.out.printf("Precio unitario        %6.2f €\n", precioUnitario);
    System.out.printf("Total  tazas           %6.2f €\n", totalTazas);
    System.out.printf("Llaveros               %6.2f €\n", precioLlavero);
    System.out.printf("Total llaveros         %6.2f €\n", totalLlaveros);
    System.out.printf("Taza mas llaveros      %6.2f €\n", tazaLLavero);
    System.out.printf("IVA                    %6.2f €\n", iva);
    System.out.printf("Total                  %6.2f €\n", total);
  }
  
}
