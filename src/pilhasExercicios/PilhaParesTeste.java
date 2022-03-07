package pilhasExercicios;

public class PilhaParesTeste {
    public static void main(String[] args) {
        PilhaPares pilhaPares = new PilhaPares(5);

        pilhaPares.empilhar(5);
        pilhaPares.empilhar(2);
        pilhaPares.empilhar(1);
        pilhaPares.empilhar(2);
        pilhaPares.empilhar(6);
        pilhaPares.empilhar(2);

        pilhaPares.imprimePilha();

    }
}
