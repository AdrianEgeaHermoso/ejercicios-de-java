/**
 * 
 * author: Adrián Egea Hermoso
 */
public class Ex04aeh3 {
  public static void main (String [] args){
    System.out.println("FACTURA TIENDA");
    System.out.println("==============");
    String nombre = "";
    double precioUnidad = 0;
    int cantidad = 0;
    int iva = 0;
    double iva4 = 0;
    double iva10 = 0;
    double iva21 = 0;
    double total = 0;
    do{
      System.out.print("Introduzca el nombre del artículo ('fin' para salir): ");
      nombre = System.console().readLine();
      if( !(nombre.equals("fin"))){
        System.out.print("Precio por unidad para " + nombre + " (IVA incluido): ");
        precioUnidad = Double.parseDouble(System.console().readLine());
        System.out.print("Cantidad de unidades de " + nombre + " : ");
        cantidad = Integer.parseInt(System.console().readLine());
        System.out.print("Tipo de IVA aplicado a " + nombre + " (4,10,21): ");
        iva = Integer.parseInt(System.console().readLine());
        switch (iva){
          case 4:
            iva4 += (((precioUnidad * cantidad) * 100) / 104);  
          break;
          
          case 10:
            iva10 += (((precioUnidad * cantidad) * 100) / 110);
          break;
          
          case 21:
            iva21 += (((precioUnidad * cantidad) * 100) / 121);
          break;
          default:
        }
        total += cantidad * precioUnidad;
      }
    }while(!(nombre.equals("fin")));
    System.out.println();
    System.out.printf("%-35s %8.2f\n", "TOTAL:", total);
    for( int i = 0; i < 45; i++){
      System.out.print("-");
    }
    System.out.println();
    System.out.printf("%-24s %8.2f %-4s %5.2f\n", "Base imponible   4%:",iva4,"IVA:", iva4 * 0.04);
    System.out.printf("%-24s %8.2f %-4s %5.2f\n", "Base imponible  10%:",iva10,"IVA:", iva10 * 0.10);
    System.out.printf("%-24s %8.2f %-4s %5.2f\n", "Base imponible  21%:",iva21,"IVA:", iva21 * 0.21);
  }
}
