package dog;

import dog.Dog;

/**
 *
 * @author vinicius.cobucci
 */
public class TestDog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dog cao = new Dog();
       Dog novoCao = new Dog();
       
       
       int pesoDoCao = cao.getWeight();
       
       System.out.println("O peso do cao e " + pesoDoCao + "Kg.");
       
       System.out.println("O peso do novo cao e " + novoCao.getWeight() + "Kg.");
       
       novoCao.setWeight(23);
      
       System.out.println("O peso do novo cao e " + novoCao.getWeight() + "Kg.");
       
       Dog outroCao = new Dog(10);
               
       System.out.println("O peso do outro cao e " + outroCao.getWeight() + "Kg.");
       
       cao = null;
       novoCao = null;
       outroCao = null;
    }
    
}
