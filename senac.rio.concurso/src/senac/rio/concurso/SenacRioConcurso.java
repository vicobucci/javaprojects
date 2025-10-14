package br.senac.rj;

import br.senac.rj.candidato.Candidato;
import br.senac.rj.concurso.Concurso;
import br.senac.rj.materia.Materia;
import java.util.Scanner;

/**
 *
 * @author marcos.silva
 */
public class ExecutarConcurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Concurso concurso;
        Candidato[] candidatos;
        
        concurso = new Concurso();
        candidatos = receberCandidatos();
        if (candidatos == null) {
            System.exit(0);
        }
        
        concurso.setCandidatos(candidatos);
        
        gerarSituacaoCandidatos();
        apresentarResultados();
    }
    
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
    
    static void gerarSituacaoCandidatos() {
        
    }
    
    static void apresentarResultados() {
        
    }
 
    static Candidato[] receberCandidatos_v2() {
        Candidato[] candidatos = null;
        int qtdCandidatosConcurso = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de candidatos do Concurso: ");
        qtdCandidatosConcurso = scanner.nextInt();
        
        if (qtdCandidatosConcurso > 0) {
            
            candidatos = new Candidato[qtdCandidatosConcurso];
            
            for(int i=0; i<qtdCandidatosConcurso; i++) {
            
                System.out.println("Informe o nome do " + (i+1) + "o. candidato(a): ");
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
                candidato.avaliarSituacao();

                // atribuir o candidato ao vetor de candidatos do concurso    
                candidatos[i] = candidato;
            }
        }
        
        return candidatos;
    }
}
