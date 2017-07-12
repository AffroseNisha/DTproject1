package com.Foxy.FoxyBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.Foxy.FoxyBackend.dao.ProductDAO;
import com.Foxy.FoxyBackend.model.Product;


public class ProductTestCase {
	public static void main(String[] args)
	{
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.Foxy.FoxyBackend");
		
		
		context.refresh();
		
		// Inserting a Product Object.
		ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
		
		//Insertion TestCase
		Product product=new Product();
		product.setProname("Lakme");
		product.setCatid(3);
		product.setQuantity(1);
		product.setPrice(123);
		product.setSuppid(1234);
		product.setProdesc("Best product");
		


		
		//Retrieval TestCase
	/*	Product product1=productDAO.getProduct(2);
		System.out.println("Product name:"+product1.getProname());
		System.out.println("Product Desc"+product1.getProdesc());
		System.out.println("Product Quantity"+product1.getQuantity());*/
	
		
		
		//Deletion TestCase
		
		Product product11=productDAO.getProduct(4);
		productDAO.deleteProduct(product11);
System.out.println("The product deleted");
		
		
		//Retrieving the Data

/*List<Product> list=productDAO.getProductDetails();
for(Product product111:list)
{
	System.out.println(product111.getProid()+":"+product111.getProname()+":"+product111.getProdesc());
}*/
	
}
		
		
		
		
}
	


