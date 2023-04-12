package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/Smaller")
public class Smaller extends GenericServlet{
	
	public void init()throws ServletException{
		
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		
		
		int n1=Integer.parseInt(req.getParameter("v1"));
		int n2=Integer.parseInt(req.getParameter("v2"));
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		if(n1<n2)
		{
			pw.println("Smaller:"+n1);
		}
		else
		{
			pw.println("Smaller:"+n2);
		}
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		  rd.include(req, res);
	}

}
