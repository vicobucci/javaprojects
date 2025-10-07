package br.com.exemplo.visibilidade.modificadores.honda;

import br.com.exemplo.visibilidade.modificadores.*;

public class Honda extends Carro {

    // metodo herdado, mas sobrecarregado
    @Override
    public void goSlow() {
        System.out.println("Honda go slow!");
    }

    // metodo novo
    // este metodo utiliza a variavel de instancia (atributo) "passengers" que pertence a superclasse
    // e foi declarado com o modificador "protected"
    public void showPassengers() {
        System.out.println("Qty of passengers: " + passengers);
    }

    // metodo novo
    // este metodo utiliza a variavel de classe "wheels" que pertence a superclasse
    public void showWheels() {
        System.out.println("Qty of wheels: " + wheels);
        // chama o metodo da superclasse que possui o modificador "protected"
        super.buzina();
    }

    // metodo herdado, mas sobrecarregado
    // este metodo na superclasse utiliza o modificador "protected"
    @Override
    public void buzina() {
        System.out.println("fonfon");
    }

    // metodo herdado, mas sobrecarregado
    @Override
    public void getDetails() {
        System.out.println("I am a Honda");
    }
}
