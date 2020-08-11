package knock15;

import java.util.Scanner;

public class Count2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("input number: ");

		int num = scan.nextInt();

		for (int i = 0; i <= num; i += 2) {

			System.out.println(i);

		}

	}

}
