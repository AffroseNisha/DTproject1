package com.Foxy.FoxyFrontend.controller;


import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Foxy.FoxyBackend.dao.ProductDAO;
import com.Foxy.FoxyBackend.dao.UserDAO;
import com.Foxy.FoxyBackend.model.Product;
import com.Foxy.FoxyBackend.model.UserRegister;

@Controller
public class UserController 
{
	@Autowired
	ProductDAO ProductDAO;
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/login_success")
	public String loginSuccess(HttpSession session,Model m)
	{
		System.out.println("Login successful");
		String page=null;
		boolean loggedIn=true;
		//Retrieving the username
		
		String username=SecurityContextHolder.getContext().getAuthentication().getName();
		session.setAttribute("username",username);
		session.setAttribute("loggedIn",loggedIn);
		
		//Retriving Role
Collection<GrantedAuthority> authorities=(Collection<GrantedAuthority>)SecurityContextHolder.getContext().getAuthentication().getAuthorities();
for(GrantedAuthority role:authorities)
{
	System.out.println("Role:"+role.getAuthority()+"User Name:"+username);
	if(role.getAuthority().equals("Role_Admin"))
	{
		page="AdminHome";
	}
	else
	{
		List<Product> prodlist=ProductDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
		
		page="UserHome";
	}
	System.out.println("Login Successful");
	
}
return page;	
	
	}
	
	@RequestMapping(value="/xyz",method=RequestMethod.POST)
public String insertUserRegister(@ModelAttribute("userRegister") UserRegister userRegister,Model m)
{
		System.out.println("UserRegister Inserted");
	     userDAO.insertUpdateUserRegister(userRegister);		
		List<UserRegister> userlist=userDAO.getUserRegisterDetails();
		m.addAttribute("userlist",userlist);
		return "Login";
}
}
		




