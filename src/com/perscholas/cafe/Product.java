/**
 * 
 */
package com.perscholas.cafe;

/**
 * @author crice
 *
 */
public class Product {

	private double price;
	private int quantity;
	private String name, description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double calculateProductTotal(double price) {
		double subTotal = price * quantity;
		return subTotal;
	}

	public Product() {

	}

	public Product(String name, String description, double price) {

	}

}
