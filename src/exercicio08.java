import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
       
        int totalValores = 0;
        double soma = 0;
 
        System.out.println("Digite os valores (digite um valor negativo para parar):");
 
        while (true) {
            double valor = scanner.nextDouble();
 
            
            if (valor < 0) {
                break; 
            }
 
            
            totalValores++;
            soma += valor;
        }
 
        
        if (totalValores > 0) {
            double media = soma / totalValores;
            System.out.println("Total de valores lidos: " + totalValores);
            System.out.println("Somatório dos valores: " + soma);
            System.out.println("Média dos valores: " + media);
        } else {
            System.out.println("Nenhum valor positivo foi fornecido.");
        }
 
        scanner.close();
    }
    
}
