package web_member_mgn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web_member_mgn.dto.Member;
import web_member_mgn.service.MemberService;

@WebServlet("/loginProcess")
public class LoginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberService service = new MemberService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		id=test&pass=fdsaf

		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");

//		System.out.printf("id : %s, passwd : %s%n", id, passwd);

		Member loginMember = new Member(id, passwd);
		Member result = service.loginMember(loginMember);

//		System.out.printf("loginMember : %s %n result : %s%n", loginMember, result);
		if (result != null) {
			HttpSession session = request.getSession();
			session.setAttribute("id", result.getId());
			request.getRequestDispatcher("main.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("loginForm.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
