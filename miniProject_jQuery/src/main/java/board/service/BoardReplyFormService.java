package board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.control.CommandProcess;

import board.bean.BoardDTO;
import board.dao.BoardDAO;

public class BoardReplyFormService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		//답글쓰기는 데이터가 필요함(원글번호,원글 페이지)
		
		String pg = request.getParameter("pg");//원글이 있는 페이지 번호
		String seq = request.getParameter("seq");//원글 번호
		
		
		request.setAttribute("seq", seq);
		request.setAttribute("pg", pg);
		request.setAttribute("display", "/board/boardReplyForm.jsp");
		return "/index.jsp";
	}

}
