import java.util.ArrayList;
import java.util.Scanner;

public class PrjRepeticaoProvasVestibular2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listas para armazenar os dados dinamicamente
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> portugues = new ArrayList<>();
        ArrayList<Double> matematica = new ArrayList<>();
        ArrayList<Double> conhecimentos = new ArrayList<>();
        ArrayList<Double> medias = new ArrayList<>();
        ArrayList<Integer> situacoes = new ArrayList<>(); // 1 = aprovado, 0 = recuperação, -1 = reprovado

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Digite o nome do participante:");
            String nome = scanner.nextLine();
            nomes.add(nome);

            System.out.println("Digite a nota de Portugues para " + nome + ":");
            double notaPort = scanner.nextDouble();
            portugues.add(notaPort);

            System.out.println("Digite a nota de Matematica para " + nome + ":");
            double notaMat = scanner.nextDouble();
            matematica.add(notaMat);

            System.out.println("Digite a nota de Conhecimentos Gerais para " + nome + ":");
            double notaCon = scanner.nextDouble();
            conhecimentos.add(notaCon);

            // Consumir quebra de linha pendente
            scanner.nextLine();

            // Calcular média
            double media = (notaPort + notaMat + notaCon) / 3;
            medias.add(media);

            // Verificar situação
            boolean nenhumaNotaBaixa = notaPort >= 2 && notaMat >= 2 && notaCon >= 2;

            if (media > 4 && nenhumaNotaBaixa) {
                situacoes.add(1); // Aprovado
    } else if (media < 2) {
                situacoes.add(-1); // Reprovado
            } else {
                situacoes.add(0); // Recuperação
            }

            System.out.println("Adicionar outro aluno? (s/n):");
            continuar = scanner.nextLine();
            System.out.println("-----------------------------------");
        }

        // Exibir os resultados
        System.out.println("\nRESULTADOS FINAIS");
        System.out.println("==========================");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Participante: " + nomes.get(i));
            System.out.println("Portugues: " + portugues.get(i));
            System.out.println("Matematica: " + matematica.get(i));
            System.out.println("Conhecimentos Gerais: " + conhecimentos.get(i));
            System.out.println("Media: " + medias.get(i));

            int situacao = situacoes.get(i);
            if (situacao == 1) {
                System.out.println("Situacao: Aprovado");
            } else if (situacao == -1) {
                System.out.println("Situacao: Reprovado");
            } else {
                System.out.println("Situacao: Recuperacao");
            }

            System.out.println("-----------------------------");
        }

        scanner.close();
    }
}