package knock05;

import java.util.Scanner;

public class Arith {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("input 1st number: ");

		int numX = scan.nextInt();

		System.out.print("input 2nd number: ");

		int numY = scan.nextInt();

		System.out.println("�a:  " + (numX + numY));

		System.out.println("��:  " + (numX - numY));

		System.out.println("��:  " + (numX * numY));

		System.out.println("��:  " + (numX / numY) + ",  �]��:  " + (numX % numY));

		Scanner scanb = new Scanner(System.in);
		
		System.out.print("input 1st number: ");

		int num1 = scanb.nextInt();

		System.out.print("input 2nd number: ");

		int num2 = scanb.nextInt();

		System.out.println("�a:  " + (num1 + num2));

		System.out.println("��:  " + (num1 - num2));

		System.out.println("��:  " + (num1 * num2));

		System.out.print("��:  " + (num1 / num2) + ",  �]��:  " + (num1 % num2));

	}

}
