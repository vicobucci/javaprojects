package br.senac.classes;

/*
 * esta classe demonstra o conceito de arrays multidimensionais para objetos
 * atraves de declaracoes e acesso ao conteudo dos arrays
 */

import br.senac.rj.classes.Ponto;

public class TestarArray {

    public static void main(String[] args) {

    	// declarando e criando vetores explicitamente
    	executarExemplo1();
    	executarExemplo2();
    }
    
    // declaracao e atribuicao explicitas
    public static void executarExemplo1() {

    	// declarando e atribuindo objetos ao vetor 

    	// criando o vetor com 4 elementos
    	
    	// preenchendo o vetor
    	for (int i = 0; i < pontos.length; i++) {
        	// criando o objeto Ponto
    		Ponto ponto = new Ponto(i,i);
        	
            // atribuindo o objeto ao indice do vetor

        }
    			
    	// imprimindo o conteudo do vetor
        System.out.println("Execucao do exemplo 1");
        System.out.println("---------------------");
        for (int j = 0; j < ????; j++) {
        	Ponto elemento; 
        	System.out.println("Elemento[" + j + "] = " + elemento.getX() + ", " + elemento.getY());
        }
        System.out.println();
    }
    
    // declaracao e atribuicao implicitas
    public static void executarExemplo2() {
        
    	// declarando e atribuindo de forma explicita
    	Ponto[] pontos;
        
    	// imprimindo o conteudo do vetor
        System.out.println("Execucao do exemplo 2");
        System.out.println("---------------------");
        for (int j = 0; j < ????; j++) {
        	System.out.println("Elemento[" + j + "] = " + ????.getX() + ", " + ????.getY());
        }
        System.out.println();
    }
    
}
