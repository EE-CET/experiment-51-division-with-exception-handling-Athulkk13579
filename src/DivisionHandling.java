import java.util.Scanner;

public class DivisionWithExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            try {
                int result = a / b;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Divide by zero error");
            }
        }
        
        scanner.close();
    }
}
