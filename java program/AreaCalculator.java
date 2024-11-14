
import java.io.*;
class AreaCalculator{
double CalculateArea(double side){
return side * side;
}
double calculateArea(double length,double breath){
return length * breadth;
}
double calculateArea(double radius){
return Math.P1 * radius * radius;
}
public static void main(String arg[]){
AreaCalculator calculator=new AreaCalculator();
System.out.println("Area of square with side 5:"+calculator.calculateArea(5));
System.out.println("Area of rectangle with length 4 and breath 6:"+calculator.calculateArea(4,6));
System.out.println("Area of circle with radius 3:"+calculator.calculateArea(3));
}
}
