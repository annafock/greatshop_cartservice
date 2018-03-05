package com.cart.models;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.*;

public class CartBuilderTest {

	@Test
	public void testBuild() {
		System.out.println("build");
		CartBuilder instance = new CartBuilder();
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(3, "Test product", "TestUrl", new Date()));
		Cart result = instance.id(1).productList(productList).totalPrice(77.5).build();
		System.out.println("result " + result);
		assertNotNull("Cart build failed.", result);
		assertEquals("Ids do not match after build.", 1, result.getId());
		assertEquals("productList do not match after build.", productList, result.getProductList());
		assertEquals("totalPrice do not match after build.", 77.5, result.getTotalPrice(), 1);
		
	}

}
