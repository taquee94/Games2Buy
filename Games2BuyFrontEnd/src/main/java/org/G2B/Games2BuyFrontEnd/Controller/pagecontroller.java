package org.G2B.Games2BuyFrontEnd.Controller;

import org.G2B.Games2BuyEnd.DAO.CategoryDAO;
import org.G2B.Games2BuyEnd.DTO.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class pagecontroller {

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");

		mv.addObject("categories", categoryDAO.list());

		mv.addObject("userClickHome", true);

		return mv;
	}

	@RequestMapping(value ="/aboutus")
	public ModelAndView aboutus() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping(value ="/contactus")
	public ModelAndView contactus() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}

	@RequestMapping(value ="/show/all/games")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Store");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickAllGames", true);
		return mv;
	}

	@RequestMapping(value ="/show/category/{id}/games") 
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");

		Category category = null;
		category = categoryDAO.get(id);

		mv.addObject("title",category.getName());
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("category", category);
		mv.addObject("userClickCategoryGames", true);
		return mv;

	}
}
