package filaExercicios;

public class FilaQuatroElementosTeste {
    public static void main(String[] args) {
        FilaQuatroElemento filaQuatroElemento = new FilaQuatroElemento(5);

        filaQuatroElemento.enfilerar(2);
        filaQuatroElemento.enfilerar(2);
        filaQuatroElemento.enfilerar(3);
        filaQuatroElemento.enfilerar(4);
        filaQuatroElemento.enfilerar(3);

        for (Object elemento: filaQuatroElemento.vetor) {
            System.out.println(elemento);
        }


        while (!filaQuatroElemento.isEmpty()){
            Object numeroDesenfilerado = filaQuatroElemento.desenfilerar();
            System.out.print("Número: " +  numeroDesenfilerado + "\n");
        }


    }
}
