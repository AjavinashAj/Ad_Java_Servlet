package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/prime")
public class Prime extends GenericServlet{
	public void init() throws ServletException{
		
		//no code
	}
	public void service(ServletRequest req ,ServletResponse res) throws ServletException,
	IOException{
		
		int n=Integer.parseInt(req.getParameter("n"));
		int count=0;
		String s;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			  count++;
		}
		  if(count==2)
		  {
			  s="yes";
		  }
		  else
		  {
			  s="no";
		  }
		  PrintWriter pw=res.getWriter();
		  res.setContentType("text/html");
		  pw.println("Prime:"+s+"<br>");
		  
		  RequestDispatcher rd=req.getRequestDispatcher("number.html");
		  rd.include(req, res);
	}
	public void destroy()
	{
		//no code
	}

}
