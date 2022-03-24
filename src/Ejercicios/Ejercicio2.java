
package Ejercicios;

 import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        double precio,flete,seguro;
        System.out.println("Ingrese precio del vehiculo 2010: ");
        precio= leer.nextDouble();
        System.out.println("Ingrese el valor del flete: ");
        flete=leer.nextDouble();
        System.out.println("Ingrese el valor del seguro: ");
        seguro=leer.nextDouble();
        
        double montoDai=Ejercicio2.metodoDai(precio,flete,seguro);
        
        System.out.println("Valor del vehiculo: $"+precio);
        System.out.println("Valor del flete: "+flete);
        System.out.println("Valor del Seguro"+seguro);
        System.out.println("Valor del DAI: "+montoDai);
    }
    
    public static double metodoDai(double precio,double flete, double seguro) {
        
        double DAI=0,depreciacion;
        
        depreciacion=precio*0.10;
        
        DAI=(precio-depreciacion-flete-seguro)*0.25;
        return DAI;
    }
}
 