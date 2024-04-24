public class exercicio07 {

    public static void main(String[] args) {
        
        
        long totalGraos = 0;
        long graosNoQuadro = 1;
 
        
          for (int i = 1; i <= 64; i++) {
            
            totalGraos += graosNoQuadro;
           
            
            graosNoQuadro *= 2;
        }
 
        
        System.out.println("O total de grãos de trigo no tabuleiro de xadrez é: " + totalGraos);

    }
    
}
