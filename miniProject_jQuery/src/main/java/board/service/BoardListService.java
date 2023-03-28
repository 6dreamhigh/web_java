package board.service;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.control.CommandProcess;

import board.bean.BoardDTO;
import board.bean.BoardPaging;
import board.dao.BoardDAO;

public class BoardListService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		//데이터
		int pg = Integer.parseInt(request.getParameter("pg"));
		request.setAttribute("pg", pg);
		request.setAttribute("display", "board/boardList.jsp");
		return "/index.jsp";
		/*
		 * //DB- 1페이지당 5개씩 BoardDAO boardDAO = BoardDAO.getInstance();
		 * 
		 * int endNum = pg * 5; int startNum = endNum - 4;
		 * 
		 * Map<String, Integer> map = new HashMap<String, Integer>();
		 * map.put("startNum", startNum); map.put("endNum", endNum);
		 * 
		 * List<BoardDTO> list = boardDAO.boardList(map);
		 * 
		 * //페이징 처리 int totalA = boardDAO.getTotalA();//총글수
		 * 
		 * BoardPaging boardPaging = new BoardPaging(); boardPaging.setCurrentPage(pg);
		 * boardPaging.setPageBlock(3); boardPaging.setPageSize(5);
		 * boardPaging.setTotalA(totalA);
		 * 
		 * boardPaging.makePaginHTML();
		 * 
		 * //응답 request.setAttribute("pg", pg); request.setAttribute("list", list);
		 * request.setAttribute("boardPaging", boardPaging);
		 */
		
	}

}












