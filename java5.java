import java.util.Scanner;
public class java1 {
    

public class FactorialCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    }
}