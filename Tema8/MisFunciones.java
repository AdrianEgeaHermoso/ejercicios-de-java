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
  
  ////////////////////// FUNCION CUENTADIGITOS EJERCICIO 5//////////////////////
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
  
  ////////////////  FUNCION IDENTIFICA PRIMOS EJERICICO 2 ///////////////////
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
  
  /////////////////// FUNCION VOLTEA UN NUMERO EJERCICIO 6 ////////////////////
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
   
  ///////////////////// FUNCION CAPICUA EJERCICIO 1 //////////////////////
  public static boolean esCapicua(long x) {
    return x == voltea(x);
  }
  
  
  /////////// FUNCION SIGUIENTE PRIMO EJERCICIO 3 ////////////////
  /**
   * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
   *
   * @param x un número entero
   * @return  el menor primo que es mayor al número que se pasa como parámetro
   */
  public static int siguientePrimo(int x) {
    while (!esPrimo(++x)) {};

    return x;
  }
  
  /////// FUNCION DEVUELVE POTENCIA EJERCICIO 4 ////////////
  /**
   * Dada una base y un exponente, devuelve la potencia.
   *
   * @param base      base de la potencia
   * @param exponente exponente de la potencia
   * @return          número resultante de elevar la base a la potencia indicada
   */
  public static double potencia(int base, int exponente) {
    if (exponente == 0) {
      return 1;
    }

    if (exponente < 0) {
      return 1/potencia(base, -exponente);
    }

    int n = 1;

    for (int i = 0; i < Math.abs(exponente); i++) {
      n = n * base;
    }

    return n;
  }
  
  /////// FUNCION  EJERCICIO 7 Devuelve el dígito que está en la posición n 
  ///////de un número entero.Se empieza contando por el 0 y de izquierda a derecha.////////
  /**
  /* Devuelve el dígito que está en la posición n de un número entero. Se
   * empieza contando por el 0 y de izquierda a derecha.
   *
   * @param x número entero
   * @param n posición dentro del número <code>x</code>
   * @return  dígito que está en la posición n del número <code>x</code>
   *          empezando a contar por el 0 y de izquierda a derecha
   */
  public static int digitoN(long x, int n) {
    x = voltea(x);

    while (n-- > 0) {
      x = x / 10;
    }

    return (int)x % 10;
  }

  /////////////// FUNCION POSICION DIGITO EJERCICIO 8 ////////////////
  /**
   * Da la posición de la primera ocurrencia de un dígito dentro de un número
   * entero. Si no se encuentra, devuelve -1.
   *
   * @param x número entero
   * @param d dígito a buscar dentro del número
   * @return  posición de la primera ocurrencia del dígito dentro del número o
   *          -1 si no se encuentra
   */
  public static int posicionDeDigito(long x, int d) {
    int i;

    for (i = 0; (i < cuentaDigitos(x)) && (digitoN(x, i) != d); i++) {};

    if (i == cuentaDigitos(x)) {
      return -1;
    } else {
      return i;
    }
  }
  
  /////////// FUNCION EJERCICIO 14 PEGA DOS NUMEROS PARA FORMAR UNO////////
  /**
   * Pega dos números para formar uno solo.
   *
   * @param x trozo que se pegará por la izquierda
   * @param y trozo que se pegará por la derecha
   * @return  número compuesto de los trozos <code>x</code> e <code>y</code>
   */
  public static long juntaNumeros(long x, long y) {
    return (long)(x * potencia(10, cuentaDigitos(y))) + y;
  }
  
  
  
  ////////// FUNCION EJERCICIO 11 PEGA POR DETRAS, ES DECIR POR LA DERECHA/////
  /**
   * Añade un dígito a un número por detrás (por la derecha).
   *
   * @param x número entero
   * @param d dígito que se le va a pegar por la derecha
   * @return  número inicial <code>x</code> con el dígito <code>d</code> pegado
   *          por la derecha
   */
  public static long pegaPorDetras(long x, int d) {
    return juntaNumeros(x, d);
  }

  /////////// FUNCION QUITA REPETIDOS DE UNA SERIE DE NUMEROS//////////
  public static long quitaRepetidos(long n) {
    long aux = 0;
    
    int longitud = 0;

    for (int i = 0; i < cuentaDigitos(n); i++) {
      
      int digito = digitoN(n, i);
      
      if (!contiene(aux, digito)) {
        aux = pegaPorDetras(aux, digito);
      }
    }
    
    return aux;
  }

  public static int quitaRepetidos(int n) {
    return (int)quitaRepetidos((long)n);
  }

  public static int[] quitaRepetidos(int[] a) {
    int aux[] = new int[a.length];
    
    int i = 0;
    
    for (int numero : a) {
      if (!contiene(aux, numero)) {
        aux[i++] = numero;
      }
    }
    
    int[] resultado = new int[i];
    
    for (int j = 0; j < i; j++) {
      resultado[j] = aux[j];
    }
    
    return resultado;
  }
  
  /////////////// FUNCION CONTIENE UN NUMERO ENTERO /////////////////////
  public static boolean contiene(int[] a, int n) {
    for (int numero : a) {
      if (numero == n) {
        return true;
      }
    }
    
    return false;
  }
  
  
  public static boolean contiene(long n, int d) {
    return posicionDeDigito(n, d) != -1;
  }
  
  //////// FUNCION EJERCICIO 9 QUITA UN NUMERO POR DETRAS /////////////
  /**
   * Le quita a un número <code>n</code> dígitos por detrás (por la derecha). 
   *
   * @param x número entero
   * @param n número de dígitos que se le van a quitar
   * @return  número inicial <code>x</code> con <code>n</code> dígitos menos
   *          quitados de la derecha
   */
  public static long quitaPorDetras(long x, int n) {
    return x / (long)potencia(10, n);
  }

  /**
   * Le quita a un número <code>n</code> dígitos por detrás (por la derecha). 
   *
   * @param x número entero
   * @param n número de dígitos que se le van a quitar
   * @return  número inicial <code>x</code> con <code>n</code> dígitos menos
   *          quitados de la derecha
   */
  public static int quitaPorDetras(int x, int n) {

    return (int)quitaPorDetras((long) x, n);
  }
  
  ////////// FUNCION EJERCICIO 10 QUITA UN NUMERO POR DELANTE ////////////
  /**
   * Le quita a un número <code>n</code> dígitos por delante (por la izquierda).                                                 *
   * @param x número entero
   * @param n número de dígitos que se le van a quitar
   * @return  número inicial <code>x</code> con <code>n</code> dígitos menos
   *          quitados de la izquierda
   */
  public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1); // "cierra" el número por si acaso termina en 0
    x = voltea(quitaPorDetras(voltea(x), n));
    x = quitaPorDetras(x, 1);
    return x;
  }

  /**
   * Le quita a un número <code>n</code> dígitos por delante (por la izquierda).                                                 *
   * @param x número entero
   * @param n número de dígitos que se le van a quitar
   * @return  número inicial <code>x</code> con <code>n</code> dígitos menos
   *          quitados de la izquierda
   */
  public static int quitaPorDelante(int x, int n) {
    return (int)quitaPorDelante((long)x, n);
  }
  
  
  ////////////// FUNCION EJERCICIO 12 PEGA POR DELANTE UN NUMERO/////////
  /**
   * Añade un dígito a un número por delante (por la izquierda).
   *
   * @param x número entero
   * @param d dígito que se le va a pegar por la izquierda
   * @return  número inicial <code>x</code> con el dígito <code>d</code> pegado
   *          por la izquierda
   */
  public static long pegaPorDelante(long x, int d) {
    return juntaNumeros(d, x);
  }

  /**
   * Añade un dígito a un número por delante (por la izquierda).
   *
   * @param x número entero
   * @param d dígito que se le va a pegar por la izquierda
   * @return  número inicial <code>x</code> con el dígito <code>d</code> pegado
   *          por la izquierda
   */
  public static int pegaPorDelante(int x, int d) {
    return (int)pegaPorDelante((long)x, d);
  }
  
  //////////// FUNCION EJERCICIO 13 TROCEAR NUMERO //////////////////
  /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y
   * devuelve el trozo correspondiente.
   * <p>
   * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
   *
   * @param x      número entero
   * @param inicio posición inicial
   * @param fin    posición final
   * @return       trozo de número compuesto por todos los dígitos que van desde
   *               la posición inicial a la posición final incluyendo ambos
   */
  public static long trozoDeNumero(long x, int inicio, int fin) {
    int longitud = cuentaDigitos(x);
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x, longitud - fin - 1);
    return x;
  }

}
