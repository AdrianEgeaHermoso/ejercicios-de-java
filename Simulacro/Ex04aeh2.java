/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ex04aeh2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int cantidadPolos;
    
    do{System.out.print("Introduzca la cantidad de polos que desea: ");
    cantidadPolos = Integer.parseInt(s.nextLine());
    if(cantidadPolos < 20){
    System.out.println("El pedido minimo es de 20 polos");}
    } while (cantidadPolos < 20);
    
    int color;
    do{
      System.out.print("Blanco (1) Color (2)");
    color = Integer.parseInt(s.nextLine());
    }while (color != 1 && color != 2);
    
    int logotipo;
    do{
      System.out.print("Logotipo serigrafiado(1) Bordado (2) ");
    logotipo = Integer.parseInt(s.nextLine());
    }while (logotipo != 1 && logotipo != 2);
    double precioUnitario = 4.90;

    if (cantidadPolos >= 40 && cantidadPolos <= 99) {
      precioUnitario = 3.90;
    } else if (cantidadPolos >= 100) {
      precioUnitario = 3.20;
    }

    if (color == 2) {
      precioUnitario = precioUnitario * 1.20;
    }

    double totalTextil = cantidadPolos * precioUnitario;

    double precioLogotipo;

    if (logotipo == 1) {
      if (cantidadPolos < 50) {
        precioLogotipo = 2;
      } else {
        precioLogotipo = 1.50;
      }
    }else{
      if (cantidadPolos < 50) {
        precioLogotipo = 3;
      } else {
        precioLogotipo = 2.50;
      }
    }
    
    double totalLogotipo = precioLogotipo * cantidadPolos;
    double poloLogotipo = totalTextil + totalLogotipo;
    double iva = poloLogotipo * 0.21;
    double total = poloLogotipo + iva;
    
    System.out.printf("Polo en color (unid)  %4d\n", cantidadPolos);
    System.out.printf("Precio unitario        %6.2f €\n", precioUnitario);
    System.out.printf("Total textil           %6.2f €\n", totalTextil);
    System.out.printf("Serigrafia             %6.2f €\n", precioLogotipo);
    System.out.printf("Total serigrafia:      %6.2f €\n", totalLogotipo);
    System.out.printf("Polo mas logotipo      %6.2f €\n", poloLogotipo);
    System.out.printf("IVA                    %6.2f €\n", iva);
    System.out.printf("Total                  %6.2f €\n", total);
  }
  
}
