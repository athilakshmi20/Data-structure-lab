public class AverageCalculator{
public double calculateAverage(int[] numbers) throws NegativeInputException{
int sum=0;
int count=0;
for(int num : numbers){
if(num<0){
throw new NegativeInputException("negative input found");
}
sum += num;
count++;
}
return (double)sum/count;
}
}