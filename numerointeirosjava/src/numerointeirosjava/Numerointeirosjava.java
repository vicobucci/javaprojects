package numerointeirosjava;
import java.util.Scanner;
/**
 *
 * @author vinicius.cobucci
 */
public class Numerointeirosjava {

  
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    
    int numeros [] = {numero1, numero2, numero3, numero4};



        System.out.println("Informe a primeira Nota: ");
        numero1 = scanner.nextFloat();
        System.out.println("Informe a segunda Nota: ");
         numero2 = scanner.nextFloat();
         System.out.println("Informe a terceira Nota: ");
          numero3 = scanner.nextFloat();
          System.out.println("Informe a quarta Nota: ");
           numero4 = scanner.nextFloat();
    
    int divisivel1 =  (numero % 3 == 0);
    int divisivel2 =  (numero % 2 == 0);
    
    if numero = divisivel1 {
        System.out.println("Numero divisivel por 3");
    }
    else if numero = divisive2 {
         System.out.println("Numero divisivel por 2");
    }
    else {
        System.out.println("Erro");
    }
    }
    
}
