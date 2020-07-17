package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.dto.Board;
import com.example.demo.service.BoardService;

@RestController
public class MainController {
	
	@Autowired
	BoardService service;
	
	@GetMapping("/")
	public RedirectView home() {
		return new RedirectView("index.html");
	}
	
	@GetMapping("/board")
	public ModelAndView boardList() {
		ModelAndView mav = new ModelAndView("board");
		
		ArrayList<Board> boards = service.searchAll();
		mav.addObject("boards", boards);
		
		return mav;
	}
	
	@GetMapping("/board/new")
	public ModelAndView boardCreate() {
		ModelAndView mav = new ModelAndView("create");
		return mav;
	}
	
	@PostMapping("/board")
	public RedirectView boardRegister(@RequestBody Board board) {
		service.insert(board);
		return new RedirectView("/demo/board");
	}
	
	@GetMapping("/board/{id}")
	public ModelAndView boardDetail(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("detail");
		
		Board board = service.search(id);
		mav.addObject("board", board);
		
		return mav;
	}
	
	@DeleteMapping("/board/{id}")
	public ResponseEntity<Integer> boardDelete(@PathVariable("id") int id) {
		service.delete(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
	
	@PutMapping("/board/{id}")
	public RedirectView boardUpdate(@RequestBody Board board, @PathVariable("id") int id) {
		service.update(board);
		return new RedirectView("/demo/board");
	}

	
}
