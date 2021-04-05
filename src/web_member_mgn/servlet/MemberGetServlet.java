package web_member_mgn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_member_mgn.dto.Member;
import web_member_mgn.service.MemberService;

@WebServlet("/MemberGetServlet")
public class MemberGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberService service;

	public MemberGetServlet() {
		service = new MemberService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id").trim();
		Member member = service.showMember(new Member(id));
		
		request.setAttribute("member", member);
		request.getRequestDispatcher("member_info.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
