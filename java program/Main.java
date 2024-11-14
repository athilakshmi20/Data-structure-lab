import java.util.Scanner;
class Employee {
int empid;
String name;
double salary;
String address;
Employee(int empid, String name, double salary, String address) {
this.empid = empid;
this.name = name;
this.salary = salary;
this.address = address;
}
}
class Teacher extends Employee {
String department;
String subjectsTaught;
Teacher(int empid, String name, double salary, String address, String department, String subjectsTaught) {
super(empid, name, salary, address);
this.department = department;
this.subjectsTaught = subjectsTaught;
}
void display() {
System.out.println("Employee ID:"+ empid);
System.out.println("Name:"+ name);
System.out.println("Salary:"+ salary);
System.out.println("Address:"+ address);
System.out.println("Department:"+ department);
System.out.println("Subjects Taught:"+ subjectsTaught);
System.out.println();
}
}
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of teachers:");
int n = scanner.nextInt();
Teacher[]teachers = new Teacher[n];
for(int i=0; i<n; i++) {
System.out.println("Enter details for Teacher"+(i+1)+":");
System.out.println("Enter Employee ID:");
int empid = scanner.nextInt();
System.out.println("Enter Name:");
String name = scanner.nextLine();
System.out.println("Enter Salary:");
double salary = scanner.nextDouble();
System.out.println("Enter Address:");
String address = scanner.nextLine();
System.out.println("Enter Department:");
String department = scanner.nextLine();
System.out.println("Enter Subjects Taught:");
String subjectsTaught = scanner.nextLine();
teachers[i] = new Teacher(empid, name, salary, address, department, subjectsTaught);
}
System.out.println("Details of Teachers:");
for (int i=0; i<n; i++) {
teachers[i].display();
}
scanner.close();
}
}




