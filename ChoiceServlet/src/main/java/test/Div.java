package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/div")
public class Div extends GenericServlet{
	
	public void init() throws ServletException{
		
		//no code
	}
	public void service(ServletRequest req,ServletResponse res) throws 
	ServletException,IOException{
		
		int v1=Integer.parseInt("v1");
		int v2=Integer.parseInt("v2");
		 int div=(v1/v2);
		 
		 PrintWriter pw =res.getWriter();
		 res.setContentType("text/html");
		 pw.println("Div:"+div+"<br>");
		 RequestDispatcher rd=req.getRequestDispatcher("choice.html");
		 rd.include(req, res);
		
	}
   
	public void destroy() {
		
		//no code
	}
}
