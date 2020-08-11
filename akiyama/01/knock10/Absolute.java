package knock10;

import java.util.Scanner;

public class Absolute {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("input number: ");

		int num = scan.nextInt();

		num = Math.abs(num);

		System.out.println("absolute value is " + num);
		
	}
	
}
