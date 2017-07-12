package com.Foxy.FoxyBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Foxy.FoxyBackend.dao.CategoryDAO;
import com.Foxy.FoxyBackend.dao.UserDAO;
import com.Foxy.FoxyBackend.model.Category;

import com.Foxy.FoxyBackend.model.UserRegister;

public class UserTestCase {
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.Foxy.FoxyBackend");
		
		context.refresh();
		
		UserDAO userDAO=(UserDAO)context.getBean("userDAO");

	UserRegister user=new UserRegister();
	user.setUsername("Afra");

	user.setAddress("chennai");
	user.setCustname("Affrose");
	user.setEmail("abi123@gmail.com");

	user.setMobile("9781234567");
	user.setPassword("12345");
	
	userDAO.insertUpdateUserRegister(user);
		
System.out.println("user inserted");
	}
}

//Retrival test case
/*UserRegister user1=userDAO.getUser("");
System.out.println("User Name:"+user1.getUsername());
System.out.println("User Description:"+user1.getRole());

//Deleting User
UserRegister user2=userDAO.getUser("");
userDAO.deleteUser(user2);
System.out.println("The User Deleted");

//Retrival data

List<UserRegister> list=userDAO.getUserDetails();
for(UserRegister user3:list)
{
	System.out.println(user3.getUsername()+":"+user3.getPassword()+":"+user3.getRole());
}

//Updating
UserRegister user4=userDAO.getUser("");
user4.setRole("");
userDAO.insertUpdateUser(user4);
System.out.println("the user updated");




		
	
	
}
}*/
