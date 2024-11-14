import java.util.Scanner;
class Employee
{
int eNo;
String eName;
double esalary;
Employee(int eNo, String eName, double esalary)
{
this.eNo = eNo;
this.eName = eName;
this.esalary = esalary;
}
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("enter the number of employees:");
int n = scanner.nextInt();
Employee[] employees = new Employee[n];
System.out.println("Enter employee details(eNo, eName, esalary):");
for(int i = 0;i < n;i++)
{
int eNo = scanner.nextInt();
String eName = scanner.next();
double esalary = scanner.nextDouble();
employees[i] = new Employee(eNo, eName, esalary);
}
System.out.println("Enter employee number to search:");
int searchNo = scanner.nextInt();
boolean found = false;
for(Employee emp : employees)
{
if(emp.eNo == searchNo) {
System.out.println("Employee found:");
System.out.println("Employee Number:" + emp.eNo);
System.out.println("Employee Name:" + emp.eName);
System.out.println("Employee salary:" + emp.esalary);
found = true;
break;
}
}
if (!found) {
System.out.println("Employee with give number not found.");
}
scanner.close();
}
}
