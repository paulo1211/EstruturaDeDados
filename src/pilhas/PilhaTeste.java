package pilhas;

public class PilhaTeste {
    public static void main(String[] args) {
            Pilha pilha = new Pilha();

            pilha.push(5);
            pilha.push(4);
            pilha.push(3);
            pilha.push(2);
            pilha.push(1);

           pilha.imprimePila();

           while (!pilha.isEmpty()){
               int elemento = pilha.pop();
               System.out.println("Desempilhei: " + elemento);
           }

    }
}
