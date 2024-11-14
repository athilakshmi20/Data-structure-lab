public class AverageCalculatorTest {
    public static void main(String[] args) {
        AverageCalculator calculator = new AverageCalculator();
        int[] numbers = {10, 20, 30, 5, 40};

        try {
            double average = calculator.calculateAverage(numbers);
            System.out.println("Average: " + average);
        } catch (NegativeInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
