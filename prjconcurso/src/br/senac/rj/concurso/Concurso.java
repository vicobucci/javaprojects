package br.senac.rj.concurso;

import br.senac.rj.candidato.Candidato;
import br.senac.rj.materia.Materia;
import java.util.List;

/**
 *
 * @author marcos.silva
 */
public class Concurso {
    private Candidato[] candidatos;
    private double[] medias;

    public Concurso() {
    }

    public Candidato[] getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(Candidato[] candidatos) {
        this.candidatos = candidatos;
    }

    public double[] getMedias() {
        return medias;
    }

    // calcula as medias das provas do concurso
    public void calcularMedias() {
        // calcula as medias das provas do concurso se houver candidatos
        if (candidatos != null && candidatos.length > 0) {
            this.medias = new double[3];
            
            for (int indMateria = 0; indMateria<3; indMateria++) {
                double media = 0;
                
                for(int j=0; j<this.candidatos.length; j++) {
                    Candidato candidato = this.candidatos[j];
                    List<Materia> materias = candidato.getMaterias();
                    media = media + materias.get(indMateria).getNota();
                }

                this.medias[indMateria] = media / this.candidatos.length;
                indMateria++;
            }
        }
    }
    
    public float getMediaPorMateria(String nomeMateria) {
        float media = 0f;
        
        // recupera e define a situacao baseado nas notas das materias
        if (this.candidatos.length > 0) {
            
            for(int i=0; i<this.candidatos.length; i++) {
                
                Candidato candidato = this.candidatos[i];
                List<Materia> materias = candidato.getMaterias();
            
                for(int j=0; j<materias.size(); j++) {
                    Materia materia = materias.get(j);
                    media = media + (nomeMateria.equalsIgnoreCase(materia.getNome()) ? materia.getNota() : 0);
                }
            }        
            
            media = media / this.candidatos.length;
        }
        
        return media;
    }
    
    // a) Nome dos candidatos aprovados;
    public String[] getNomeAprovados() {
        int qtdAprovados = 0;
        String[] aprovados = null;
        
        for(int i=0; i<this.candidatos.length; i++) {
            Candidato candidato = this.candidatos[i];
            qtdAprovados += ("A".equals(candidato.getSituacao().getSigla()) ? 1: 0);
        }
        
        // se existir candidado aprovado
        if (qtdAprovados > 0) {
            aprovados = new String[qtdAprovados];
            
            // recupera os nomes dos aprovados
            qtdAprovados = 0;
            for(int j=0; j<this.candidatos.length; j++) {
            
                Candidato candidato = this.candidatos[j];
                
                if ("A".equals(candidato.getSituacao().getSigla())) {
                   aprovados[qtdAprovados] = candidato.getNome();
                   qtdAprovados++;
               }
            }
        }
        
        return aprovados;            
    }
    
    // c) O número de candidatos que obtiveram média maior que 4.5 e nota na
    // prova de Conhecimentos Geral maior que 6,0
    public int getCandidatosMediaConhecimentosGerais() {
        int qtdCandidatos = 0;
        
        for(int i=0; i<this.candidatos.length; i++) {
            
            Candidato candidato = this.candidatos[i];
            List<Materia> materias = candidato.getMaterias();
            float notaCG = materias.get(2).getNota();
            
            if (candidato.getMedia() > 4.5 && notaCG > 6) {
                qtdCandidatos += 1;
            }
        }
        
        return qtdCandidatos;
    }
    
    // d) O número de candidatos aprovados que obtiveram nota em Matemática
    // acima de 5,0
    public int getCandidatosAprovadosMatematicaAcimaDe5() {
        int qtdCandidatos = 0;
        
        for(int i=0; i<this.candidatos.length; i++) {
            
            Candidato candidato = this.candidatos[i];
            List<Materia> materias = candidato.getMaterias();
            float notaMatematica = materias.get(1).getNota();
            
            if ("A".equals(candidato.getSituacao().getSigla()) && notaMatematica > 5) {
                qtdCandidatos += 1;
            }
        }
        
        return qtdCandidatos;
    }
}
