package testes;

public class TesteMenor {
    public static void main(String[] args) {
        int A[] = {20,14,4,2,100};

        int resultado = calculaMenor(A);
        System.out.println(resultado);

    }

   static int calculaMenor(int A[]){
        int menor, i;
        menor = A[0];

        for(i = 1; i < A.length; i++){
            if (A[i] < menor){
                menor = A[i];
            }
        }
        return menor;
    }
}