package lista.metodos1;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class ListaMetodos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalcularSoma();
    }
    
    static void CalcularSoma(){
    Scanner scanner = new Scanner(System.in);
    
            double calcularSoma = 0.0d;
            double numero1 = 0.0d;
            double numero2 = 0.0d;
            
            System.out.print("Informe o primeiro numero: ");
                numero1 = scanner.nextDouble();
            System.out.print("Informe o segundo numero: ");
                numero2 = scanner.nextDouble();
            
             calcularSoma = numero1 + numero2;    
             
            System.out.print("A soma dos valores é: " + calcularSoma );
            
    }
    
}
