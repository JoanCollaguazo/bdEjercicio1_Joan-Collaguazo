/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author OxOrboy!
 */
public class Matrices {
    int matriz1[][] = new int[3][3];
    int matriz2[][] = new int[3][3];
    int matrizsuma[][] = new int[3][3];

    public void LlenaMatriz1() {        
        for (int i = 0; i < matriz1.length; i++) {            
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = (int)(Math.random()*5);
            }

        }

    }

    public void LlenaMatriz2() {
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = (int)(Math.random()*5);

            }

        }

    }

    public void SumadeMatrices() {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matrizsuma[i][j]= matriz1[i][j] + matriz2[i][j];
                
            }            
        }//IMPRESION DE LAS MATRICES:
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("[ "+matriz1[i][j] + " ] ");
            }
            
            if(i==1){
            System.out.print("   +   ");
            
            }else{
            System.out.print("      ");
            }
            
            
            for (int j = 0; j < matriz2.length; j++) {
               System.out.print("[ "+matriz2[i][j] + " ] "); 
  
            }                  
            if(i==1){
            System.out.print("   =   ");
            
            }else{
            System.out.print("      ");
            }
            for (int j = 0; j < matrizsuma.length; j++) {
               System.out.print("[ "+matrizsuma[i][j] + " ] "); 
  
            }    
            
            System.out.println(""); 
            
        }
//        for (int i = 0; i < matrizsuma.length; i++) {
//            System.out.println("[ "+matriz1[i][j] + " ] ");
//    }

    }
    
}
