
package Ejercicios;

import java.util.Scanner;
public class Ejercicios5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        String nombre;
        int minutos;
        double salario;
        
        System.out.println("Ingrese su nombre: ");
        nombre=leer.nextLine();
        System.out.println("Ingrese su salario: ");
        salario=leer.nextDouble();
        System.out.println("Ingrese los minutos que ha llegado tarde: ");
        minutos=leer.nextInt();
        
        System.out.println("Nombre del empleado: "+nombre);
        System.out.println("El descuento por llegadas tardias: "+Ejercicios5.Minutos(minutos));

        
        
    }
    
    public static double Minutos(int minutos){
        /*para saber cuanto vale el minuto se hace lo siguiente
        365/30=12.16/8horas=1.52xhora.1.52*60min=0.025333
        */
       double descuentoHora=0.0253;
       double DHora;
       
       DHora=minutos*descuentoHora;
       
       return DHora;
        
    }
    
    public static double salario(double salario, double DHora) {
        double salarioDhora;
        
        salarioDhora= salario-DHora;
        return salarioDhora;
        
    }
    
    public static double Renta(double salarioDhora) {
        double renta;
       
        renta=salarioDhora*10/100;
        return renta;
        
    }
    
    public static double Drenta(double renta, double salarioDHora) {
        double descuentoRenta;
        
       descuentoRenta=salarioDHora-renta;
       return descuentoRenta;
        
    }
    
}
