/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_ordenamientos;

//se agrega un comentario

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 Ordenar los numeros de un arreglo 
 metodo burbuja : es un algoritmo de ordenamiento ordena desde el mas pequeño 
 */
public class MetodoBurbuja {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arreglo[] , nElementos, aux ;
        
        //numero de elementos del arreglo
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese le cantidad de elementos del arreglo : "));
        
        arreglo = new int[nElementos] ; //asigna numero de elementoss al arreglo 
        
        //llenar arreglo
        for (int i = 0; i <nElementos; i++) {
            
            System.out.print((i+1) + ".- Digite un numero : ");
            arreglo[i] = sc.nextInt() ;//almacena los datos en el arreglo

        }
        //Método burbuja
        for (int i = 0; i < (nElementos-1); i++) { //ver cuantas cuenta va a dar 
            
            for (int j = 0; j < (nElementos-1); j++) { //sirve para ordenar el arreglo e intercambiar los numeros
                if (arreglo[j] > arreglo[j+1]   ) { //si numero actual es mayor a numero siguiente
                    //intercamboiando el valor los numeros para ordenar 
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1] ;
                    arreglo[j+1] = aux ;
                }
                
                
                System.out.println("Muetra el arreglo ordenado de forma creciente");
                for (int k = 0; k < nElementos; k++) {
                    System.out.print(arreglo[k] + "  ");
                }
                
                System.out.println("\nArreglo ordenado en forma decreciente ");
                for (int k = nElementos-1; k >= 0; k--) {
                    
                    System.out.print(arreglo[k] + "  ");
                    
                }
                
            }
            
            
        }
        
        
        
          System.out.print(" Metodo burbuja es un metodo de ordenamiento ");

          System.out.println("Prueba cambio en git" )  ;        
        
        
        
        
    }
    
}
