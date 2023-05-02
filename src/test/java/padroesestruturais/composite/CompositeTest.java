package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

public class CompositeTest {
    @Test
    void testComposite() {

        Botao botao1 = new Botao("Ok");
        Botao botao2 = new Botao("Cancelar");
        Botao botao3 = new Botao("Ajuda");

        Painel painel = new Painel();
        painel.adicionar(botao1);
        painel.adicionar(botao2);
        painel.adicionar(botao3);

        painel.renderizar();
    }
}
