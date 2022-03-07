package pilhasExercicios;

public class PilhaInversoTeste {
    public static void main(String[] args) {
        PilhaInverso pilhaInverso = new PilhaInverso();

        pilhaInverso.empilhar("AMOR");

        System.out.println(pilhaInverso.palavra.length());


        for (int i = 0; i < pilhaInverso.inversoNome.length; i++) {
            System.out.print(pilhaInverso.inversoNome[i] + " " + "\n");
        }


        while (!pilhaInverso.isEmpyt()){
            char valorDesempilhado = pilhaInverso.desempilhar();
            System.out.printf("O valor de desempilhado é %s\n", valorDesempilhado);
        }

    }
}
