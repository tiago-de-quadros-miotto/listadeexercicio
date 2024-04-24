public class exercicio03 {

    public static void main(String[] args) {
        

        int contador =1;
        
        System.out.println(" valores numericos divisiveis por 4 e menores que 200: ");

        while (contador < 200 ) {
            if (contador % 4 == 0) {
                System.out.println( contador);
                
            }
          contador++;   
        }
    }
    
}
