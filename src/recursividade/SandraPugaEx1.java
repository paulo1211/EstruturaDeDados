package recursividade;

public class SandraPugaEx1 {
    public static void main(String[] args) {
        int resultado = soma(5);
        System.out.println(resultado);
    }

   static public int soma(int numero) {
        if (numero == 1 ||  numero == 0)
            return numero;
        else if (numero < 0)
            throw new ArithmeticException("O número não pode ser negativo");
        return (numero + soma(numero - 1));
    }

}
