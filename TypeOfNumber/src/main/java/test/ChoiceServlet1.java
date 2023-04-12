package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/choice")
public class ChoiceServlet1 extends  GenericServlet {
	public void init() throws ServletException{
		//no code
	}
	public void service(ServletRequest req,ServletResponse res) throws
	ServletException,IOException{
		
		String s1=req.getParameter("s1");
		
		if(s1.equals("even"))
		{
			RequestDispatcher rd= req.getRequestDispatcher("even");
			rd.forward(req, res);
			
		}
		else if(s1.equals("odd"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("odd");
			rd.forward(req, res);
		}
		else if(s1.equals("prime"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("prime");
			rd.forward(req, res);
		}
		else if(s1.equals("armstrong"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("armstrong");
			rd.forward(req, res);
		}
		else if(s1.equals("fibonacci"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("fibonacci");
			rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("palindrome");
			 rd.forward(req, res);
		}
	}
	public void destroy()
	{
		//no code
	}

}
