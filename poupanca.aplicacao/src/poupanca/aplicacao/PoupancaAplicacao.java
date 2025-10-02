/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poupanca.aplicacao;
import java.util.Scanner;
/**
 *
 * @author vinicius.cobucci
 */
public class PoupancaAplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double  i;
        double  p;
        double  n;
                
      Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a Taxa: ");
        i = scanner.nextFloat();
        System.out.println("Informe a Aplicação mensal: ");
         p = scanner.nextFloat();
         System.out.println("Informe o Número de meses: ");
          n = scanner.nextFloat();
          
       double resultado = Math.pow(p*(1+i), n-1);
       double valorAcumulado = resultado / i;
       
       System.out.println("Seu valor acumulado é" + valorAcumulado );
                
        
       
        
        
       
                
        
    }
    
}
