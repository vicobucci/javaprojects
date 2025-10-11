/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package prjtestararrayprimitivos;

/**
 *
 * @author vinicius.cobucci
 */
public class testsala {

    
   
    public static void main(String args[]) {
       
        int[] inteiros;
        double[] doubles;
        
        inteiros = new int[10];
        doubles = new double[inteiros.length];
        
                
       for (int i=0; i < 10; i++){
       inteiros[i] = i+1;
       doubles[i] = Math.random();
       
       
       System.out.println(inteiros[i]);
       
       }
       {
        System.out.println("------------------------------------");
        }
        
       
        for (int i=0; i < 10; i++){
        System.out.println(doubles[i]);
        }
        
       
       }
    }

