package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/greater")
@SuppressWarnings("serial")
public class GreaterServlet extends GenericServlet{
	public void init() throws ServletException{
		System.out.println("Initialization....");
	}
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		int v1=Integer.parseInt(req.getParameter("v1"));
		int v2=Integer.parseInt(req.getParameter("v2"));
		int v3=0;
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		System.out.println("greater");
		if(v1>v2) v3=v1;
		else v3=v2;
		pw.println("greater:"+v3+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		rd.include(req, res);
		
	}
	public void destroy()
	{
		System.out.println("destroy....");
	}

}
