package com.niit.ShoppingCartBackEnd.dao;

import java.util.List;

import com.niit.ShoppingCartBackEnd.dto.Category;

public interface CategoryDAO 

{ 
	
	
	List<Category> list();
	
	//Abstract method- Category is the return type here
	Category get(int id);
	

}
