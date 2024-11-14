import java.util.Scanner;
class Account{
String customerName;
int accountNumber;
double amount;
String accountType;
public Account(String customerName,int accountNumber,double amount,String accountType){
this.customerName=customerName;
this.accountNumber=accountNumber;
this.amount=amount;
this.accountType=accountType;
}
public void deposit(double depositAmount){
amount += depositAmount;
System.out.println("Deposit successful");
}
public void withdraw(double withdrawAmount){
if(withdrawAmount<=amount) {
amount -= withdrawAmount;
System.out.println("Withdrawal successful");
}else{
System.out.println("Insufficient balance. Withdrawal is not possible.");
}
}
public double getBalance(){
return amount;
}
}
public class Bank{
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.print("Enter no: of customers:");
int n=scanner.nextInt();
scanner.nextLine();
Account[] accounts=new Account[n];
for(int i=0;i<n;i++) {
System.out.println("Enter CustomerId " + (i+1));
System.out.print("Customer Name:");
String customerName=scanner.nextLine();
System.out.print("Account Number:");
int accountNumber=scanner.nextInt();
System.out.print("Initial Amount: ");
double amount=scanner.nextDouble();
scanner.nextLine();
System.out.print("Account Type:");
String accountType=scanner.nextLine();
accounts[i]=new Account(customerName,accountNumber,amount,accountType);
}
for(int i=0;i<n;i++){
System.out.println("\nEnter operations for customer " + (i+1));
System.out.print("Deposit Amount:");
double depositAmount =scanner.nextDouble();
accounts[i].deposit(depositAmount);
System.out.print("Withdraw Amount:");
double withdrawAmount=scanner.nextDouble();
accounts[i].withdraw(withdrawAmount);
}
scanner.close();
double maxBalance=Double.MIN_VALUE;
Account richestCustomer=null;
for(int i=0; i<n; i++){
double balance=accounts[i].getBalance();
if(balance>maxBalance){
maxBalance=balance;
richestCustomer=accounts[i];
}
}
System.out.println("\nCustomer with highest balance:");
System.out.println("Customer Name: " + richestCustomer.customerName);
System.out.println("Account Number: " + richestCustomer.accountNumber);
System.out.println("Account Type: " + richestCustomer.accountType);
System.out.println("Balance: " + richestCustomer.amount);
}
}
