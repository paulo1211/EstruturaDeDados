package fila;

public class FilaCircularTeste {
    public static void main(String[] args) {
        FilaCircular fila = new FilaCircular(5);

        fila.enfilerar(1);
        fila.enfilerar(2);
        fila.enfilerar(3);
        fila.enfilerar(4);
        fila.enfilerar(5);


        System.out.println("Enfilerando");
        fila.imprimeFila();

        System.out.println();


        fila.desenfilerar();

        System.out.println("Desenfilerando");
        fila.imprimeFilaSemNull();

    }
}
