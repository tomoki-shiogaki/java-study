package knock05;

import java.util.Scanner;

public class Arith {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("input 1st number: ");

		int numX = scan.nextInt();

		System.out.print("input 2nd number: ");

		int numY = scan.nextInt();

		System.out.println("òa:  " + (numX + numY));

		System.out.println("ç∑:  " + (numX - numY));

		System.out.println("êœ:  " + (numX * numY));

		System.out.println("è§:  " + (numX / numY) + ",  ó]ÇË:  " + (numX % numY));

		Scanner scanb = new Scanner(System.in);
		
		System.out.print("input 1st number: ");

		int num1 = scanb.nextInt();

		System.out.print("input 2nd number: ");

		int num2 = scanb.nextInt();

		System.out.println("òa:  " + (num1 + num2));

		System.out.println("ç∑:  " + (num1 - num2));

		System.out.println("êœ:  " + (num1 * num2));

		System.out.print("è§:  " + (num1 / num2) + ",  ó]ÇË:  " + (num1 % num2));

	}

}
