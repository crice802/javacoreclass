/**
 *
 */
package com.perscholas.java_basics;

/**
 * @author crice
 *
 */
public class Variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
	}

	// Write a program that declares 2 integer variables,
	// assigns an integer to each, and adds them together.
	// Assign the sum to a variable.
	// Print out the result.
	public static void q1() {
		System.out.println("Question 1: ");
		int fNum = 13;
		int sNum = 29;
		int total = fNum + sNum;
		System.out.println(total);
	}

	// Write a program that declares 2 double variables,
	// assigns a number to each, and adds them together.
	// Assign the sum to a variable.
	// Print out the result.
	public static void q2() {
		System.out.println("Question 2: ");
		double fNum = 12.3;
		double sNum = 23.6;
		double total = fNum + sNum;
		System.out.println(total);
	}

	// Write a program that declares
	// an integer variable and a double variable,
	// assigns numbers to each, and adds them together.
	// Assign the sum to a variable.
	// Print out the result. What variable type must the sum be?
	public static void q3() {
		System.out.println("Question 3: ");
		int iNum = 13;
		double dNum = 12.6;
		// total must be double since once var is a double
		double total = iNum + dNum;
		System.out.println(total);
	}

	// Write a program that declares 2 integer variables,
	// assigns an integer to each,
	// and divides the larger number by the smaller number.
	// Assign the result to a variable. Print out the result.
//RESULT: 0; due to rounding a decimal since wrong data type
	public static void q4() {
		System.out.println("Question 4: ");
		// Now change the larger number to a decimal.

		double iNum = 13;
		int iNum2 = 12;
		// What happens? What corrections are needed?
//Type mismatch: cannot convert from double to int
//Declare total to double
		double total = iNum2 / iNum;
		System.out.println(total);
	}

	// Write a program that declares 2 double variables,
	// assigns a number to each, and divides the larger by the smaller.
	// Assign the result to a variable. Print out the result.
	// Now, cast the result to an integer.
	// Print out the result again.
	public static void q5() {
		System.out.println("Question 5");
		double dNum = 12.4;
		double dNum2 = 43.3;
		double total = dNum / dNum2;
		System.out.printf("Total: " + total);
		int newTotal = (int) total;
		System.out.printf("\nNew total: " + newTotal);

	}

	// Write a program that declares 2 integer variables, x, and y,
	// and assign 5 to x and 6 to y.
	// Declare a variable q and assign y/x to it and print q
	// Now, cast y to a double and assign to q. Print q again.
	public static void q6() {
		System.out.println("\nQuestion 6: ");
		int x = 5;
		int y = 6;
		int q = y / x;
		System.out.println("total 1: " + q);
		double newQ = q;
		System.out.println("New total: " + newQ);
	}

	// Write a program that declares a named constant and uses it in a calculation.
	// Print the result.
	public static void q7() {
		System.out.println("Question 7: ");
		final int MULTI = 50;
		double points = 100;
		final double SCORE = MULTI * points;
		System.out.println(SCORE);
	}

	// Write a program where you create 3 variables
	// that represent products at a cafe.
	// The products could be beverages like coffee, tea, etc
	// Assign prices to each product.
	// Create 2 more variables called subtotal and totalSale
	// and complete an “order” for 3 items of the first product
	// 4 items of the second product, and 2 items of the third product.
	// Add them all together to calculate the subtotal.
	// Create a constant called SALES_TAX and add sales tax to the subtotal
	// to obtain the totalSale amount.
	// Be sure to format the results to 2 decimal places.
	public static void q8() {
		System.out.println("Question 8: ");
		double coffee = 1.25, sandwich = 2.50, tea = .99;
		double subtotal, totalSale;
		final double SALES_TAX = .975;
		double order = (3 * coffee) + (4 * sandwich) + (2 * tea);
		subtotal = order;
		totalSale = subtotal * SALES_TAX;
		System.out.format("%.2f", totalSale);
	}
}