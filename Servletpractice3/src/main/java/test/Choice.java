package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/choice")
public class Choice extends GenericServlet{
	public void init() throws ServletException{
		//no code
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		String s1=req.getParameter("s1");
		if(s1.equals("greatervalue"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("greater");
			  rd.forward(req, res);
		}
		else if(s1.equals("smallervalue"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("smaller");
			rd.forward(req, res);
		}
		else if(s1.equals("add"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("add");
			rd.forward(req, res);
		}
		else if(s1.equals("sub"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("sub");
			rd.forward(req, res);
		}
	}
	public void destroy()
	{
		//
	}

}
