package com.cart.models;

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
		//Empty
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
	
	/**
     * Setter for {@link CartBuilder#id} 
     * @param id the unique id for the {@link Cart}
     * @return 
     */
    public CartBuilder id(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("Id can't be less than 0");
        }
        this.id = id;
        return this;
    }
    
    /**
     * Setter for {@link CartBuilder#productList} 
     * @param id the unique id for the {@link Cart}
     * @return 
     */
    public CartBuilder productList(List<Product> productList) {
    	if (productList == null) {
            throw new IllegalArgumentException("ProductList cannot be null"); 
         }
        this.productList = productList;
        return this;
    }
    
    /**
     * Setter for {@link CartBuilder#totalPrice} 
     * @param id the unique id for the {@link Cart}
     * @return 
     */
    public CartBuilder totalPrice(double totalPrice) {
    	if (totalPrice < 0) {
            throw new IllegalArgumentException("totalPrice can't be less than 0");
        }

        this.totalPrice = totalPrice;
        return this;
    }
	
	
	

}
