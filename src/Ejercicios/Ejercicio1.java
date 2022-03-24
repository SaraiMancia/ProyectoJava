
package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
          NumberFormat formato=new DecimalFormat("#0.00");
        Scanner leer= new Scanner  (System.in);
        
         double precio,descuento, pdescuento,iva, pfinal;
          
         System.out.println("Escriba el precio de la computadora: ");
         
         precio= leer.nextDouble();
      
          descuento= 15*precio/100;
          
          pdescuento= precio-descuento;
          
          iva= pdescuento*15/100;
          
          pfinal= pdescuento+iva;
          
          
          System.out.println("El precio con descuento es: $"+formato.format(pdescuento));
          System.out.println("El precio aplicado con IVA es: $"+formato.format(iva));
          System.out.println("El precio final es: $"+formato.format(pfinal));
        
    }
}
