/**
 * 
 */
package com.perscholas.cafe;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author crice
 *
 */
public class CafeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product coffee = new Product();
		Product espresso = new Product();
		Product cappuccino = new Product();

		cappuccino.setPrice(3.00);
		espresso.setPrice(2.00);
		coffee.setPrice(1.00);
		cappuccino.setDescription("Lots of foam.");
		espresso.setDescription("Bold, black and string");
		coffee.setDescription("Boiled bean juice.");

		try (Scanner input = new Scanner(System.in);) {
			String order = input.next();
			input.nextLine();
		} catch (IOException e) {
			e.getStackTrace();
		}

	}

}
