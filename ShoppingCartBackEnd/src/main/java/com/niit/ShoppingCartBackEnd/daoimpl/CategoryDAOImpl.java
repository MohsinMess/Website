package com.niit.ShoppingCartBackEnd.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.ShoppingCartBackEnd.dao.CategoryDAO;
import com.niit.ShoppingCartBackEnd.dto.Category;

//name of the repository should be same as the object in PageController FrontEnd

@Repository("categoryDAO") 
public class CategoryDAOImpl implements CategoryDAO 

{
	
	private static List<Category> categories  = new ArrayList<>();
	
	static
	{
		Category category=new Category();
		
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is Television");
		category.setImageURL("Cat.png");
		
		categories.add(category);
	}

	@Override
	public List<Category> list() 
	{
		
		return categories;
	}

	@Override
	public Category get(int id) 
	{
		for(Category category:categories)
		{
			if(category.getId()==id)
				return category;
		}
		return null;
	}

}
