/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

/**
 *
 * @author alumno
 */
public class Ejercicio01 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Caballo01 imperioso = new Caballo01(120,"Imperioso",180);
    Caballo01 lobezno = new Caballo01(125,"Lobezno",190);
    Caballo01 papadopoulos = new Caballo01(122,"Papadopoulos","Arabe");
    System.out.println("Mi nombre es " + imperioso.getNombre() + "y mido " + imperioso.getAltura() + " cms");
    System.out.println("Mi nombre es " + lobezno.getNombre() + "y peso " + lobezno.getPeso() + " kilos");
    System.out.println("Mi nombre es " + papadopoulos.getNombre() + "y soy de raza " + papadopoulos.getRaza());
    imperioso.carrera();
  }
  
}
