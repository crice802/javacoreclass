/**
 * 
 */
package com.perscholas.cafe2;

/**
 * @author crice
 *
 */
public class Coffee extends Product {

	private boolean sugar, milk;

	public Coffee(String name, double price, String description, boolean sugar, boolean milk) {
		super(name, price, description);
		// TODO Auto-generated constructor stub
		this.sugar = sugar;
		this.milk = milk;
	}

	Coffee() {
		super("Coffee", 1.25, "Boiled bean juice.");
		this.sugar = false;
		this.milk = false;
	}

	/**
	 * @return the sugar
	 */
	public boolean isSugar() {
		return sugar;
	}

	/**
	 * @param sugar the sugar to set
	 */
	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}

	/**
	 * @return the milk
	 */
	public boolean isMilk() {
		return milk;
	}

	/**
	 * @param milk the milk to set
	 */
	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	@Override
	double calculateProductSubtotal(int quantity) {
		// TODO Auto-generated method stub
		return quantity * price;
	}

}
