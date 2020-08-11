package knock18;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int bar[] = new int[10];

		System.out.print("input number: ");

		int num = scan.nextInt();

		for (int i = 0; i < bar.length; i++) {

			bar[i] = num;

			System.out.println(bar[i]);

		}

	}

}