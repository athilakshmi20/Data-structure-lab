public class AverageCalculatorTest{
public static void main(String[] args){
AverageCalculator calculator=new AverageCalculator();
int[] numbers={1,2,3,6};
try{
double average=calculator.calculateAverage(numbers);
System.out.println("Average:" + average);
}catch (NegativeInputException e){
System.out.println("Error:"+ e.getMessage());
}
}
}
