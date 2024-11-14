import java.util.Scanner;
class Person {
String name, gender, address;
int age;
Person(String name, String gender, String address, int age) {
this.name = name;
this.gender = gender;
this.address = address;
this.age = age;
}
}
class Employee extends Person {
int empid;
String company_name;
String qualification;
double salary;
Employee(String name, String gender, String address, int age, int empid, String company_name, String qualification, double salary) {
super(name, gender, address, age);
this.empid = empid;
this.company_name = company_name;
this.qualification = qualification;
this.salary = salary;
}
}
class Teacher extends Employee {
String subject;
String department;
int teacherid;
Teacher(String name, String gender, String address, int age, int empid, String company_name, String qualification, double salary, String subject, String department, int teacherid) {
super(name, gender, address, age, empid, company_name, qualification, salary);
this.subject = subject;
this.department = department;
this.teacherid = teacherid;
}
void display() {
System.out.println("\nTeacher ID:"+ teacherid);
System.out.println("Name:"+ name);
System.out.println("Gender:"+ gender);
System.out.println("Address:"+ address);
System.out.println("Age:"+ age);
System.out.println("Empid:"+ empid);
System.out.println("Company_name:"+ company_name);
System.out.println("Qualification:"+ qualification);
System.out.println("Salary:"+ salary);
System.out.println("Subject:"+ subject);
System.out.println("Department:"+ department);
}
}
public class Main1 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of teachers:");
int n = scanner.nextInt();
Teacher[]teachers = new Teacher[n];
for (int i=0; i<n; i++) {
System.out.println("\nEnter details for Teacher"+(i+1)+":");
System.out.println("Name:");
String name = scanner.next();
System.out.println("Gender:");
String gender = scanner.next();
System.out.println("Address:");
String address = scanner.next();
System.out.println("Age:");
String age = scanner.nextInt();
System.out.println("Empid:");
String empid = scanner.nextInt();
System.out.println(":");
String name = scanner.next();








