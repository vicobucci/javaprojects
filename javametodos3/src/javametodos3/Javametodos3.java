package javametodos3;
import java.util.Scanner;

public class Javametodos3 {

    // Método que retorna 1 se ímpar e 0 se par
    public static int resultado(double numero) {
        if (numero % 2 == 0) {
            return 0; 
        } else {
            return 1; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o numero desejado:");
        double numero = scanner.nextDouble();
        
        int retorno = resultado(numero);
        
        // Exibe o resultado com texto explicativo
        if (retorno == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
        
        scanner.close();
    }
}