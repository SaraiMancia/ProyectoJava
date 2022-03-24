
package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        double mVentas;
        int nAutos;
        String nombre;
        
        System.out.println("Ingrese su nombre: ");
        nombre=leer.nextLine();
        System.out.println("Ingrese el numero de autos vendidos en el mes: ");
        nAutos=leer.nextInt();
        System.out.println("Ingrese el monto de ventas  los autos vendidos: ");
        mVentas=leer.nextDouble();
        
       double sTotal=Ejercicio3.salarioTotal(mVentas);
  
        System.out.println("Nombre del vendedor: "+nombre);
        System.out.println("El numero de autos vendidos: "+nAutos);
        System.out.println("El salario devengado para el vendedor es: $"+sTotal);
        
    }
    public static double salarioTotal(double mVentas){
        double salario=800.00;
        double comision=170.00;
        double porcentajeV;
        double calcular;
        
        porcentajeV=5*mVentas/100;
        calcular= salario+comision+porcentajeV;
        return calcular;
    }
}
