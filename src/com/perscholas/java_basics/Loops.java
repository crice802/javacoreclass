/**
 * 
 */
package com.perscholas.java_basics;

/**
 * @author crice
 *
 */
public class Loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
	}

	// Write a program that uses a for-loop to loop
	// through the numbers 1-10 and prints out each number.
	public static void q1() {
		System.out.println("Question 1: ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	// Write a program that uses a while loop to loop through the numbers 0-100 in
	// increments of 10
	// and prints out each number.
	public static void q2() {
		System.out.println("-------------");
		System.out.println("Question 2: ");
		int i = 1;
		while (i <= 100) {
			System.out.println(i);
			i += 10;
		}
	}

	// Write a program that uses a do-while-loop to loop through the numbers
	// 1-10 and prints out each number.
	public static void q3() {
		System.out.println("-------------");
		System.out.println("Question 3: ");
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
	}

	// Write a program that uses a for-loop to loop through the numbers 1-100.
	// Print out each number if is a multiple of 5, but do not print out any numbers
	// between 25 and 75.
	// Use the “continue” statement to accomplish this.
	public static void q4() {
		System.out.println("-------------");
		System.out.println("Question 4: ");
		for (int i = 0; i <= 100; i++) {
			if (i >= 25 && i <= 75) {
				continue;
			}
			System.out.println(i);
		}
	}

	// Write a program that uses a for-loop to loop through the numbers 1-100.
	// Print out each number if is a multiple of 5, but do not print out any numbers
	// greater than 50.
	// Use the “break” keyword to accomplish this.
	public static void q5() {
		System.out.println("-------------");
		System.out.println("Question 5: ");

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
			if (i > 50) {
				break;
			}
		}
	}

	// Write a program that uses nested for-loops to output the following:
	// Week 1:
	//
	// Day 1
	//
	// Day 2
	//
	// Day 3
	//
	// Day 4
	//
	// Day 5
	//
	// Week 2:
	//
	// Day 1
	//
	// Day 2
	//
	// Day 3
	//
	// Day 4
	//
	// Day 5
	public static void q6() {
		System.out.println("-------------");
		System.out.println("Question 6: ");
		for (int i = 1; i <= 2; i++) {
			System.out.println("Week " + i + ":");
			for (int j = 1; j <= 7; j++) {
				System.out.println("Day " + j);
			}
		}
	}

	// Write a program that returns all the available palindromes within 10 and 200.
	// The following output will be produced:
	// 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171,
	// 181, 191
	public static void q7() {
		System.out.println("-------------");
		System.out.println("Question 7: ");
		String reverse;
		for (int i = 10; i < 200; i++) {
			for (int j = i - 1; j < i; j++) {
				if (j == i) {
					System.out.println(j + " is a paladrome of " + i);
				}
			}
		}

	}

	// Write a program that prints the Fibonacci Sequence from 0 to 50.
	// The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
	public static void q8() {
		System.out.println("-------------");
		System.out.println("Question 8: ");

		int n1 = 0, n2 = 1, n3, count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (int i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

	// Write a program that nests a for-loop inside another. Print out the inner and
	// outer variable
	// (e.g., i or j) in the inner loop (e.g., System.out.println("Inner loop: i: "
	// + i + ", j: " + j);).
	public static void q9() {
		System.out.println("\n-------------");
		System.out.println("Question 9: ");
		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				System.out.println("Inner loop: i: " + i + ", j: " + j);
			}
		}
	}

}
