package recursividade;

public class SandraPugaEx2 {
    public static void main(String[] args) {
        int vetorA[] = {50, 300, 60, 50, 105};
        int resultado = mostraMaiorElemento(vetorA);
        System.out.println(resultado);
    }
/*
    static int mostraMaiorElemento(int[] A){
        int maiorElemento = A[0];
        for (int i = 1; i < A.length; i++){
            if (maiorElemento < A[i]) {
                maiorElemento = A[i];
            }
        }
        return maiorElemento;
    }
*/

    static int mostraMaiorElemento(int[] A){
        int maiorElemento = A[0];
     //   return maiorElemento < A[i]
        return 0;
    }

}
