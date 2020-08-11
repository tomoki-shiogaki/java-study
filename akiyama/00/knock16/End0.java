package knock16;

import java.util.Scanner;

public class End0 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("input number: ");

		int num = scan.nextInt();

		while (num != 0) {

			System.out.print("input number: ");

			num = scan.nextInt();

		}

	}

}
