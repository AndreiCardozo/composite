package padroesestruturais.composite;

public class Botao implements Componente {
    private String label;

    public Botao(String label) {
        this.label = label;
    }

    @Override
    public void renderizar() {
        System.out.println("Renderizando botão com label: " + label);
    }
}
