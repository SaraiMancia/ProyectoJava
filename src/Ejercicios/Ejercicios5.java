
package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicios5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        NumberFormat F=new DecimalFormat("#0.00");
        
        
        String nombre;
        int minutos;
        double Salario;
        
    
        System.out.println("Ingrese su nombre: ");
        nombre=leer.nextLine();
        System.out.println("Ingrese su salario: ");
        Salario=leer.nextDouble();
        System.out.println("Ingrese los minutos que ha llegado tarde: ");
        minutos=leer.nextInt();
        
        double DHora,desH=0.0253,SD,renta,Drenta;

        /*para saber cuanto vale el minuto se hace lo siguiente
        365/30=12.16/8horas=1.52xhora.1.52*60min=0.025333
        */
        
        DHora=minutos*desH;
        
        SD=Salario-DHora;
        
        renta=SD*10/100;
        
        Drenta= SD-renta;
     
     System.out.println("Nombre del empleado: "+nombre);
        
        System.out.println("El descuento por llegadas tardias: "+F.format(DHora));
        
        System.out.println("La retencion de la renta es: $"+F.format(renta));
       
        System.out.println("El salario bruto de "+nombre+" es: $"+F.format(Drenta));
    }
     
}
