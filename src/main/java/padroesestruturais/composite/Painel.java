package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Painel implements Componente {
    private List<Componente> componentes = new ArrayList<>();

    public void adicionar(Componente componente) {
        componentes.add(componente);
    }

    public void remover(Componente componente) {
        componentes.remove(componente);
    }

    @Override
    public void renderizar() {
        System.out.println("Renderizando painel com " + componentes.size() + " componentes:");
        for (Componente componente : componentes) {
            componente.renderizar();
        }
    }
}
