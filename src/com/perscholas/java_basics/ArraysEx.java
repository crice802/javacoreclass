/**
 * 
 */
package com.perscholas.java_basics;

import java.util.Arrays;

/**
 * @author crice
 *
 */
public class ArraysEx {

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
		q9();
		q10();

	}

	// Write a program that creates an array of integers with a length of 3.
	// Assign the values 1, 2, and 3 to the indexes. Print out each array element.
	public static void q1() {
		System.out.println("Question 1: ");
		int[] arr = { 13, 21, 42 };
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

	// Write a program that returns the middle element in an array.
	// Give the following values to the integer array: {13, 5, 7, 68, 2} and produce
	// the following output: 7
	public static void q2() {
		System.out.println("Question 2: ");
		System.out.println("------------");
		int[] arr = { 13, 5, 7, 68, 2 };
		System.out.println(arr[arr.length / 2]);

	}

	// Write a program that creates an array of String type and initializes it with
	// the strings “red”, “green”, “blue” and “yellow”.
	// Print out the array length. Make a copy using the clone( ) method.
	// Use the Arrays.toString( ) method on the new array to verify that the
	// original array was copied.
	public static void q3() {
		System.out.println("Question 3: ");
		System.out.println("------------");
		String[] colors = { "red", "green", "blue", "yellow" };
		System.out.println("array length = " + colors.length);
		String[] newColor = colors.clone();
		System.out.println(Arrays.toString(newColor));

	}

	public static void q4() {
		System.out.println("Question 4: ");
		System.out.println("------------");
		int[] numbers = { 15, 13, 1, 14, 74 };
		System.out.println(numbers[0]);
//		System.out.println(numbers[numbers.length - 1]);
		// Eception: Index 5 out of bounds for length 5
//		System.out.println(numbers[numbers[5]]);
	}

	public static void q5() {
		System.out.println("Question 5: ");
		System.out.println("------------");
		int[] numbers = { 15, 13, 1, 14, 74 };

		for (int i = 0; i < numbers.length - 1; i++) {
			System.out.println(numbers[i]);
		}

	}

	public static void q6() {
		System.out.println("Question 6: ");
		System.out.println("------------");
		int[] numbers = { 15, 13, 1, 14, 74 };

		for (int i = 0; i < numbers.length - 1; i++) {
			numbers[i] += (i * 2);
			System.out.println(numbers[i]);
		}
	}

	public static void q7() {
		System.out.println("Question 7: ");
		System.out.println("------------");

		int[] numbers = { 15, 13, 1, 14, 74 };
		for (int i = 0; i < numbers.length; i++) {
			if (i == 2) {
				continue;

			}

			System.out.println(numbers[i]);
		}
	}

	public static void q8() {
		System.out.println("Question 8: ");
		System.out.println("------------");

		String[] names = { "cory", "john", "mike", "josh", "aftin" };

		String first = names[0];
		String second = names[2];

		names[2] = first;
		names[0] = second;
		System.out.println(Arrays.toString(names));

	}

	public static void q9() {
		System.out.println("Question 9: ");
		System.out.println("------------");

		int[] nums = { 4, 2, 9, 13, 1, 0 };
		Arrays.sort(nums);
//		int first = 0;
//		int second = 0;
//		int temp;
//		
//		for (int i = 0 ; i < nums.length; i++) {
//			first = i;
//			if(first > second) {
//				temp = first;
//				second = temp;
//				first = second;
//			}
//			
		System.out.println("Array in ascending order: " + Arrays.toString(nums));
		System.out.println("The smallest number is " + nums[0]);
		System.out.println("The biggest number is " + nums[5]);
//		}

	}

	public static void q10() {
		System.out.println("Question 10: ");
		System.out.println("------------");

		Object[] arr = { 1, "this is", "a string", "im also a string", 4.30 };
		System.out.println(Arrays.toString(arr));
	}

}
