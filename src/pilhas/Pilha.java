package pilhas;

public class Pilha {
    int elementos[];
    int topo;
    // int tamanho;

    /* public Pilha(int tam) {
    * topo = -1;
    * tamanho = tam;
    * elementos = new int [tam];
    * }
    * */

    public Pilha(){
        elementos = new int[5];
        topo = -1;
    }

    //empilhar
    public void push(int e){
        if (isFull()){
            throw new RuntimeException("Pilha cheia");
        }
        topo++;
        elementos[topo] = e;
    }

    //desempilhar não recebe parâmetro porque o elemento a ser removido sempre será o topo da fila
    public int pop(){
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        int elemento;
        elemento = elementos[topo];
        topo--;
        return elemento;
    }

    public boolean isEmpty(){
        return (topo == -1);
    }

    public boolean isFull(){
        return (topo == elementos.length - 1);
    }

    public int top(){
        if (isEmpty()) {
            throw new RuntimeException("A pilha esta vazia");
        }
        return elementos[topo];
    }

    public void imprimePila(){
        if (isEmpty()) {
            System.out.println("A pilha esta vazia!");
        } else {
            for (int i = 0; i < elementos.length; i++) {
                System.out.printf("Posição %d com o valor: %d\n", (i + 1), elementos[i]);
            }
        }
    }

}