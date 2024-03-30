package controller;

import java.util.*;


import impl.UserImpl;
import service.UserService;
import model.UserModel;
	public class UserController {
	UserService getuser = new UserImpl ();
	
		 public  long number (final UserModel m) {
			  return getuser.number(m);
		  }
		 public  String cart (final UserModel c) {
			 return getuser.cart(c);
		 }
		 public  int pass (final UserModel n) {
			  return getuser.pass(n);
		  }
		 public  ArrayList <String>  hotel (final UserModel food ) {
			  return getuser.hotel(food);
		  }
		 public ArrayList <String>  products (final UserModel Snacks) {
			  return getuser.products(Snacks);
		  }
		 public ArrayList<String> display (final UserModel dish){
			  return getuser.display(dish);

		 }
	
		  
		 
	
	}


