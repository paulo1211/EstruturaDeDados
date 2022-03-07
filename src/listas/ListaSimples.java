package listas;

public class ListaSimples {
    NoSimples primeiro, ultimo;

    ListaSimples(){
        primeiro = null;
        ultimo = null;
    }

    public void inserirFinal(NoSimples noSimples){
        noSimples.prox = null;
        if (primeiro == null) {
            primeiro = noSimples;
        } else {
            ultimo.prox = noSimples;
        }
        ultimo = noSimples;
    }

    public void inserirInicio(NoSimples noSimples){
        if (primeiro == null) {
            primeiro = noSimples;
            ultimo = noSimples;
        } else {
            noSimples.prox = primeiro;
            primeiro = noSimples;
        }

    }

    public int contarNos(){
        int quantidade = 0;
        NoSimples noTemp = primeiro;
        while (noTemp != null){
            quantidade++;
            noTemp = noTemp.prox;
        }
        return quantidade;
    }

}