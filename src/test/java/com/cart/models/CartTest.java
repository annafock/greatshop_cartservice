package com.cart.models;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

public class CartTest {
	
	private Cart cart;

	@Test
    public void testCart()
    {
        System.out.println("Cart constructor");
        List<Product> productList = new ArrayList<>();
		productList.add(new Product(3, "Test product", "TestUrl", new Date()));
        cart = new Cart(1, productList, 00.00);
        assertTrue(Cart.class.isInstance(cart));
        assertEquals("Ids do not match.", 1, cart.getId());
        assertEquals("ProductLists do not match.", productList, cart.getProductList());
        assertEquals("TotalPrice do not match.", 00,00, cart.getTotalPrice());
        
    }

}
