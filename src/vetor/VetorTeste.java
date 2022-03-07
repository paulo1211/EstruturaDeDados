package vetor;

public class VetorTeste {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

       try {
           vetor.adicionar("elemento 01");
           vetor.adicionar("elemento 02");
       } catch (Exception e) {
           System.out.println("O vetor já esta cheio!");
       }


    }

}
