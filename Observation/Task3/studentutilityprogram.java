public class StudentUtilityProgram {

public static long findFactorial(int n) {
long fact = 1;
for (int i = 1; i <= n; i++) fact *= i;
return fact;
}
public static boolean isPrime(int n) {
if (n <= 1) return false;
for (int i = 2; i <= Math.sqrt(n); i++) {
if (n % i == 0) return false;
}
return true;
}
public static int findMax(int a, int b) {
return (a > b) ? a : b;
}
public static double calculateCircleArea(double radius) {
return Math.PI * radius * radius;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int choice;
do {
System.out.println("\n--- Student Utility Program ---");
System.out.println("1. Part A: Java Basics (Student Info)");
System.out.println("2. Part B: Conditional Statements");
System.out.println("3. Part C: Looping Statements");
System.out.println("4. Part D: Methods Implementation");

System.out.println("5. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
switch (choice) {
case 1:

System.out.print("Enter Name: ");
String name = sc.next();
System.out.print("Enter Roll Number: ");
int roll = sc.nextInt();
System.out.print("Enter Marks (out of 500): ");
double marks = sc.nextDouble();
double percentage = (marks / 500) * 100;
System.out.println("--- Student Result ---");
System.out.println("Name: " + name + " | Roll: " + roll);
System.out.println("Total Marks: " + marks + " | Percentage: " + percentage + "%");
break;
case 2:

System.out.print("Enter a number to check Even/Odd: ");
int num = sc.nextInt();
System.out.println(num + " is " + (num % 2 == 0 ? "Even" : "Odd"));
System.out.print("Enter three numbers to find largest: ");
int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
int largest = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
System.out.println("Largest is: " + largest);
System.out.print("Enter day number (1-7): ");
int day = sc.nextInt();
switch (day) {
case 1: System.out.println("Monday"); break;
case 2: System.out.println("Tuesday"); break;
case 3: System.out.println("Wednesday"); break;
case 4: System.out.println("Thursday"); break;
case 5: System.out.println("Friday"); break;
case 6: System.out.println("Saturday"); break;
case 7: System.out.println("Sunday"); break;
default: System.out.println("Invalid day");
}
break;
case 3:

System.out.print("Enter N to find sum of first N natural numbers: ");
int n = sc.nextInt();
int sum = 0;
for (int i = 1; i <= n; i++) sum += i;
System.out.println("Sum is: " + sum);
System.out.print("Enter terms for Fibonacci: ");
int terms = sc.nextInt();
int a = 0, b = 1;
System.out.print("Fibonacci Series: " + a + " " + b);
for (int i = 2; i < terms; i++) {
int next = a + b;
System.out.print(" " + next);
a = b; b = next;
}
System.out.println();
break;
case 4:
// Part D
System.out.println("Factorial of 5: " + findFactorial(5));
System.out.println("Is 7 Prime? " + isPrime(7));
System.out.println("Max of 10 and 20: " + findMax(10, 20));
System.out.println("Area of circle (r=5): " + calculateCircleArea(5.0));
break;
case 5:
System.out.println("Exiting...");
break;
default:
System.out.println("Invalid choice!");
  }
} while (choice != 5);
sc.close();
   }
}
