package com.example.demo.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Board;

@Repository
@Mapper
public interface BoardDAO {
	public ArrayList<Board> selectAll();
	public Board selectOne(int no);
	public boolean insert(Board board);
	public boolean delete(int no);
	public boolean update(Board board);
}
