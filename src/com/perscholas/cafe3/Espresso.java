/**
 * 
 */
package com.perscholas.cafe3;

import java.util.Scanner;

/**
 * @author crice
 *
 */
public class Espresso extends Product {

	boolean extraShot, macchiato;

	/**
	 * @return the extraShot
	 */
	public boolean isExtraShot() {
		return extraShot;
	}

	/**
	 * @param extraShot the extraShot to set
	 */
	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}

	/**
	 * @return the macchiato
	 */
	public boolean isMacchiato() {
		return macchiato;
	}

	/**
	 * @param macchiato the macchiato to set
	 */
	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}

	Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
		super(name, price, description);
		// TODO Auto-generated constructor stub
		this.extraShot = extraShot;
		this.macchiato = macchiato;
	}

	Espresso() {
		super("Espresso", 2.50, "Bold, black and string");
		this.extraShot = false;
		this.macchiato = false;
	}

	@Override
	double calculateProductSubtotal(int quantity) {
		double addOns = 0;
		if (extraShot)
			addOns += 2.00;
		if (macchiato)
			addOns += 1.00;
		return quantity * price + addOns;
	}

	@Override
	void addOptions() {
		// TODO Auto-generated method stub
		String addExtraShot, addMacchiato;

		try (Scanner input = new Scanner(System.in)) {

			System.out.println("How many espressos would you like?");
			int numEspressos = input.nextInt();
			this.setQuantity(numEspressos);

			System.out.println("Would you like an extra shot of espresso? Enter Y or N.");
			addExtraShot = input.next();

			if (addExtraShot.equals("y")) {
				this.setExtraShot(true);
			}

			System.out.println("Would you like espresso macchiato? Enter Y or N.");
			addMacchiato = input.next().toLowerCase();

			if (addMacchiato.equals("y")) {
				this.setMacchiato(true);
			}
		}
	}

	@Override
	void printOptions() {
		// TODO Auto-generated method stub
		System.out.printf("Item:\t%s \tPrice: $%.2f \tQty: %d \tSubtotal: $%.2f\n", getName(), getPrice(),
				getQuantity(), calculateProductSubtotal(quantity));
		System.out.printf("\tExtra Shot: %s \tMachiatto: %s\n\n", extraShot ? "Yes (Add $2 per drink)" : "No",
				macchiato ? "Yes (Add $1 per drink)" : "No");
	}

}
