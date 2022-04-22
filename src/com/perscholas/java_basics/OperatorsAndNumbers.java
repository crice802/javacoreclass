/**
 * 
 */
package com.perscholas.java_basics;

/**
 * @author crice
 *
 */

// slide deck 
public class OperatorsAndNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
	}
	// Question 1:
	// Write the following integers in binary notation.
	// Do not use any Java functions or online conversion
	// applications to calculate the answer as this will hinder
	// the learning process and your understanding of the concept.
	// However, you may check your answers using Java methods.
	// 1 = 1000
	// 8 = 0001
	// 33 = 100001
	// 78 = 1001110
	// 787 = 1100010011
	// 33987 = 1000010011000011

	// Qurstion 2:
	// Convert the following binary numbers to decimal notation.
	// 0010 = 2
	// 1001 = 9
	// 0011 0100 = 52
	// 0111 0010 = 114
	// 0010 0001 1111 = 543
	// 0010 1100 0110 0111 = 11367

	// Question 3:
	// Write a program that declares an integer a variable x and assigns the value 2
	// to it
	// and prints out the binary string version of the number (
	// Integer.toBinaryString(x) ).
	// Now, use the left shift operator (<<) to shift by 1 and assign the result to
	// x.
	// Before printing the results, write a comment with the predicted decimal value
	// and binary string.
	// Now, print out x in decimal form and in binary notation.
	public static void q3() {
		int x = 2;
		System.out.println(Integer.toBinaryString(x));
		x = x << 1;
		// 2 think its going to shift left one place to 4
		System.out.println(Integer.toBinaryString(x));
		System.out.println(x);
		int y = 9;
		System.out.println(Integer.toBinaryString(y));
		y = y << 1;
		// 2 think its going to shift left one place to 16
		System.out.println(Integer.toBinaryString(y));
		System.out.println(y);
		int a = 17;
		System.out.println(Integer.toBinaryString(a));
		a = a << 1;
		// 2 think its going to shift left one place to 24
		System.out.println(Integer.toBinaryString(a));
		System.out.println(a);
		int z = 88;
		System.out.println(Integer.toBinaryString(z));
		z = z << 1;
		// 2 think its going to shift left one place to 124
		// OH THEY DOUBLE EACH TIME!
		System.out.println(Integer.toBinaryString(z));
		System.out.println(z);
	}

	// Write a program that declares a variable x and assigns 150 to it and prints
	// out the binary string version of the number.
	// Now use the right shift operator (>>) to shift by 2 and assign the result to
	// x.
	// Write a comment indicating what you anticipate the decimal and binary values
	// to be.
	// Now print the value of x and the binary string.
	public static void q4() {
		System.out.println("---------------------");
		System.out.println("Question 4: ");
		int x = 150;
		System.out.println(Integer.toBinaryString(x));
		x = x >> 2;
		// i think binary will be 010110 or 22
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		int y = 225;
		y = y >> 2;
		// i think this will be 86
		System.out.println(y);
		System.out.println(Integer.toBinaryString(y));
		int z = 1555;
		z = z >> 2;
		// i think this will be 255
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
		int a = 32456;
		a = a >> 2;
		// i think this will be 1556
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));
	}

	// Write a program that declares 3 int variables x, y, and z. Assign 7 to x and
	// 17 to y.
	// Write a comment that indicates what you predict will be the result of the
	// bitwise & operation on x and y.
	// Now use the bitwise & operator to derive the decimal and binary values and
	// assign the result to z.
	// Now, with the preceding values, use the bitwise | operator to calculate the
	// “or” value between x and y.
	// As before, write a comment that indicates what you predict the values to be
	// before printing them out.
	public static void q5() {
		System.out.println("--------------------------");
		System.out.println("question 5: ");
		int x = 7, y = 17, z;
		// bitwise AND i honestly have no clue
		z = x & y;
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
		// bitwise OR is goign to come back 1
		z = x | y;
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
	}

	// Write a program that declares an integer variable, assigns a number, and uses
	// a postfix increment operator to increase the value.
	// Print the value before and after the increment operator.
	public static void q6() {
		System.out.println("----------------------------");
		System.out.println("Question 6: ");
		int x = 17;
		System.out.println("x = " + x);
		x++;
		System.out.println("x = " + x);
	}

	// Write a program that demonstrates at least 3 ways to increment a variable by
	// 1 and does this multiple times.
	// Assign a value to an integer variable, print it, increment by 1, print it
	// again, increment by 1, and then print again.
	public static void q7() {
		System.out.println("-----------------------------");
		System.out.println("Question 7: ");
		int i = 1;
		System.out.println(i);
		i += i;
		System.out.println(i);
		i++;
		System.out.println(i);
		i = i + 1;
		System.out.println(i);
	}

	// Write a program that declares 2 integer variables, x, and y, and then assigns
	// 5 to x and 8 to y.
	// Create another variable sum and assign the value of ++x added to y and print
	// the result.
	// Notice the value of the sum (should be 14). Now change the increment operator
	// to postfix (x++) and re-run the program.
	// Notice what the value of sum is. The first configuration incremented x and
	// then calculated the sum while the second configuration calculated the sum and
	// then incremented x.
	public static void q8() {
		System.out.println("------------------------");
		System.out.println("Question 8: ");
		int x = 5, y = 8;
		int sum = x++ + y;
		System.out.println(sum);
	}
}
