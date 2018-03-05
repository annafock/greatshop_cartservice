package com.cart.models;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.*;

/**
*
* @author annafock
*/
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
	
	@Test(expected = IllegalArgumentException.class) 
    public void testBuildIdFail() {
        (new CartBuilder())
            .id(-1)
            .build();
    }
	
	 @Test(expected = IllegalArgumentException.class) 
	    public void testBuildProductListNullWillFail() {
	        (new CartBuilder())
	            .productList(null)
	            .build();
	    }
	 
	 @Test
	    public void testBuildProductListEmpty() {
		 CartBuilder instance = new CartBuilder();
		 List<Product> productList = new ArrayList<>();
		 Cart result = instance.productList(productList).build();
		 
		 assertEquals("productList do not match after build.", productList, result.getProductList());
	    }
	 
	 @Test(expected = IllegalArgumentException.class) 
	    public void testBuildTotalPriceFail() {
	        (new CartBuilder())
	            .totalPrice(-0.1)
	            .build();
	    }

}
