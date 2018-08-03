package com.niit.ShoppingCartFrontEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.ShoppingCartBackEnd.dao.CategoryDAO;
import com.niit.ShoppingCartBackEnd.dto.Category;

@Controller
public class PageController 
{
	// Autowired is used to create an instance of categoryDAOImpl automatically using Spring
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView home()
	{
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title","Home");
		// Passing list of categories from backend
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userclickhome", true);
		return mv;
		
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about()
	{
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userclickabout", true);
		return mv;
		
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userclickcontact", true);
		return mv;
		
	}

	// Method to load all the products and based on categories
	@RequestMapping(value={"/show/all/products"})
	public ModelAndView showallproducts()
	{
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title","All Products");
		// Passing list of categories from backend
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("userclickallproducts", true);
		return mv;
		
	}
	
	@RequestMapping(value={"/show/category/${id}/products"})
	public ModelAndView showcategoryproducts(@PathVariable("id") int id)
	{
		ModelAndView mv= new ModelAndView("page");
		
		// CategoryDAO to fetch a single category
		Category category= null;
		category = categoryDAO.get(id);	
		
		mv.addObject("title",category.getName());
		// Passing list of categories from backend
		mv.addObject("categories",categoryDAO.list());
		
		//Passing single category object
		mv.addObject("category",category);	
		
		mv.addObject("userclickcategoryproducts", true);
		return mv;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
