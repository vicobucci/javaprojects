package br.com.exemplo;

import br.com.exemplo.heranca.Employee;
import br.com.exemplo.heranca.Manager;

/*
 * esta classe implementa o conceito de verificacao de instancias de classe
 * atraves do metodo instanceof
 */
public class TestarInstanceOf {
    

        public static void main(String[] args) {
        // Instanciando um Employee
       Employee employee = new Employee();
       Manager manager = new Manager("Vinicius");
       Manager manager1 = new Manager("Cobucci"); 
       
       if (employee instanceof Employee){
           System.out.println("Empregado");
       }
       if (manager instanceof Employee){
           System.out.println(manager);
       }
       if (manager instanceof Manager){
           System.out.println("Manager");
       }
       
       
       
                 }
                 
              
}        
