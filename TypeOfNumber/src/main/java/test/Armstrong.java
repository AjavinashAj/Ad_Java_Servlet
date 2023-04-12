package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/armstrong")
public class Armstrong  extends GenericServlet{
	public void init() throws ServletException{
		//no code
	}
	public void service(ServletRequest req,ServletResponse res) throws ServletException,
	IOException{
		
		int n=Integer.parseInt(req.getParameter("n"));
		int t,b,a;
		String s;
		b=0;
		t=n;
		while(n>0)
		{
			a=n%10;
			b=b+a*a*a;
			n=n/10;
		}
		if(t==b)
		{
			s="yes";
		}
		else
		{
			s="no";
		}
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("Armstrong:"+s+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("number.html");
		rd.include(req, res);
	}
	public void destroy()
	{
		//no code
	}
	

}
