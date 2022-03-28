
package Ejercicios;
 import java.util.Scanner;
public class Ejercicio4 {

    
    public static void main(String[] args) {
        
    
        Scanner leer= new Scanner(System.in);
        
     
        int nComputadoras;
        String nombre;
        
        System.out.println("Ingrese su nombre: ");
        nombre=leer.nextLine();
        System.out.println("Ingrese el numero de computadoras vendidas en el mes: ");
        nComputadoras=leer.nextInt();      
      
       
        double salario=300.00;
        double comision=50.00;
        double calculo;
        
        double scomision=0;
        
        calculo=nComputadoras*comision;
        scomision=calculo+salario;
     
        double renta,larioTotal;
        
        renta=scomision*10/100;
        larioTotal=scomision-renta;
        
        System.out.println("Nombre del vendedor: "+nombre);
        System.out.println("Numero de computadoras vendidas: "+nComputadoras);
        System.out.println("El salario devengado del vendedor es: $"+scomision);
          System.out.println("El pago de la renta es: $"+larioTotal);

          
  
 
    } 
   
}
