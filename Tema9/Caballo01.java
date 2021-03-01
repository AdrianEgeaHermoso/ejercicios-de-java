/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

/**
 *
 * @author Adrián Egea Hermoso
 */
public class Caballo01 {
  
  private String nombre = "";
  private int altura = 0;
  private String raza = "";
  private int peso = 0;

  public Caballo01() {
  }
  
  
public Caballo01(int altura,String nombre,String raza){
   this.altura = altura;
   this.nombre = nombre;
   this.raza = raza;
 }
 public Caballo01(int altura,String nombre,int peso){
   this.altura = altura;
   this.nombre = nombre;
   this.peso = peso;
 }


  public String getNombre() {
    return nombre;
  }

  public int getAltura() {
    return altura;
  }

  public String getRaza() {
    return raza;
  }

  public int getPeso() {
    return peso;
  }
  
  public void carrera(){
    System.out.println("Vamos a correr juntos, y vemos quién gana");
  }

  
}
