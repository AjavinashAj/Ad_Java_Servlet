package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/add")
@SuppressWarnings("serial")
public class AddServlet extends GenericServlet{
	
	public void init() throws ServletException{
		System.out.println("initialization.....");
	}
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		int v1=Integer.parseInt(req.getParameter("v1"));
		int v2=Integer.parseInt(req.getParameter("v2"));
		PrintWriter pw=res.getWriter();
		res.setContentType("text/Html");
	    int add=v1+v2;
		pw.println("Add:"+add);
		
		
		RequestDispatcher rd= req.getRequestDispatcher("index.html");
		rd.include(req, res);
		
	}
	public void destroy()
	{
		System.out.println("destroy.....");
	}

}
