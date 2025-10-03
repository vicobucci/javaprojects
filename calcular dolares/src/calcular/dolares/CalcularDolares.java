package calcular.dolares;

import java.util.Scanner;

/**
 *
 * @author vinicius.cobucci
 */
public class CalcularDolares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     CalcularValorCofre();       
    }
       
    static void CalcularValorCofre(){
             double qtDolares = 0.0d;
             double cotacaoDolar = 0.0d;
             double valorReais = 0.0d;
       Scanner scanner = new Scanner(System.in);   
     //entrada dados      
        System.out.print("Informe quantos dolares ha no cofre: ");
         qtDolares = scanner.nextDouble();
        System.out.print("Quanto esta a cotacao do dolar?");
         cotacaoDolar = scanner.nextDouble();
         
    //processamento
    valorReais = qtDolares * cotacaoDolar;
    
    // saida
    
     System.out.print("Informe quantos dolares ha no cofre" + valorReais);
    }
    
}
