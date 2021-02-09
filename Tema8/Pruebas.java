/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misfunciones;


import misfunciones.MisFunciones;

/**
 *
 * @author alumno
 */
public class Pruebas {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println(MisFunciones.cuentaDigitos(84654648));
    System.out.println(MisFunciones.digitoN(84654648,4));
    System.out.println(MisFunciones.esPrimo(7));
    System.out.println(MisFunciones.trozoDeNumero(34347546,0,5));
    System.out.println(MisFunciones.quitaRepetidos(7475787));
    System.out.println(MisFunciones.lineaPersonalizada(12,'w'));
    if (MisFunciones.esCapicua(657)) {
      System.out.println("El 656 es capicúa");
    }
    else {
      System.out.println("No es capicua");
    }
  }
  
}
