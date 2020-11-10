package D_JavaAdvancedOOP.Lecture9_ExceptionsAndErrorHandling.ExProblem_1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        try {
            getSqrt(n);
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        } finally {
            System.out.println("Good bye");
        }




    }

    public static void getSqrt(int n) {
        double sqrt = Math.sqrt(n);
        if (Double.isNaN(sqrt)) {
            throw new ArithmeticException("Invalid Number");
        } else {
            System.out.println(sqrt);
        }
    }


}
