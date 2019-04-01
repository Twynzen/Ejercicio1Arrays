/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosejercicio1;

import java.util.Scanner;

/**
 *
 * @author LuisF
 */
public class Arreglosejercicio1 {

    
    public static void main(String[] args) {
        Scanner  entrada = new Scanner (System.in);
        float[] nums1 = new float[5];
        
        System.out.println("Guardando los datos en el arreglo");
        
        for(int i = 0;i<5;i++){
        System.out.print((i+1)+"Digite un numero: ");
        nums1[i]=entrada.nextFloat();
        
        }
        
        System.out.print("\n Imprimir los elementos del arreglo: ");
        for(float i: nums1){
         System.out.print(i);  
        }
       
    }
    
}
