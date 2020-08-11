package knock19;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int bar_length = 5;

		int[] bar = new int[bar_length];

		for (int i = 0; i < bar_length; i++)

		{

			System.out.print("input number: ");

			int num = scan.nextInt();

			bar[i] = num;

		}

		for (int a = 0; a < bar_length; a++) {

			{

				System.out.println(bar[a]);

			}

		}

	}

}
