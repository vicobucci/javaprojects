package br.com.exemplo.visibilidade.modificadores;


/*
 * Exemplo de subclasse declarada no mesmo pacote da superclasse
 */
public class CarroEsportivo extends Carro {

    // metodo herdado, mas sobrecarregado
    @Override
    public void goSlow() {
        System.out.println("Carro exportivo go slow!");
    }

    // metodo herdado, mas sobrecarregado
    @Override
    public void buzina() {
        System.out.println("fon-fon");
    }

    // metodo herdado, mas sobrecarregado
    @Override
    public void getDetails() {
        System.out.println("I am a Sport Car");
        // calls its parent default method - getMyWheels
        getMyWheels();
    }

    // metodo novo
    // este metodo utiliza a variavel de instancia (atributo) "width" que pertence a superclasse
    // e foi declarado com o modificador "default"
    public void getWidth() {
        System.out.println("Width is: " + width);
    }
}
