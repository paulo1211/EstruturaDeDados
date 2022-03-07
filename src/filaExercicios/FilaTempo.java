package filaExercicios;

public class FilaTempo {
    int inicio1, fim1, tamanho;
    int inicio2, fim2;
    int inicio3, fim3;
    int inicio4, fim4;
    Object fila1[];
    Object fila2[];
    Object fila3[];
    Object fila4[];

    public FilaTempo(){
        inicio1 = 0;
        inicio2 = 0;
        inicio3 = 0;
        inicio4 = 0;
        fim1 = 0;
        fim2 = 0;
        fim3 = 0;
        fim4 = 0;
        tamanho = 11;
        fila1 = new Object[tamanho];
        fila2 = new Object[tamanho];
        fila3 = new Object[tamanho];
        fila4 = new Object[tamanho];
    }

    public boolean isFull1(){
        return tamanho == fim1;
    }

    public boolean isEmpty(){
        return fim == 0;
    }

    public void enfilerar(String nomeCliente){

        if (isEmpty()) {

        }
    }



}
