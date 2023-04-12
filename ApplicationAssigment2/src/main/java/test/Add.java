package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/Add")
public class Add extends GenericServlet{
	
	public void init()throws ServletException{
		
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		
		
		int n1=Integer.parseInt(req.getParameter("v1"));
		int n2=Integer.parseInt(req.getParameter("v2"));
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int add=n1+n2;
		pw.println("Add:"+add);
		
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		  rd.include(req, res);
	}

}
