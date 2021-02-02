/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misfunciones;

/**
 *
 * @author alumno
 */
public class MisFunciones {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
  }
  
  ////////////////////// FUNCION CUENTADIGITOS //////////////////////
  public static int cuentaDigitos(long x){
    int contador = 0;
    for (long i = x; i > 0 ; i/=10){
      contador ++;
      }
    return contador;
    }
  public static int cuentaDigitos ( int x){
    return cuentaDigitos ((long)x);
    }
  
  ////////////////  FUNCION IDENTIFICA PRIMOS ///////////////////
  public static boolean esPrimo (long num){
    int primo = 0;
    for (int i = 1 ; i <= num ; i++){
      if (num % i == 0){
        primo ++;
        }
      }
      if (primo == 2){
        return true;
        }else{
          return false;
        } 
    }
  
  //////////////// FUNCION DIBUJA LINEA ////////////////
  public static String linea(int longitud){
    String resultado = "";
    for(int i=0;i<longitud;i++){
      resultado +="*";
    }
      return resultado;
    
  }
  
  // FUNCION DIBUJA LINEA PERSONALIZADA ///////////////////
  public static String lineaPersonalizada(int longitud,char caracter){
    String resultado = "";
    for(int i=0;i<longitud;i++){
      resultado +=caracter;
    }
      return resultado;
    
  }
  
  ///////////// FUNCION DIBUJA UN RECTANGULO ///////////////////
  public static String rectangulo(int ancho, int alto){
    String resultado = "";
    for (int i=0;i<alto;i++){
      resultado += (linea(ancho)+"\n");
      }
      return resultado;
  }
  
  /////////////// FUNCION NUMERO ALEATORIO ////////////////////
  /**
   * Genera un numero entero aleatorio
   * @param minimo minimo valor posible
   * @param maximo maximo valor posible
   * @return un aleatorio del intervalo
   * 
   **/
  public static int aleatorio(int minimo,int maximo){
    return(int)(Math.random()*(maximo - minimo + 1)+ minimo);
    
    }
  
  //////////////////FUNCION MEDIA NUMEROS EN ARRAY /////////////////////
  /**
   * Calcula la media de los numeros introducidos
   * @param numeros array con los numeros que requiere para hacer la media
   * @return la media de los numeros del array
   * 
   **/
  public static double mediaNumerosArray(double[]numeros){
    double suma = 0;
    for(double numero:numeros){
      suma +=numero;
      }
      return suma / numeros.length;
    }
  
  //////////////FUNCION MEDIA DE TRES NUMEROS ///////////
  
  
  /**
   * Calcula la media de tres numeros
   * @param num1 puede contener decimales
   * @param num2 puede contener decimales
   * @param num3 puede contener decimales
   * @return media de num1,num2,num3
   * 
   **///double tipo dato que devuelve //(tipos de dato que introduzco)
  public static double mediaTresNumeros(double num1,double num2,double num3){
    
    //operacion que hace
    double media=(num1+num2+num3) / 3;
    
    //para poder utilizar ese dato que esta en media
    return media;
  }
  
  /////////////////// FUNCION VOLTEA UN NUMERO ////////////////////
  /**
   * Le da la vuelta a un número.
   *
   * @param x número al que se le quiere dar la vuelta
   * @return  número volteado (al revés)
   */
  public static long voltea(long x) {
    if (x < 0) {
      return -voltea(-x);
    }

    long volteado = 0;

    while(x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }

    return volteado;
  }
   
  ///////////////////// FUNCION CAPICUA //////////////////////
  public static boolean esCapicua(long x) {
    return x == voltea(x);
  }
  
  
  
}
