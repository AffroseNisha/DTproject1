package com.Foxy.FoxyBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.Foxy.FoxyBackend.dao.SupplierDAO;

import com.Foxy.FoxyBackend.model.Supplier;

public class SupplierTestCase
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.Foxy.FoxyBackend");
		context.refresh();
		//Inserting supplier obj
		SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplierDAO");

	Supplier supplier=new Supplier(); 		
supplier.setAddress("Chennai");
supplier.setSuppName("FathimaNisha");
		//supplier.setSuppId(13);
supplierDAO.insertUpdateSupplier(supplier);
		System.out.println("Supplier inserted");
	}

}
