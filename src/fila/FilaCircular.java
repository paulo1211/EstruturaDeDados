package fila;

public class FilaCircular {
    int tamanho, inicio, fim, total;
    Object vetor[];

    public FilaCircular(int tam){
        inicio = 0;
        fim = 0;
        total = 0;
        tamanho = tam;
        vetor = new Object[tamanho];
    }

    public boolean isFull(){
        return total == tamanho;
    }

    public boolean isEmpty(){
        return total == 0;
    }


    public void enfilerar(Object elemento){
        if (!isFull()) {
            vetor[fim] = elemento;
            fim++;
            total++;
            if (fim == tamanho) {
                fim = 0;
            }
        } else {
            throw new RuntimeException("Fila cheia!");
        }
    }

    public Object desenfilerar(){
        Object vetorDesenfilerado = null;

        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        } else {
            vetorDesenfilerado = vetor[inicio];
            vetor[inicio] = null;
            inicio++;
            total--;

            if (inicio == tamanho) {
                inicio = 0;
            }
        }
        return vetorDesenfilerado;
    }

    public void imprimeFila(){
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Posicição: %d  valor: %d\n ", (i + 1), vetor[i]);
        }

    }

    public void imprimeFilaSemNull(){
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                System.out.printf("Posicição: %d  valor: %d\n ", (i + 1), vetor[i]);
            }

        }

    }
}