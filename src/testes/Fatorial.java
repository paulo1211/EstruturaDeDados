package testes;

public class Fatorial {
    public static void main(String[] args) {
       int resultado = calculaFatorial(4);
        System.out.println(resultado);
    }

    static int calculaFatorial(int numero){
        if (numero == 1 || numero == 0){
            return 1;
        } else {
            return numero * calculaFatorial(numero - 1);
        }
    }
}