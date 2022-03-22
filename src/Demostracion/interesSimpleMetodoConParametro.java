
package Demostracion;


public class interesSimpleMetodoConParametro {
    public static void main(String[] args) {
        double cantidadPrestada, tiempo,tasaDeInteres;
        cantidadPrestada=1500.00;
        tiempo= 0.75;// 9 mese equivale a 9/12 años =2/4 o 0,75
        tasaDeInteres=0.08;
        // envio de parametros  al metodo
        double valorInteresSimple= calcularInteresSimple(cantidadPrestada, tiempo, tasaDeInteres);
        System.out.println("El interes es: $"+valorInteresSimple);//muestra el resultado
        
    }
    public static double calcularInteresSimple(double cantidadPrestada, double tiempo, double tasaDeInteres) {
        double interesSimple;
        interesSimple= cantidadPrestada* tiempo* tasaDeInteres;
        return interesSimple;//fectua la operacion dentro del metodo
        
    }
}
