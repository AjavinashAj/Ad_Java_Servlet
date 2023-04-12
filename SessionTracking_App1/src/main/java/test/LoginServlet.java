package test;
import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws
	ServletException,IOException{
		AdminBean ab=new LoginDAO().login(req);
		PrintWriter pw =res.getWriter();
		res.setContentType("text/html");
		if(ab==null) {
			
			pw.println("Invalid Login process......<br>");
			RequestDispatcher rd= req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}
		else
		{
			Cookie ck=new Cookie("fname",ab.getFname());//Creating cookie
			res.addCookie(ck);//Adding cooking to response
			pw.println("Welcome Admin"+ab.getFname()+"<br>");
			RequestDispatcher rd=req.getRequestDispatcher("link.html");
			rd.include(req, res);
		}
	}

}
