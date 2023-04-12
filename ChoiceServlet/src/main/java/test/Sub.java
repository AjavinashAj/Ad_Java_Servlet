package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/sub")
public class Sub extends GenericServlet{
	public void init() throws ServletException{
		
		//no code
	}
	public void service(ServletRequest req,ServletResponse res) throws
	ServletException,IOException{
		
		int v1=Integer.parseInt(req.getParameter("v1"));
		int v2=Integer.parseInt(req.getParameter("v2"));
		int sub=v1-v2;
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("Subtration:"+sub+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("choice.html");
		rd.include(req, res);
		
	}
	public void destroy() {
		
		//no code
	}

}
