package ejercicios_ordenamientos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author KGONZALEZ
 */
public class CalcularPagos {

    public static List<Double> generarCuotas(double monto, int cantidad, Date primerVencimiento) {
        
        List<Double> cuotas = new ArrayList<>();
        double montoCuotas = monto / cantidad;
		double montoTotal =0 ;
        for (int i = 0; i < cantidad; i++) {
            cuotas.add(montoCuotas);
            
        }
        return cuotas;
    }
    
    public static void main(String[] args) {
        
           List<Double> cuotas = CalcularPagos.generarCuotas(1000, 10, new Date());

          System.out.println(cuotas )  ;
		  
		  System.out.println("Prueba cambio en git" )  ;
         
System.out.println("revusar el git status git" )  ;
		
	
        
        
    }
    
    
}
