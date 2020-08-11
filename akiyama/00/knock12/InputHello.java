package knock12;

import java.util.Scanner;

public class InputHello {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("input number: ");

		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {

			System.out.println("Hello World!");
			
		}

	}
	
}
