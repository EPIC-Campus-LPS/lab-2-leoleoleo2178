package packagename;
import java.util.Scanner;
import java.util.Random;
public class file2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        for (int i = 0; i < 3; i++) {
			int bound = 100;
	        int u = random.nextInt(bound);
	        double ah = Math.sqrt(u);
	        System.out.println("Whats the square root of " + u + "? ");
	        double g = scanner.nextDouble();
	        
	        if (g == ah) {
	        	System.out.println("Good Job");
	        	score += 1;
	        } else {
	        	System.out.println("Close it was " + ah);
	        }
	        
	        
        }
       System.out.println("Your score is " + score + "/3");
       scanner.close();
	}

}
