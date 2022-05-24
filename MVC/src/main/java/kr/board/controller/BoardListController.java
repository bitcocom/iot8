package kr.board.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.domain.Board;
@WebServlet("/boardList.do")
public class BoardListController extends HttpServlet {	
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			                                     throws ServletException, IOException {
		// 게시판 전체 리스트를 가져오기(Model=DAO)
		List<Board> list=new ArrayList<Board>();
		Board vo1=new Board(1,"게시판 테스트","게시판 테스트","관리자","2022-05-24",0);
		Board vo2=new Board(2,"게시판 테스트","게시판 테스트","김운비","2022-05-24",0);
		Board vo3=new Board(3,"게시판 테스트","게시판 테스트","박매일","2022-05-24",0);
		list.add(vo1);
		list.add(vo2);
		list.add(vo3);
		// ?
				
		
	}
}
