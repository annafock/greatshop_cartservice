package com.cart.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author annafock
 */

final public class Cart {

	private final int id;
	private List<Product> productList = new ArrayList<>(); //Note ArrayList is not a valid JSON type, that's why productList is both List and ArrayList
	private double totalPrice;

	public Cart(int cartId, List<Product> productList, double totalPrice) {
		this.id = cartId;
		this.productList = productList;
		this.totalPrice = totalPrice;
	}

	public int getId() {
		return id;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

}
