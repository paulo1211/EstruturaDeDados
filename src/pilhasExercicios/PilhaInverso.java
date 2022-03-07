package pilhasExercicios;

public class PilhaInverso {
    int topo;
    String palavra;
    char inversoNome[];

    public PilhaInverso(){
        topo = -1;
    }

    public boolean isEmpyt(){
        return topo == -1;
    }

    public boolean isFull(){
        return topo == inversoNome.length - 1;
    }

    public void empilhar(String elemento){
        inversoNome = new char[elemento.length()];
        if (isFull()) {
            throw new RuntimeException("A pilha esta cheia!");
        } else {
            palavra = elemento;
            while (!isFull()){
                topo++;
                inversoNome[topo] = elemento.charAt(topo);
            }
        }
    }

    public char desempilhar(){
        char elementoDesempilhado;
        if (isEmpyt()){
            throw new RuntimeException("A pilha esta vazia!");
        } else {
            elementoDesempilhado = inversoNome[topo];
            topo--;
        }
        return elementoDesempilhado;
    }

}