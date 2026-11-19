
public class Pilha {


    private String[] elementos;
    private int topo;
    private int capacidade;


    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        elementos = new String[capacidade];
        topo = -1;
    }

    public void empilhar(String elemento) {

        if (topo == capacidade - 1) {
            throw new RuntimeException("A pilha está cheia!");
        }

        topo++;
        elementos[topo] = elemento;
    }

    public String desempilhar() {


        if (topo == -1) {
            throw new RuntimeException("A pilha está vazia!");
        }

        String elemento = elementos[topo];
        topo--;

        return elemento;
    }

    public String espiar() {

        if (topo == -1) {
            throw new RuntimeException("A pilha está vazia!");
        }

        return elementos[topo];
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == capacidade - 1;
    }


    public int tamanho() {
        return topo + 1;
    }


    @Override
    public String toString() {

        String resultado = "[";

        for (int i = 0; i <= topo; i++) {

            resultado += elementos[i];

            if (i < topo) {
                resultado += ", ";
            }
        }

        resultado += "]";

        return resultado;
    }

}
