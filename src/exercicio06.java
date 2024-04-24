public class exercicio06 {

    public static void main(String[] args) {
        
        System.out.println("Celsius   |   Fahrenheit");
        System.out.println("--------------------------");
 
        for (int celsius = 10; celsius <= 100; celsius += 10) {
            double fahrenheit = celsius * 1.8 + 32;
            System.out.printf("%5d     |    %8.2f%n", celsius, fahrenheit);
    
    
    
        }

    }
    
}
