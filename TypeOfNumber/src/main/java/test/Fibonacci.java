package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/fibonacci")
public class Fibonacci extends GenericServlet{
  
	public void init() throws ServletException{
		
		//no code
	}
	public void service(ServletRequest req,ServletResponse res) throws ServletException,
	IOException{
		
		int n=Integer.parseInt(req.getParameter("n"));
		int c;
		int a=0;
		int b=1;
		for(int i=0;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("Fibonacci:"+ c +"<br>");
		}
		RequestDispatcher rd=req.getRequestDispatcher("number.html");
		rd.include(req, res);
	}
	public void destroy()
	{
		//no code
	}
}
