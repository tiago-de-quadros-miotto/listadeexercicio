public class exercicio02 {

    public static void main(String[] args) {

        int contador = 1;
        int soma = 0;

        do {
            System.out.println(soma);
            if (contador % 2 == 0) {
                soma = soma + contador;
            }

            contador = contador + 1;
        } while (contador <= 500);

        System.out.println(soma);
        

    }

}
