package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String home() {
		return "redirect:index.html";
	}
	
	@GetMapping("/board")
	public String board() {
		return "redirect:board/board.jsp";
	}
	
}
