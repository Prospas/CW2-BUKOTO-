//Certainly! Here's a simple Java program that implements the described functionality using both a for loop and a while loop:


import java.util.Scanner;

public class InvestmentCalculator {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the principal amount: ");
 double principal = scanner.nextDouble();

 System.out.print("Enter the interest rate (in decimal): ");
 double interestRate = scanner.nextDouble();

 System.out.print("Enter the time period (in years): ");
 double timePeriod = scanner.nextDouble();

 double investmentValue;

 // Using a for loop
 System.out.println("Using a for loop:");
 for (int i = 1; i <= timePeriod; i++) {
 investmentValue = principal * Math.pow((1 + interestRate), i);
 System.out.println("Investment value after " + i + " years: " + investmentValue);
 }

 // Using a while loop
 System.out.println("\nUsing a while loop:");
 int i = 1;
 investmentValue = principal;

 while (i <= timePeriod) {
 investmentValue *= (1 + interestRate);
 System.out.println("Investment value after " + i + " years: " + investmentValue);
 i++;
 }

 scanner.close();
 }
}
//```

//This program prompts the user to enter the principal amount, interest rate, and time period. Then, it calculates the investment value using both a for loop and a while loop, displaying the results for each method.