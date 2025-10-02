package exercicios.sequenciais;
import java.util.Scanner;


public class ExerciciosSequenciais {


    public static void main(String[] args) {        
  
 {
        Scanner scanner = new Scanner(System.in);

        // Pesos definidos
        int[] pesos = {1, 2, 3, 4};
        double[] numeros = new double[4];

        // Entrada dos números
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextDouble();
        }

        // Cálculo da média ponderada
        double somaPonderada = 0;
        int somaPesos = 0;

        for (int i = 0; i < 4; i++) {
            somaPonderada += numeros[i] * pesos[i];
            somaPesos += pesos[i];
        }

        double mediaPonderada = somaPonderada / somaPesos;

        // Exibe o resultado
        System.out.printf("A média ponderada é: %.2f\n", mediaPonderada);

        scanner.close();
    }
}
        
    
    
}
