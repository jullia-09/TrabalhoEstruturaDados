public class FilaCircular {

    private String[] elementos;
    private int inicio;
    private int fim;
    private int quantidade;
    private int capacidade;

    public FilaCircular(int capacidade) {

        this.capacidade = capacidade;
        elementos = new String[capacidade];

        inicio = 0;
        fim = 0;
        quantidade = 0;
    }

    public String desenfileirar() {

        if (quantidade == 0) {
            throw new RuntimeException("A fila está vazia!");
        }

        String elemento = elementos[inicio];

        inicio = (inicio + 1) % capacidade;

        quantidade--;

        return elemento;
    }

    public String frente() {


        if (quantidade == 0) {
            throw new RuntimeException("A fila está vazia!");
        }

        return elementos[inicio];
    }


    public boolean estaVazia() {
        return quantidade == 0;
    }


    public boolean estaCheia() {
        return quantidade == capacidade;
    }


    public int tamanho() {
        return quantidade;
    }

}
