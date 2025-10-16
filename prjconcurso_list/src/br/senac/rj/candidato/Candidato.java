package br.senac.rj.candidato;
import java.util.ArrayList;
import br.senac.rj.materia.Materia;
import br.senac.rj.materia.Situacao;
import java.util.List;

/**
 *
 * @author marcos.silva
 */
public class Candidato {
    private String nome;
    private List<Materia> materias;
    private Situacao situacao;
    private double media;
    
    

    public Candidato() {
        this.materias = new ArrayList<>();
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
    this.materias = materias;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }




    // recupera e define a situacao baseado nas notas das materias
    public void avaliarSituacao() {
        double mediaCandidato;
        double totalNotas = 0f;
        boolean hasNotaMenorQue2 = false;
        
        for( Materia materia : this.materias ){
            totalNotas = totalNotas + materia.getNota();
            if (materia.getNota() < 2.0) {
                hasNotaMenorQue2 = true;
            }
        }
        
        // calcula a media
        mediaCandidato = totalNotas / 3;
        
        // avalia o resultado do candidato
        this.media = mediaCandidato;
        this.situacao = ( hasNotaMenorQue2 == false && mediaCandidato > 4) ? Situacao.APROVADO : Situacao.REPROVADO;   
    }    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Candidato { ");
        sb.append(this.nome);
        sb.append("; Media = ").append(String.format("%.2f", this.media));
        if (this.situacao != null) {
            sb.append("; ").append(this.situacao.getDescricao());
        }
        sb.append("; Notas [ ");
        for (int i=0; i<this.materias.size(); i++) {
            Materia materia = materias.get(i);
            sb.append(materia.toString());
            if (i<2) {
                sb.append(" / ");
            }
        }
        sb.append(" ] }\n");
        
        return sb.toString();
    }
}