package com.cart;

import java.util.ArrayList;
import java.util.List;

/**
 * Builder class for the {@link Cart} class.
 * 
 * @author annafock
 */

public class CartBuilder {
	
	private int id;
	private List<Product> productList = new ArrayList<>(); 
	private double totalPrice;
	
	public CartBuilder() {
		
	}
	
	/** 
     * Builder for {@link Cart}
     * 
     * @return a {@link Cart} instance.
     */
	
	public Cart build() {
		if (id < 0)
			throw new IllegalStateException("Cart builder not in buildable state.");
		
		return new Cart(
				this.id, 
				this.productList, 
				this.totalPrice);
	}
	
	
	

}
