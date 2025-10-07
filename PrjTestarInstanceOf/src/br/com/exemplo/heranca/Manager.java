package br.com.exemplo.heranca;

/*
 * este exemplo server para demonstrar polimorfismo
 * a classe Gerente e uma subclasse de Empregado
 */

public class Manager extends Employee {
    private String department;

    // construtor com parametros
    public Manager(String n) {
        // executa o construtor do pai - Employee
        super(n);
    }
    
    // construtor com parametros
    public Manager(String n, String d) {
        // executa o construtor do pai - Employee
        super(n);
        department = d;
    }

}