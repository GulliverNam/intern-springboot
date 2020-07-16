package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class MainController {
	
	@GetMapping("/")
	public RedirectView home() {
		return new RedirectView("/views/index.html");
	}
	
	@GetMapping("/board")
	public RedirectView board() {
		return new RedirectView("/views/board/board.jsp");
	}
	
}
