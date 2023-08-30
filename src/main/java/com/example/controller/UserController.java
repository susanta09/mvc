package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.User;


@Controller
@RequestMapping("/api")
public class UserController {
	@GetMapping("/user")
	public String showData(Model model)
	{
		User u=new User(12, "susanta",25 );
		model.addAttribute("user", u);
		return "abc";
		
	}
	@GetMapping("/users")
	public String showUserRecord(Model model)
	{
		List<User>lu=Arrays.asList(
				new User(12, "susanta",25 ),
				new User(13, "rama",24 ),
				new User(14, "roma",23 )
				);
		model.addAttribute("userList", lu);
		return "list";
		
	}
	@GetMapping("/ModeAndView")
	public ModelAndView show()
	{
		ModelAndView m=new ModelAndView();
		m.addObject("data","Rama...");
		m.setViewName("xyz");
		
		return m;
		
	}

}
