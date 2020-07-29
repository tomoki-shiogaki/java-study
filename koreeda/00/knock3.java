package com.petitmonte;
import java.util.Scanner;

public class knock3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("input number: ");
		int num = scanner.nextInt();
		
		System.out.println("Your number is " + num);
		
		scanner.close();
	}

}
