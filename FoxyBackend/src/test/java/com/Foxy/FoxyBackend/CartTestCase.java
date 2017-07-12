package com.Foxy.FoxyBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Foxy.FoxyBackend.dao.CartDAO;
import com.Foxy.FoxyBackend.model.Cart;

public class CartTestCase 
{
	public static void main(String[] args)
	
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.Foxy.FoxyBackend");
		context.refresh();
		CartDAO cartDAO=(CartDAO)context.getBean("cartDAO");
		Cart cart=new Cart();
		cart.setCartid(1001);
		cart.setProid(2);
		cart.setProname("Lakmi");
		cart.setPrice(123);
		cart.setQuantity(5);
		cart.setStatus("N");
		cart.setUsername("Haji");
		cartDAO.addToCart(cart);
System.out.println("Added to cart");
List<Cart> list=cartDAO.getCartItems("Haji");

for(Cart cart1:list)
{
	System.out.println(cart1.getCartid()+";;;");
	System.out.println(cart1.getProid()+";;;");
	System.out.println(cart1.getProname()+";;;");
	System.out.println(cart1.getPrice()+";;;");
System.out.println(cart1.getQuantity()+";;;");
	{
		
	}
}
	
	}

}
