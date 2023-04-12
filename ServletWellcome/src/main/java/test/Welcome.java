package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class Welcome extends HttpServlet {
 public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	 System.out.println("My Welcome Page");
	 res.setContentType("text/html");
	 PrintWriter pw=res.getWriter();
	 pw.println("<h5>Hello My Mother <h5>");
 }

}
