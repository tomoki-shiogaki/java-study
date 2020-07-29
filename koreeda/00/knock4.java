package com.petitmonte;

import java.util.Scanner;

//No.2 12345‚ð7‚ÅŠ„‚Á‚½‚ ‚Ü‚è
public class knock4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("input number: ");
		int num = scanner.nextInt();
		
		System.out.println("answer = " + num*3);
		
		scanner.close();
	}
}
