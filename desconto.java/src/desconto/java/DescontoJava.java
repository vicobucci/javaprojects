/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desconto.java;
import java.util.Scanner;
/**
 *
 * @author vinicius.cobucci
 */
public class DescontoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   
                
     float valor = 0 ;
     float desconto = 0.09f;
     
     Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a Valor do Produto: ");
        valor = scanner.nextFloat();
        
     float novoPreco = (valor * desconto);
  
     System.out.println("Seu novo valor é" + novoPreco );
     
     
    }
    
}
