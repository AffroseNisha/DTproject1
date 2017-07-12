package com.Foxy.FoxyFrontend.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Foxy.FoxyBackend.dao.CartDAO;
import com.Foxy.FoxyBackend.dao.ProductDAO;
import com.Foxy.FoxyBackend.model.Cart;
import com.Foxy.FoxyBackend.model.Product;

@Controller
public class CartController
{
	@Autowired
	ProductDAO productDAO;
	@Autowired
	CartDAO cartDAO;
	
	@RequestMapping(value="/addToCart/{proid}")
	public String addToCart(@PathVariable("proid") int proid,@RequestParam("quantity") int quantity,HttpSession session,Model m)
	
	{
		Cart cart=new Cart();
		String username=(String)session.getAttribute("username");
		cart.setCartid(1001);
		cart.setProid(proid);
		cart.setQuantity(quantity);
		cart.setStatus("N");
		cart.setUsername(username);
		Product product=productDAO.getProduct(proid);
		cart.setProname(product.getProname());
		cart.setPrice(product.getPrice());
		cartDAO.addToCart(cart);
	List<Cart> list=cartDAO.getCartItems(username);
	m.addAttribute("list",list);
	return "Cart";
	}
	@RequestMapping(value="/updateCartItem/{citemid}")
	public String updateCartItem(@PathVariable("citemid")int citemid,@RequestParam("quantity")int quantity,HttpSession session,Model m)
	{
		Cart cart=cartDAO.getCartItem(citemid);
		cart.setQuantity(quantity);
		cartDAO.updateCartItem(cart);
		String username=(String)session.getAttribute("username");
		List<Cart> list=cartDAO.getCartItems(username);
		m.addAttribute("cartiems", list);
		return "Cart";
		
	}
	@RequestMapping(value="/deleteCartItem/{citemid}")
	public String deleteCartItem(@PathVariable("citemid")int citemid,HttpSession session,Model m)
	{
		Cart cart=cartDAO.getCartItem(citemid);
		
		cartDAO.deleteCartItem(cart);
		String username=(String)session.getAttribute("username");
		List<Cart> list=cartDAO.getCartItems(username);
		m.addAttribute("caeritems", list);
		return "Cart";
		
	}
	}

	
	
