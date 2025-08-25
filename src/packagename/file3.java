package packagename;
import java.util.Scanner;
public class file3 {

	public static int maxFinder(int a, int b) {
		if (a>b) { 
			return a;
		} else {
			return b;
		}
	}
		
	public static double maxFinder(double a, double b) {
		if (a>b) { 
			return a;
		} else {
			return b;
		}
	}
		
	public static double maxFinder(double a, int b) {
		if (a>b) { 
			return a;
		} else {
			return b;
		}
	}
	
	public static double maxFinder(int a, double b) {
		if (a>b) { 
			return a;
		} else {
			return b;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		double a = scanner.nextDouble();
		
		System.out.print("Enter the second number: ");
		double b = scanner.nextDouble();
		
		if (a % 1 == 0) {
			a = (int)a;
		}
		if (b % 1 == 0) {
			b = (int)b;
		}
		
		System.out.println( file3.maxFinder(a, b) + " is bigger");
		

		
		
        
	}

}
