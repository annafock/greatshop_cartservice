package com.cart.db;

import com.cart.models.*;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
*
* @author annafock
*/
public class CartRepository {
	SessionFactory sessionFactory;
	
	public List<Cart> getCart()
    {
        Session session = sessionFactory.openSession();
        
        //TODO -- Should only get one cart, THIS cart. 
        @SuppressWarnings("unchecked")
		List<Cart> cartList = session.createCriteria(Cart.class).list();
        
        session.close();
        
        return cartList;
    }

}
