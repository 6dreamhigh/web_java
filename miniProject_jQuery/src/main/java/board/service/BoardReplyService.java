package board.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.control.CommandProcess;

import board.bean.BoardDTO;
import board.dao.BoardDAO;

public class BoardReplyService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		//데이터
		int pg = Integer.parseInt(request.getParameter("pg"));//원글이 있는 페이지 번호
		int pseq = Integer.parseInt(request.getParameter("seq"));//들고 온 번호가 아니라 원글 번호 취급해야 함
		String subject =request.getParameter("subject");
		String content =request.getParameter("content");
		
		
		//세션
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("memId");
		String name = (String)session.getAttribute("memName");
		String email = (String)session.getAttribute("memEmail");
		
		//Map<String, String> map = new HashMap<String, String>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("name", name);
		map.put("email", email);
		map.put("subject", subject);
		map.put("content", content);

		map.put("pseq", pseq);//원글 번호 --문자열로 바꿔줌
		
		//DB
		BoardDAO boardDAO = BoardDAO.getInstance();
		boardDAO.boardReply(map);
		//응답
		return "/board/boardReply.jsp";
	}

}
