/**
 * 4. Sentencia Condicional
 *
 * 16. Realiza un programa que nos diga si hay probabilidad de que
 *     nuestra pareja nos está siendo infiel. El programa irá haciendo
 *     preguntas que el usuario contestará con una v (verdadero) o una
 *     f (falso). Cada pregunta contestada con v sumará 3 puntos.
 *     Las preguntas contestadas con f no suman puntos. Utiliza el
 *     fichero test_infidelidad.txt para obtener las preguntas y las
 *     conclusiones del programa.
 *
 * @author Adrián Egea Hermoso
 * 
 */
public class Ejercicio16TestInfidelidad {

  public static void main(String[] args) {
    
    String respuesta;
    int puntos = 0;
    
    System.out.println("TEST DE FIDELIDAD O INFIDELIDAD");
    System.out.println("Este programa te dirá si hay probabilidad de que tu pareja te esté siendo infiel.\n");
    System.out.println("Responde con la letra 's' para respuesta positiva y con la letra 'n' para respuesta negativa");

    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.\nsi o no: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("s") ) {
      puntos += 2;
    }

    System.out.print("2. Ha aumentado sus gastos de vestuario.\nsi o no: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("s") ) {
      puntos += 2;
    }
    
    System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti.\nsi o no: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("s") ) {
      puntos += 2;
    }

    System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).\nsi o no: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("s") ) {
      puntos += 2;
    }
    
    System.out.print("5. No te deja que mires la agenda de su teléfono móvil.\nsi o no: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("s") ) {
      puntos += 2;
    }
    
    System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.\nsi o no: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("s") ) {
      puntos += 2;
    }
        
    System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.\nsi o no: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("s") ) {
      puntos += 2;
    }
    
    System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.\nsi o no: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("s") ) {
      puntos += 2;
    }
    
    System.out.print("9. Has notado que últimamente se perfuma más.\nsi o no: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("s") ) {
      puntos += 2;
    }
    
    System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.\nsi o no: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("s") ) {
      puntos += 2;
    }
    
    
    
    if ( puntos <= 6 ) {
      System.out.print("Tu pareja es fiel a ti");
    }
    
    if ( (puntos >= 8 ) && (puntos <= 15) ) {
      System.out.print("Andate con OJO, existe alguna posibilidad de infidelidad");    
    }
    
    if ( puntos >= 16 ) {
      System.out.print("Ve contratando un detective privado que haga algunas fotos o directamente un abogado");
    }
  }
}
