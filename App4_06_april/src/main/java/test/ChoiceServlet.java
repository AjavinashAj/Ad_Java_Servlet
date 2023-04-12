package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/choice")
@SuppressWarnings("serial")
public class ChoiceServlet extends GenericServlet{
	public void init() throws ServletException{
		System.out.println("initialization....");
	}
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
		String s=req.getParameter("s1");
		if(s.equals("GreaterValue"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("greater");
			rd.forward(req, res);
		}
		else if(s.equals("SmallerValue"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("smaller");
			rd.forward(req, res);
		}
		else if(s.equals("Add"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("add");
			rd.forward(req, res);
		}
	}
	public void destroy()
	{
		System.out.println("destroy....");
	}

}
