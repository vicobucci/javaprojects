import java.util.Random;

public class PrjRepeticaoProvasVestibular {
    public static void main(String[] args) {
        Random random = new Random();

        // Arrays para armazenar notas e médias
        double[] portugues = new double[10];
        double[] matematica = new double[10];
        double[] conhecimentos = new double[10];
        double[] medias = new double[10];
        int[] situacoes = new int[10]; // 1 = aprovado, 0 = recuperação, -1 = reprovado

        // Preenchendo os arrays com valores aleatórios e calculando médias
        for (int i = 0; i < 10; i++) {
            portugues[i] = random.nextDouble() * 10;
            matematica[i] = random.nextDouble() * 10;
            conhecimentos[i] = random.nextDouble() * 10;

            medias[i] = (portugues[i] + matematica[i] + conhecimentos[i]) / 3;

            // Regras de aprovação ajustadas
            boolean nenhumaNotaBaixa = portugues[i] >= 2 && matematica[i] >= 2 && conhecimentos[i] >= 2;

            if (medias[i] > 4 && nenhumaNotaBaixa) {
                situacoes[i] = 1; // Aprovado
            } else if (medias[i] < 2) {
                situacoes[i] = -1; // Reprovado
            } else {
                situacoes[i] = 0; // Recuperação
            }
        }

        // Exibindo os resultados
        for (int i = 0; i < 10; i++) {
            System.out.println("Participante " + (i + 1));
            System.out.println("Portugues: " + portugues[i]);
            System.out.println("Matematica: " + matematica[i]);
            System.out.println("Conhecimentos Gerais: " + conhecimentos[i]);
            System.out.println("Media: " + medias[i]);

            // Mostrando a situação com base no número
            if (situacoes[i] == 1) {
                System.out.println("Situacao: Aprovado");
            } else if (situacoes[i] == -1) {
                System.out.println("Situacao: Reprovado");
            } else {
                System.out.println("Situacao: Recuperacao");
            }

            System.out.println("-----------------------------");
        }
    }
}
