package web_member_mgn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_member_mgn.dto.Member;
import web_member_mgn.service.MemberService;

@WebServlet("/joinProcess")
public class JoinProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberService service = new MemberService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id").trim();
		String passwd = request.getParameter("passwd").trim();
		String name = request.getParameter("name").trim();
		int age = Integer.parseInt(request.getParameter("age").trim());
		String gender = request.getParameter("gender").trim();
		String email = request.getParameter("email").trim();
		
		Member member = new Member(id, passwd, name, age, gender, email);
		
		service.joinMember(member);
		
		response.sendRedirect("loginForm.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
