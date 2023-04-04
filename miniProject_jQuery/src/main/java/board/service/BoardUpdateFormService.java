package board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.control.CommandProcess;

public class BoardUpdateFormService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		//데이터 받아주기
		String pg =request.getParameter("pg"); 
		String seq =request.getParameter("seq");
		
		//응답
		request.setAttribute("seq", seq);
		request.setAttribute("pg", pg);
		request.setAttribute("display", "/board/boardUpdateForm.jsp");
		return "/index.jsp";
	}

}
