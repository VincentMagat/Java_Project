package com.TheMasterMindGroup.BasicPrograming;

import java.util.Scanner;

public class ComputeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 variables");
		
		int firstVariable = input.nextInt();
		int secondVariable = input.nextInt();
		int thirdVariable = input.nextInt();
		
		int average = (firstVariable + secondVariable + thirdVariable) / 3;
		System.out.println("The Average of " + firstVariable + " " + secondVariable + " " + thirdVariable + " is " + average);

	}

}
