package com.practice.java_practice;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		System.out.println("Taking Input from User! ");
		Scanner input = new Scanner(System.in);
		float a = input.nextFloat();
		System.out.println(a);
		String b = input.next();
		System.out.println(b);
		
		System.out.println(a + input.nextInt());
		
		
	}

}
