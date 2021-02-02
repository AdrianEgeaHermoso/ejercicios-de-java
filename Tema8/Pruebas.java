/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misfunciones;

import static misfunciones.MisFunciones.cuentaDigitos;
import static misfunciones.MisFunciones.esCapicua;
import static misfunciones.MisFunciones.esPrimo;
import static misfunciones.MisFunciones.lineaPersonalizada;


/**
 *
 * @author alumno
 */
public class Pruebas {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println(cuentaDigitos(84654648));
    System.out.println(esPrimo(7));
    System.out.println(lineaPersonalizada(12,'w'));
    if (esCapicua(657)) {
      System.out.println("El 656 es capicúa");
    }
    else {
      System.out.println("No es capicua");}
  }
  
}
