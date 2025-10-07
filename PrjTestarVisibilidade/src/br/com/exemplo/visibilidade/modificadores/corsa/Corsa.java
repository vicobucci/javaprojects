package br.com.exemplo.visibilidade.modificadores.corsa;

import br.com.exemplo.visibilidade.modificadores.*;

public class Corsa extends Carro {

    // // metodo herdado, mas sobrecarregado
    @Override
    public void buzina() {
        // este metodo chama o metodo "buzina" da superclasse
        // que tem o modificador "protected"
        super.buzina();
    }
}
