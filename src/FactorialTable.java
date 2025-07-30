// to display factorial table 1-5 with sum of all factorials 
public class FactorialTable {
    public static void main(String[] args) {
        int sum = 0;

        System.out.printf("%-10s %-10s%n", "Number", "Factorial");

        for (int i = 1; i <= 5; i++) {
            int factorial = 1;

            // Calculate factorial of i
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }

            // Print number and factorial
            System.out.printf("%-10d %-10d%n", i, factorial);

            // Add to sum
            sum += factorial;
        }

        System.out.println("-------------------------");
        System.out.printf("Sum       = %d%n", sum);
    }
}
