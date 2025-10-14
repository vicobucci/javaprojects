/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.rj;

import br.senac.rj.candidato.Candidato;

/**
 *
 * @author vinicius.cobucci
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

    public void setMedias(double[] medias) {
        this.medias = medias;
    }
    
    
}
