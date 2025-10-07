package br.com.exemplo.heranca;

import java.util.Date;

/*
 * este exemplo server para demonstrar polimorfismo
 * classe Empregado
 */
public class Employee extends Object {
  
    private String name;
    private double salary;
    private Date birthDate;

    // construtor com parametros
    public Employee(String n) {
        this();
        name = n;
    }

    // construtor sem parametros
    public Employee() {
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
}