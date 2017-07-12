package com.Foxy.FoxyFrontend.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Foxy.FoxyBackend.dao.SupplierDAO;
import com.Foxy.FoxyBackend.model.Category;
import com.Foxy.FoxyBackend.model.Product;
import com.Foxy.FoxyBackend.model.Supplier;

@Controller
public class SupplierController {
@Autowired
SupplierDAO supplierDAO;

@RequestMapping("/Supplier")
public String showSupplier(Model m)
{
	Supplier supplier=new Supplier();
	m.addAttribute("suplist",this.getSupList());
	m.addAttribute("supplier",supplier);
	
	List<Supplier> suplist=supplierDAO.getSupplierDetails();
	m.addAttribute("suplist",suplist);
	
	return "Supplier";
	
}

@RequestMapping(value="/InsertSupplier",method=RequestMethod.POST)
public String insertProduct(@ModelAttribute("supplier") Supplier supplier,Model m)
{
	System.out.println("---Supplier Inserted---");
	supplierDAO.insertUpdateSupplier(supplier);
	
	List<Supplier> suplist=supplierDAO.getSupplierDetails();
	m.addAttribute("suplist",suplist);
	
	return "Supplier";
}

@RequestMapping(value="/updateSupplier/{SuppId}")
public String updateSupplier(@PathVariable("SuppId")int SuppId,Model m)
{
	Supplier supplier=supplierDAO.getSupplier(SuppId);
m.addAttribute("supplier",supplier);
m.addAttribute("suplist",this.getSupList());
List<Supplier>suplist=supplierDAO.getSupplierDetails();
m.addAttribute("suplist",suplist);
	
	return "redirect:/Supplier";
}

@RequestMapping(value="/deleteSupplier/{SuppId}")
public String deleteProduct(@PathVariable("SuppId")int SuppId,Model m)
{
	Supplier supplier=supplierDAO.getSupplier(SuppId);

	supplierDAO.deleteSupplier(supplier);
	
	Supplier supplier1=new Supplier();
	m.addAttribute("supplier",supplier1);
	m.addAttribute("suplist",this.getSupList());
	List<Supplier>suplist=supplierDAO.getSupplierDetails();
	m.addAttribute("suplist",suplist);
	return "Supplier";
	
	
}

public LinkedHashMap<Integer,String> getSupList()
{
	List<Supplier> list=supplierDAO.getSupplierDetails();
	
	LinkedHashMap<Integer,String> suplist=new LinkedHashMap<Integer,String>();
	
	for(Supplier sup:list)
	{
		suplist.put(sup.getSuppId(),sup.getSuppName());
	}
	
	return suplist;
}
}


