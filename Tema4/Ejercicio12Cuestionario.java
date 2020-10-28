/**
 * 4. Sentencia Condicional
 *
 * 12. Realiza un minicuestionario con 5 preguntas tipo test.
 *     Cada pregunta acertada sumará un punto. El programa mostrará al final 
 *     la califcación obtenida.
 *
 * @author Adrián Egea Hermoso
 */
public class Ejercicio12Cuestionario {

  public static void main(String[] args) {
    
    int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO DE ADRIÁN EGEA");
    System.out.println("ARE YOU READY!!!???");
    
    System.out.println("1. Empieza por M. ¿Como se llama la nave de Star Lord?.");
    respuesta = System.console().readLine();
    if (respuesta.equals("Milano")) {
      puntos++;
    }

    System.out.println("2. Empieza por M. Serie de Star Wars basada en un Mandaloriano.");
    respuesta = System.console().readLine();  
    if (respuesta.equals("Mandalorian") || respuesta.equals("Mandaloriano")) {
      puntos++;
    }

    System.out.println("3. Empieza por T. Película ganadora de 11 oscars.");
    respuesta = System.console().readLine();
    if (respuesta.equals("Titanic")) {
      puntos++;
    }
    
    System.out.println("4. Empieza por M. Provincia donde son típicos los espetos de sardinas.");
    respuesta = System.console().readLine();
    if (respuesta.equals("Málaga") || respuesta.equals("Málaga")) {
      puntos++;
    }
    
    System.out.println("5. Empieza por U y termina por 2. Grupo de música que canta Elevation.");
    respuesta = System.console().readLine();
    if (respuesta.equals("U2")) {
      puntos++;
    }

    System.out.println("Ha obtenido " + puntos + " puntos.");
  }
}
