package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardDAO;
import com.example.demo.dto.Board;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO dao;
	
	@Override
	public ArrayList<Board> searchAll() {
		return dao.selectAll();
	}

	@Override
	public Board search(int no) {
		return dao.selectOne(no);
	}

	@Override
	public void insert(Board board) {
		dao.insert(board);
	}

	@Override
	public void delete(int no) {
		dao.delete(no);
	}

	@Override
	public void update(Board board) {
		dao.update(board);
	}

}
