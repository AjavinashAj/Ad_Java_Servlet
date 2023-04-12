package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/odd")
public class Odd extends GenericServlet {
	public void init() throws ServletException{
		//no code
	}
	public void service(ServletRequest req ,ServletResponse res) throws ServletException,
	IOException {
		
		int n=Integer.parseInt(req.getParameter("n"));
		String s;
		if(n%2!=0)
		{
			s="yes";
		}
		else
		{
			s="not";
		}
		PrintWriter pw=res.getWriter();
	   res.setContentType("text/html");
	   pw.println("ODD:"+s+"<br>");
	   RequestDispatcher rd=req.getRequestDispatcher("number.html");
	     rd.include(req, res);
		
	}
	public void destroy()
	{
		// no code
	}

}
