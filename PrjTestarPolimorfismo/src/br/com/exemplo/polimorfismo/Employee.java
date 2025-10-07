package br.com.exemplo.polimorfismo;

import java.util.Date;

/*
 * este exemplo server para demonstrar polimorfismo
 * classe Empregado
 */
public class Employee extends Object {
    private String name;
    private double salary = 15000.00;
    private Date birthDate;
    private String summary;

    // construtor com parametros
    public Employee(String name, Date dateOfBirth) {
        this.name = name;
        birthDate = dateOfBirth;
        summary = getDetails();
    }

    // construtor com parametros
    public Employee(String name) {
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    // exibe os atributos da classe
    public String getDetails() {
        return 
            (new StringBuilder("Name: ").append(getName()).append("\nSalary: ").append(getSalary()).append("\nBirth Date: ").append(getBirthDate()).toString());
    }

}