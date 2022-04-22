/**
 * 
 */
package com.perscholas.java_basics;

import java.util.Scanner;

/**
 * @author crice
 *
 */
public class ControlFlow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		q1();
		q2();
		q3();
		q4();
		q5(sc);
		q6(sc);
		sc.close();
	}

	// Write a program that declares 1 integer variable x, and then assigns 7 to it.
	// Write an if statement to print out “Less than 10” if x is less than 10.
	// Change x to equal 15 and notice the result (console should not display
	// anything).
	public static void q1() {
		System.out.println("Question 1: ");
		int x = 17;
		if (x < 10) {
			System.out.println("Less than 10");
		}
	}

	// Write a program that declares 1 integer variable x, and then assigns 7 to it.
	// Write an if-else statement that prints out “Less than 10” if x is less than
	// 10 and “Greater than 10” if x is greater than 10.
	// Change x to 15 and notice the result.
	public static void q2() {
		System.out.println("-----------------------------------");
		System.out.println("Question 2: ");
		int x = 17;
		if (x < 10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("Greater than 10");

		}

	}

	// Write a program that declares 1 integer variable x, and then assigns 15 to
	// it.
	// Write an “if-else-if” statement that prints out “Less than 10” if x is less
	// than 10,
	// “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater
	// than or equal to 20”
	// if x is greater than or equal to 20. Change x to 50 and notice the result.
	public static void q3() {
		System.out.println("-----------------------------------");
		System.out.println("Question 3: ");
		int x = 50;
		if (x < 10) {
			System.out.println("Less than 10");
		} else if (x > 10 && x < 20) {
			System.out.println("Between 10 and 20");
		} else {
			System.out.println("Greater than or equal to 20");
		}
	}

	// Write a program that declares 1 integer variable x, and then assigns 15 to
	// it.
	// Write an if-else statement that prints “Out of range” if the number is less
	// than 10
	// or greater than 20 and prints “In range” if between 10 and 20 (including
	// equal to 10 or 20).
	// Change x to 5 and notice the result.
	public static void q4() {
		System.out.println("-----------------------------------");
		System.out.println("Question 4: ");
		int x = 25;
		if (x < 10 || x > 20) {
			System.out.println("Out of range");
		} else {
			System.out.println("In range");
		}
	}

	// Write a program that uses if-else-if statements to print out grades A, B, C,
	// D, F according to the following criteria:
	// A: 90-100
	//
	// B: 80-89
	//
	// C: 70-79
	//
	// D: 60-69
	//
	// F: <60
	//
	// Use the Scanner class to accept a number score from the user to determine the
	// letter
	// grade. Print out “Score out of range.” if the score is less than 0 or greater
	// than 100.
	public static void q5(Scanner sc) {
		System.out.println("-----------------------------------");
		System.out.println("Question 5: ");
		System.out.println("Please input your score: ");

		int grades = sc.nextInt();
		if (grades > 100 || grades < 0) {
			System.out.println("Score out of range");
		} else if (grades >= 90) {
			System.out.println("A");
		} else if (grades >= 80) {
			System.out.println("B");
		} else if (grades >= 70) {
			System.out.println("C");
		} else if (grades >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

	// Write a program that accepts an integer between 1 and 7 from the user.
	// Use a switch statement to print out the corresponding weekday.
	// Print “Out of range” if the number is less than 1 or greater than 7.
	// Don’t forget to include “break” statements in each of your cases.
	public static void q6(Scanner sc) {
		System.out.println("-----------------------------------");
		System.out.println("Question 6: ");
		System.out.println("Enter a number from 1-7");

		String dayOfWeek;
		int range = sc.nextInt();
		switch (range) {
		case 1:
			dayOfWeek = "Sunday";
			System.out.println(dayOfWeek);
			break;
		case 2:
			dayOfWeek = "Monday";
			System.out.println(dayOfWeek);
			break;
		case 3:
			dayOfWeek = "Tuesday";
			System.out.println(dayOfWeek);
			break;
		case 4:
			dayOfWeek = "Wednesday";
			System.out.println(dayOfWeek);
			break;
		case 5:
			dayOfWeek = "Thursday";
			System.out.println(dayOfWeek);
			break;
		case 6:
			dayOfWeek = "Friday";
			System.out.println(dayOfWeek);
			break;
		case 7:
			dayOfWeek = "Saturday";
			System.out.println(dayOfWeek);
			break;
		default:
			dayOfWeek = "Out of range";
			System.out.println(dayOfWeek);
			break;
		}

	}

}
