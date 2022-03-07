package vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /* ruim, porque tem que passar por todo o vetor para adicionar
    public void adicionar(String elemento){
       for (int i = 0; i < this.elementos.length; i++) {
           if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
           }
       }
    }
*/
    public boolean adicionar(String elemento) throws Exception {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            throw new Exception("Tamanho do vetor excedido!");
        }
    }

    //move os elementos sem perca de dados
    public boolean adicionar(int posicao, String elemento) throws Exception {
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição invalida");
        }

        for (int i = this.tamanho - 1; i <= posicao; i--){
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return false;
    }

    public int getTamanho(){
        return this.tamanho;

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < this.getTamanho() - 1; i++){
            stringBuilder.append(this.elementos[i]);
            stringBuilder.append(", ");
        }
        if (this.tamanho > 0) {
            stringBuilder.append(this.elementos[this.tamanho- 1]);
        }

        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public String busca(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição invalida");
        }
        return this.elementos[posicao];
    }

    public boolean busca(String elemento){
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }
}
