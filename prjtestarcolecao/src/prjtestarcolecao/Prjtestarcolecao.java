/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjtestarcolecao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinicius.cobucci
 */
public class Prjtestarcolecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         List<String> textos = new ArrayList<String>();
         
         for(int i=10; i<20; i++){
        String s = "Cliente" + (i+1);
        textos.add(s);
         }
        System.out.println(textos);
        
        for(String texto: textos){
            System.out.println(texto);
            System.out.print(";");
        
            System.out.println();
       
        }
    }
    
}
