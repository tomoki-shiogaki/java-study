package knock07;

import java.util.Scanner;

public class NotZero {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("input number: ");

		int num = scan.nextInt();

		if (num == 0) {

			System.out.println("zero");

		} else {

			System.out.println("not zero");

		}

	}

}