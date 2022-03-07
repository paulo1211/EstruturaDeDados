package fila;

public class FilaRegularTeste {
    public static void main(String[] args) {
        FilaRegular filaRegular = new FilaRegular(5);

        filaRegular.enfilerar(1);
        filaRegular.enfilerar(2);
        filaRegular.enfilerar(3);
       // filaRegular.enfilerar(4);
        filaRegular.enfilerar(5);

        System.out.println("Valores depois de enfilerados");
        filaRegular.imprimirFila();


        System.out.println();
        System.out.println("Valores depois de  desenfilerados");
        while (!filaRegular.isEmpty()){
            Object valorDesenfilerado = filaRegular.desenfilerar();
            System.out.println(valorDesenfilerado);
        }

    }
}
