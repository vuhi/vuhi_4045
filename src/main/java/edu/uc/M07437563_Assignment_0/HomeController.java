package edu.uc.M07437563_Assignment_0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public ModelAndView indexPage(@RequestParam(value="name", required=false) String userName) {
		if (userName == null) { 
			userName = "Anonymous User";
		}
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		model.addObject("name", userName);
		return model;
	}
}
