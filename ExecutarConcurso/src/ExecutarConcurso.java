import java.util.ArrayList;
import java.util.Scanner;

public class ExecutarConcurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matérias fixadas em 3, com entrada pelo usuário
        int quantidadeMaterias = 3;
        String[] materias = new String[quantidadeMaterias];

        for (int i = 0; i < quantidadeMaterias; i++) {
            System.out.println("Digite o nome da matéria " + (i + 1) + ":");
            materias[i] = scanner.nextLine();
        }

        // Listas para armazenar os dados
        ArrayList<String> candidatos = new ArrayList<>();
        ArrayList<ArrayList<Double>> notas = new ArrayList<>();
        ArrayList<Double> medias = new ArrayList<>();
        ArrayList<Integer> situacoes = new ArrayList<>(); // 1 = Aprovado, 0 = Reprovado

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Digite o nome do Candidato:");
            String nome = scanner.nextLine();
            candidatos.add(nome);

            ArrayList<Double> notasCandidato = new ArrayList<>();
            boolean nenhumaNotaBaixa = true;
            double somaNotas = 0;

            // Coletar notas com validação (entre 1 e 10)
            for (String materia : materias) {
                double nota = 0;
                boolean notaValida = false;

                while (!notaValida) {
                    System.out.println("Digite a nota de " + materia + " para " + nome + " (entre 1 e 10):");
                    nota = scanner.nextDouble();

                    if (nota >= 1 && nota <= 10) {
                        notaValida = true;
                    } else {
                        System.out.println("Nota inválida. Digite um valor entre 1 e 10.");
                    }
                }

                notasCandidato.add(nota);
                somaNotas += nota;

                if (nota < 2) {
                    nenhumaNotaBaixa = false;
                }
            }

            scanner.nextLine(); // Limpar buffer
            notas.add(notasCandidato);

            double media = somaNotas / quantidadeMaterias;
            medias.add(media);

            // Situação
            if (media > 4 && nenhumaNotaBaixa) {
                situacoes.add(1); // Aprovado
            } else {
                situacoes.add(0); // Reprovado
            }

            System.out.println("Adicionar outro Candidato? (s/n):");
            continuar = scanner.nextLine();
            System.out.println("-----------------------------------");
        }

        // Criar vetor de totais [0] = aprovados, [1] = reprovados
        int[] totais = new int[2];

        // Exibir os resultados
        System.out.println("\nRESULTADOS FINAIS");
        System.out.println("==========================");

        for (int i = 0; i < candidatos.size(); i++) {
            System.out.println("Candidato: " + candidatos.get(i));
            ArrayList<Double> notasCandidato = notas.get(i);

            for (int j = 0; j < materias.length; j++) {
                System.out.println(materias[j] + ": " + notasCandidato.get(j));
            }

            double media = medias.get(i);
            System.out.println("Média: " + media);

            int situacao = situacoes.get(i);
            if (situacao == 1) {
                System.out.println("Situação: Aprovado");
                totais[0]++;
            } else {
                System.out.println("Situação: Reprovado");
                totais[1]++;
            }

            System.out.println("-----------------------------");
        }

        // Exibir total de aprovados e reprovados
        System.out.println("\nRESUMO FINAL");
        System.out.println("==========================");
        System.out.println("Total de Aprovados: " + totais[0]);
        System.out.println("Total de Reprovados: " + totais[1]);

        scanner.close();
    }
}
