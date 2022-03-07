package pilhasExercicios;

import java.util.stream.IntStream;

public class PilhaPares {
    int topo, tamanhoPilha;
    int vetor[];

    public PilhaPares(int tam){
        topo = -1;
        tamanhoPilha = tam;
        vetor = new int[tamanhoPilha];
    }

    public boolean isEmpty(){
        return topo == -1;
    }

    public boolean isFull(){
        return tamanhoPilha == topo;
    }

    public void empilhar(int elemento){
        if (isFull()) {
            throw new RuntimeException("A pilha esta cheia!");
        } else if (elemento % 2 == 0) {
            topo++;
            vetor[topo] = elemento;
        }
    }

    public int desempilhar(){
        int elemento;
        if (isEmpty()) {
            throw new RuntimeException("A pilha esta vazia!");
        } else {
            elemento = vetor[topo];
            topo--;
        }
        return elemento;
    }

    public void imprimePilha(){
        if (isEmpty()) {
            throw new RuntimeException("A pilha esta vazia!");
        } else {
            for (int i = 0; i < tamanhoPilha; i++) {
                System.out.printf("A posição %d da pilha possui o número %d\n", (i + 1), vetor[i]);
            }
        }
    }

    public void imprimePilhaStream(){
        IntStream.of(vetor).forEach(System.out::println);
    }
}


