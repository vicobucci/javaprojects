package br.com.exemplo.polimorfismo;

/*
 * este exemplo server para demonstrar polimorfismo
 * a classe Gerente e uma subclasse de Empregado
 */

public class Manager extends Employee {
    private String department;

    // construtor com parametros
    public Manager(String name, String department) {
        // executa o construtor do pai - Employee
        super(name);
        this.department = department;
    }

    /*
     * sobreposicao do metodo da superclasse
     * exibe os atributos da superclasse
     * atraves da chamada ao mesmo metodo da superclasse
     */
    @Override
    public String getDetails() {
        return ((new StringBuilder(super.getDetails()).append("\nDepartamento: ").append(department)).toString());
    }
}