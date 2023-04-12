package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
		System.out.println("my servlet practice");
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<h5>hello India</h5>");
	}

}
