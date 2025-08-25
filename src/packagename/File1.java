package packagename;
import java.util.Scanner;
public class File1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input: ");
		String in = scanner.nextLine();
		
		System.out.println("Number of letters: " + in.length());
		
		String vowel = "aeiou";
		
		int lo = 103;
		for (int i = 0; i < 5; i++) {
			int vow = in.indexOf(vowel.charAt(i));
			if (vow > -1) {
				if (vow < lo) {
					lo = vow;
				}
			}
			if (i == 4) {
				System.out.println("Index of the first vowel: " + lo);
			}
			
			
		}
		
		System.out.println("Number of letters: " + in.toUpperCase());
		String big = in.substring(0,4);
		String low = in.substring(in.length() - 3);
		String secrect = big.toUpperCase() + low.toLowerCase() + in.length();
		System.out.println("Secret String: " + secrect);
	}
		
}





























	
