package com.choco.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.choco.board.model.Board;

@Mapper
public interface BoardRepository {
	List<Board> getBoardList();
	Board getBoardDetail(int boardId);
	void createBoard(Board board);
	void updateBoard(Board board);
}