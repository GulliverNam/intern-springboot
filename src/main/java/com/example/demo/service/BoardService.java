package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.dto.Board;

public interface BoardService {
	
	public ArrayList<Board> searchAll();
	public Board search(int no);
	public void insert(Board board);
	public void delete(int no);
	public void update(Board board);
	
}
