/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjconstrutores;

/**
 *
 * @author vinicius.cobucci
 */
public class prjconstrutores {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        carro carro1 = carro();
        carro1.imprimir();
        
        carro1 = new carro(nome: "Fusca");
        carro1.imprimir()
        
    }
    
}
