package valores.diferentes;
import java.util.Scanner;

public class ValoresDiferentes {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     int numero; 
     
         System.out.println("Informe o Numero: ");
         numero = scanner.nextInt();
          
     
      
    if (numero >0) {
    System.out.println("Seu numero é Positivo");
     }
    else if (numero <0) {
    System.out.println("Seu numero é Negativo");
    }
    else {
    System.out.println("Seu numero é Zero");
    }        
   // ele if (numero == 0) {
   // System.out.println("Seu numero é Zero");
   // }        
             
             
             
    }
    
}
