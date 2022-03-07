package fila;

public class FilaRegular {
    int tamanho, inicio, fim;
    Object vetor[];

    public FilaRegular(int tam) {
        inicio = 0;
        fim = 0;
        tamanho = tam;
        vetor = new Object[tamanho];
    }

    public boolean isFull() {
        return fim == tamanho;
    }

    public boolean isEmpty() {
        return fim == 0;
    }

    public void enfilerar(Object elemento) {
        if (!isFull()) {
            vetor[fim] = elemento;
            fim++;
        } else {
            throw new RuntimeException("A fila esta cheia!@");
        }
    }

    public Object desenfilerar() {
        Object elementoDesenfilerado = null;
        if (isEmpty()) {
            throw new RuntimeException("A fila esta vazia");
        } else {
            elementoDesenfilerado = vetor[inicio];
            for (int i = 1; i < fim; i++) {
                vetor[i - 1] = vetor[i];
            }
            fim--;
            return elementoDesenfilerado;
        }
    }

    public void imprimirFila(){
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("O valor %d esta na posição %d\n", vetor[i], (i + 1));
        }
    }


}
