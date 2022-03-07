package filaExercicios;

public class ListaPacientes {
    int tamanho, inicio, fim;
    Object senhaPaciente[];
    Object numeroSequencial[];
    Object nomePaciente[];

    public ListaPacientes() {
       inicio = 0;
       fim = 0;
    }

    public boolean isFull(){
        return fim == tamanho;
    }

    public boolean isEmpty(){
        return fim == 0;
    }


    public void enfilerar(int senha, int numero, String nome){
        if (isFull()) {
            throw new RuntimeException("A fila esta cheia");
        } else {
            senhaPaciente[fim] = senha;
            numeroSequencial[fim] = numero;
            nomePaciente[fim] = nome;
            fim++;
        }
    }

    public Object desenfilerar(){
        Object senhaDesenfilerada = null;
        Object numeroDesenfilerado = null;
        Object nomeDesenfilerado = null;
        if (isEmpty()) {
            throw new RuntimeException("A fila esta vazia");
        } else {
            senhaDesenfilerada = senhaPaciente[inicio];
            numeroDesenfilerado = numeroSequencial[inicio];
            nomeDesenfilerado = nomePaciente[inicio];

            for (int i = 0; i < senhaPaciente.length; i++) {
                senhaPaciente[i - 1] = senhaPaciente[i];
                nomePaciente[i - 1] = nomePaciente[i];
                numeroSequencial[i - 1] = numeroSequencial[i];
            }
            fim--;
        }
        return nomeDesenfilerado;
    }



}
