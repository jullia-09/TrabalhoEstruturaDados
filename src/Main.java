public class Main {


    public static void main(String[] args) {


        Pilha pilha = new Pilha(3);

        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");

        System.out.println("Pilha: " + pilha);

        String removido = pilha.desempilhar();
        System.out.println("Elemento removido: " + removido);

        System.out.println("Topo: " + pilha.espiar());


        System.out.println("Tamanho: " + pilha.tamanho());


        Pilha pilhaVazia = new Pilha(3);


        try {
            pilhaVazia.desempilhar();

        } catch (RuntimeException erro) {


            System.out.println("Erro tratado: " + erro.getMessage());
        }
    }
}
