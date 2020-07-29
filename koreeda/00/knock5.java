package com.petitmonte;

import java.util.Scanner;

public class knock5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("input 1st number: ");
		int num1 = scanner.nextInt();
		System.out.print("input 2nd number: ");
		int num2 = scanner.nextInt();
		
		System.out.println("˜a:" + (num1 + num2));
		System.out.println("·:" + (num1 - num2));
		System.out.println("Ï:" + (num1 * num2));
		System.out.println("¤:" + (num1 / num2) +",@—]‚è: " + (num1 % num2));
		
		scanner.close();
	}

}
