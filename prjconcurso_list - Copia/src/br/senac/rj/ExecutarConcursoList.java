package br.senac.rj;

import br.senac.rj.candidato.Candidato;
import br.senac.rj.concurso.Concurso;
import br.senac.rj.materia.Materia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author marcos.silva
 */
public class ExecutarConcursoList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Concurso concurso = new Concurso();

    // Agora usando o método interativo
    List<Candidato> candidatos = receberCandidatos();

    if (candidatos == null || candidatos.isEmpty()) {
        System.out.println("Nenhum candidato inserido. Encerrando o programa.");
        System.exit(0);
    }

    concurso.setCandidatos(candidatos);

    gerarSituacaoCandidatos(concurso);
    // apresentarResultados(concurso); // Descomente se já estiver pronto
}

                
  /*  
    static Candidato[] receberCandidatos() {
        Candidato[] candidatos = null;
        int qtdCandidatosConcurso = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de candidatos do Concurso: ");
        qtdCandidatosConcurso = scanner.nextInt();
        
        if (qtdCandidatosConcurso > 0) {
            candidatos = new Candidato[qtdCandidatosConcurso];
            for(int i=0; i<qtdCandidatosConcurso; i++) {
                System.out.println();
                System.out.print("Informe o nome do " + (i+1) + "o. candidato(a): ");
                String nome = scanner.next();
                
                System.out.print("Informe a nota da prova de Português do " + (i+1) + "o. candidato(a): ");
                float notaPortugues = scanner.nextFloat();
                Materia materiaPort = new Materia();
                materiaPort.setNome("Portugues");
                materiaPort.setNota(notaPortugues);
                
                System.out.print("Informe a nota da prova de Matemática do " + (i+1) + "o. candidato(a): ");
                float notaMatematica = scanner.nextFloat();
                Materia materiaMatem = new Materia();
                materiaMatem.setNome("Matematica");
                materiaMatem.setNota(notaMatematica);

                System.out.print("Informe a nota da prova de Conhecimentos Gerais do " + (i+1) + "o. candidato(a): ");
                float notaConhecGerais = scanner.nextFloat();
                Materia materiaCG = new Materia();
                materiaCG.setNome("Conhecimentos Gerais");
                materiaCG.setNota(notaConhecGerais);
                
                // vetor de materias do candidato
                Materia[] materiasCandidato = new Materia[3];
                materiasCandidato[0] = materiaPort;
                materiasCandidato[1] = materiaMatem;
                materiasCandidato[2] = materiaCG;
                
                // definindo o candidato
                Candidato candidato = new Candidato();
                candidato.setNome(nome);
                candidato.setMaterias(materiasCandidato);
                
                // atribuir o candidato ao vetor de candidatos do concurso    
                candidatos[i] = candidato;
            }
        }
        
        return candidatos;
    }
  */
    // gerar a situacao de cada candidato
    static void gerarSituacaoCandidatos(Concurso concurso) {
        List<Candidato> candidatos = concurso.getCandidatos();
        for (Candidato candidato : candidatos) {
            candidato.avaliarSituacao();
            
            System.out.println(candidato.toString());
        }
        
        concurso.calcularMedias();
    }
 /*   
    static void apresentarResultados(Concurso concurso) {
        String[] aprovados = concurso.getNomeAprovados();
        double mediaPortugues = concurso.getMedias()[0];
        int qtdCandidatos = concurso.getCandidatosMediaConhecimentosGerais();
        int qtdAprovadosMatematica = concurso.getCandidatosAprovadosMatematicaAcimaDe5();
        
        System.out.println("---------- Resultados ----------");
        System.out.println("--- Candidatos aprovados ---");
        if (aprovados != null && aprovados.length > 0) {
            for(int i=0; i<aprovados.length;i++) {
                System.out.println(aprovados[i]);
            }
        } else {
            System.out.println("  Nao ha candidatos aprovados");
        }
        System.out.println();
        System.out.printf("Media da prova de portugues: %.2f", mediaPortugues);
        System.out.println();
        System.out.printf("Qtd candidatos que obtiveram media maior que 4.5 e "
            + "nota de Conhecimentos Geral maior que 6: %d", qtdCandidatos);
        
        System.out.println();
        System.out.printf("Qtd candidatos aprovados que obtiveram nota em "
            + "Matematica: acima de 5,0: %d", qtdAprovadosMatematica);

        System.out.println();
    }
 
    static Candidato[] receberCandidatos_v2() {
        Candidato[] candidatos = null;
        int qtdCandidatosConcurso = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de candidatos do Concurso: ");
        qtdCandidatosConcurso = scanner.nextInt();
        
        if (qtdCandidatosConcurso > 0) {
            candidatos = new Candidato[qtdCandidatosConcurso];
            for(int i=0; i<qtdCandidatosConcurso; i++) {
                System.out.println();
                System.out.print("Informe o nome do " + (i+1) + "o. candidato(a): ");
                String nome = scanner.next();
                
                Materia[] materiasCandidato = new Materia[3];
                for (int j=0; j<3; j++) {
                    String prova = "";
                    switch (j) {
                        case 0: 
                            prova = "Portugues";
                            break;
                        case 1: 
                            prova = "Matematica";
                            break;
                        default:
                            prova = "Conhecimentos Gerais";
                    }
                        
                    System.out.println("Informe a nota da prova de " + prova + " do " + (i+1) + "o. candidato(a): ");
                    
                    float notaProva = scanner.nextFloat();
                    Materia materia = new Materia();
                    materia.setNome(prova);
                    materia.setNota(notaProva);
                    
                    // vetor de materias do candidato
                    materiasCandidato[j] = materia;
                }
                
                // definindo o candidato
                Candidato candidato = new Candidato();
                candidato.setNome(nome);
                candidato.setMaterias(materiasCandidato);

                // atribuir o candidato ao vetor de candidatos do concurso    
                candidatos[i] = candidato;
            }
        }
        
        return candidatos;
    }
*/    
    static List<Candidato> receberCandidatos() {
    List<Candidato> candidatos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a quantidade de candidatos do Concurso: ");
    int qtdCandidatosConcurso = scanner.nextInt();

    for (int i = 0; i < qtdCandidatosConcurso; i++) {
        System.out.println();
        System.out.print("Informe o nome do " + (i + 1) + "º candidato(a): ");
        String nome = scanner.next();

        List<Materia> materias = new ArrayList<>();

        System.out.print("Informe a nota da prova de Português: ");
        float notaPortugues = scanner.nextFloat();
        Materia materiaPort = new Materia();
        materiaPort.setNome("Portugues");
        materiaPort.setNota(notaPortugues);
        materias.add(materiaPort);

        System.out.print("Informe a nota da prova de Matemática: ");
        float notaMatematica = scanner.nextFloat();
        Materia materiaMat = new Materia();
        materiaMat.setNome("Matematica");
        materiaMat.setNota(notaMatematica);
        materias.add(materiaMat);

        System.out.print("Informe a nota de Conhecimentos Gerais: ");
        float notaCG = scanner.nextFloat();
        Materia materiaCG = new Materia();
        materiaCG.setNome("Conhecimentos Gerais");
        materiaCG.setNota(notaCG);
        materias.add(materiaCG);

        // Criar o candidato
        Candidato candidato = new Candidato();
        candidato.setNome(nome);
        candidato.setMaterias(materias);

        candidatos.add(candidato);
    }

    return candidatos;
}
}
