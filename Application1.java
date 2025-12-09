
import java.util.Scanner;

/*************************************************************
 *  Compilation:  		javac Application1.java
 *  Execution:    		java Application1
 *
 *	Student Name:		THOMAS VASILAS
 *  Student ID Number:	3200012
 *
 *************************************************************/
 
public class Application1 {
	
	// ---------------------- Q1 ---------------------------- 
	public static boolean isPrime (int n) {
		// Fill your code here
		boolean isprime = true;
		for(int i=2;i<n;i++){
			if(n%i == 0){
				isprime = false;
				break;
			}
		}
		return isprime;
	}//isPrime
		
	
	// ---------------------- Q2 ---------------------------- 
	public static int factorial(int n) {
		// Fill your code here
		int f=1;
		for (int i=1;i<=n;i++){
			f=f*i;
		}
		return f;
	}//factorial
	
	
	// ---------------------- Q3 ---------------------------- 	
	public static int combinations(int n, int k) {
		// Fill your code here
		return factorial(n) / ( factorial(k) * (factorial(n-k) ) );
	}// combinations
	
	
	// ---------------------- Q4 ---------------------------- 
	public static int digitsOfInteger (int n) {
		// Fill your code here
		int counter=0;
		while (n>0){
			counter++;
			n=n/10;
		}
		return counter;
	}//digitsOfInteger

	
	// ---------------------- Q5 ---------------------------- 
	public static void quadraticEquation (double a, double b, double c) {
		// Fill your code here
		if (b*b-(4*a*c)>=0){
			double x1=(-b + Math.sqrt(b*b - (4*a*c))) / (2*a);
			double x2=(-b - Math.sqrt(b*b - (4*a*c))) / (2*a);
			System.out.printf("The first solution is: %.2f",x1);
			System.out.printf("\nThe second solution is: %.2f",x2);
		}else{
			System.out.println("ARNHTIKH DIAKRINOUSA: DEN YPARXOUN PRAGMATIKES TIMES GIA THN EPILYSH THS EKSISWSHS");
		}
	}//quadraticEquation

	
	// ---------------------- Q6 ---------------------------- 
	public static double findArea(double a, double b, double c) {
		// Fill your code here
		double hp = (a+b+c)/2;
		double area = Math.sqrt(hp*(hp-a)*(hp-b)*(hp-c));
		if (area < 0){
			return -1;
		}else{
			return area;
		}
	}//findArea

	
	// ---------------------- Q7 ---------------------------- 
	public static int reverseDigits (int n) {
		// Fill your code here
		int rev_num = 0;
		while(n > 0){
			rev_num = rev_num * 10 + (n % 10);
			n = n / 10;
		}
		return rev_num;
    }//reverseDigits

	
	// ---------------------- Q8 ---------------------------- 
	public static int minDigit(int n) {
		// Fill your code here
		int small = 9;
		while (n > 0){
			small = Math.min( (n % 10) , small);
			n = n / 10;
		}
		return small;
	}//minDigit
	
		
	public static void main(String args[]) {
		
		// Fill your code here
		Scanner scanner = new Scanner(System.in);
		
		
		// ---------------- Q1 ----------------------------
		System.out.println("\n\nQ1 - Prime Number (n)");
		// Fill your code here
		System.out.print("n(>1)= ");
		int i_1 = scanner.nextInt();
		if (isPrime(i_1)){
			System.out.println(i_1 + " is a prime number");
		}else{
			System.out.println(i_1 + " is not a prime number");
		}
		
		
		// ---------------- Q2 ----------------------------
		System.out.println("\n\nQ2 - Factorial (n)");
		// Fill your code here
		System.out.print("n= ");
		int i_2 = scanner.nextInt();
		System.out.println("Factorial("+i_2+")="+factorial(i_2));
		
		
		// ---------------- Q3 ----------------------------
		System.out.println("\n\nQ3 - Combinations (n,k)");
		// Fill your code here
		System.out.print("n=");
		int i_31 = scanner.nextInt();
		System.out.print("k=");
		int i_32 = scanner.nextInt();
		System.out.println("Combinations("+i_31+","+i_32+")="+ combinations(i_31, i_32));
		
		

		// ---------------- Q4 ----------------------------	
		System.out.println("\n\nQ4 - Number of digits");
		// Fill your code here
		System.out.print("Enter a positive integer: ");
		System.out.print("\nn= ");
		int i_4 = scanner.nextInt();
		System.out.println("Number of digits = " + digitsOfInteger(i_4));
		
		
		
		// ---------------- Q5 ----------------------------
		System.out.println("\n\nQ5 - Quadratic equation...");
		// Fill your code here
		System.out.print("Enter a(<>0): ");
		int i_51 = scanner.nextInt();
		System.out.print("Enter b: ");
		int i_52 = scanner.nextInt();
		System.out.print("Enter c: ");
		int i_53 = scanner.nextInt();
		quadraticEquation(i_51,i_52,i_53);
		
		
		
		// ---------------- Q6 ----------------------------
		System.out.println("\n\nQ6 - Area of a triangle");
		// Fill your code here
		System.out.print("Enter the length of the three sides. ");
		System.out.print("\nEnter a: ");
		int i_61 = scanner.nextInt();
		System.out.print("Enter b: ");
		int i_62 = scanner.nextInt();
		System.out.print("Enter c: ");
		int i_63 = scanner.nextInt();
		System.out.printf("The area of a triangle is: %.2f",findArea(i_61,i_62,i_63));
		
		
		
		// ---------------- Q7 ----------------------------
		System.out.println("\n\nQ7 - Reverse digits");
		// Fill your code here
		System.out.print("Enter a positive integer: ");
		System.out.print("\nn= ");
		int i_7 = scanner.nextInt();
		System.out.println("The reversed number is= "+reverseDigits(i_7));
		
		
		
		// ---------------- Q8 ----------------------------	
		System.out.println("\n\nQ8 - Min Digit");
		// Fill your code here
		System.out.print("Enter a positive integer: ");
		System.out.print("\nn = ");
		int i_8 = scanner.nextInt();
		System.out.println("Min Digit= " + minDigit(i_8));
				
		
    } //main

} //Application1