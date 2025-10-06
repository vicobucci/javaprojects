package javametodos2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Javametodos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuboValor();
    }
    
    static void CuboValor(){
    
        double numero = 0.0d;
        double cuboValor = 0.0d;
    
    Scanner scanner = new Scanner(System.in);
    
            System.out.println("Informe o numero: ");
            numero = scanner.nextDouble();
            
            cuboValor = Math.pow(numero, 3);
            
           System.out.println("O cubo do numero é: " + cuboValor);
    
    
    }
    
    
    
    
    
    
}
