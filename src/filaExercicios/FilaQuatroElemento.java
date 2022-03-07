package filaExercicios;


public class FilaQuatroElemento {
    int inicio, fim, tamanho;
    Object vetor[];

    public FilaQuatroElemento(int tam){
        inicio = 0;
        fim = 0;
        tamanho = tam;
        vetor = new Object [tamanho];
    }

    public boolean isFull(){
        return tamanho == fim;
    }

    public boolean isEmpty(){
        return fim == 0;
    }


    public void enfilerar(int elemento){
        if (!isFull() && elemento % 2 == 1) {
            vetor[fim] = elemento;
            fim++;
        } else if (isFull()){
            throw new RuntimeException("A fila esta cheia!");
        }

    }

    public Object desenfilerar(){
        Object elementoDesemfilerado = null;
        if (!isEmpty()) {
            elementoDesemfilerado = vetor[inicio];
            for (int i = 1; i < vetor.length; i++){
                vetor[i - 1] = vetor[i];
            }
            fim--;
        } else {
            throw new RuntimeException("A fila esta vazia!");
        }

        return elementoDesemfilerado;
    }

}
