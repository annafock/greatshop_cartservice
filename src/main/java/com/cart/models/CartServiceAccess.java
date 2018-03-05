
package com.cart.models;

/**
 *
 * @author annafock
 */
public class CartServiceAccess {

	private Cart cart;

	public CartServiceAccess() {
		this.loadCart();
	}

	/*
	 * Creates cart using CartBuilder
	 */
	
	private void loadCart() {
		CartBuilder cartBuilder = new CartBuilder();
		cart = cartBuilder.build();	
	}
     
            

}
