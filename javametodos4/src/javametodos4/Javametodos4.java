package javametodos4;
import java.util.Scanner;

public class Javametodos4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite algo: ");
            String entrada = scanner.nextLine();
            for (char c : entrada.toCharArray()) {
                if (Character.isDigit(c)) {
                    System.out.println(c + " é um número");
                } else if (Character.isLetter(c)) {
                    System.out.println(c + " é uma letra");
                } else if (Character.isWhitespace(c)) {
                    System.out.println("Espaço em branco");
                } else {
                    System.out.println(c + " é outro tipo de caractere");
                }
            }
            // boa prática: fecha o Scanner
        }
    }
}