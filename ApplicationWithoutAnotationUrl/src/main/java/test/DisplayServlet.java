package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class DisplayServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws
	ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String name=req.getParameter("uname");
		pw.println("Welcome User"+name+"<br>");
		ServletContext sct=this.getServletContext();
		//Accessing reference of Context object
		pw.println("**********ServletContext**********");
		pw.println("<br>ServletInfo:"+sct.getServerInfo());
		int a=Integer.parseInt(sct.getInitParameter("a"));
		pw.println("<br> ContextValue:"+a);
		
		ServletConfig scf= this.getServletConfig();
		//Accessing reference of Config object
		pw.println("**************ServletConfig*******************");
		pw.println("<br>ServletName:"+scf.getServletName());
		int b=Integer.parseInt(scf.getInitParameter("b"));
		pw.println("<br>ConfigValue:"+b);
		
		
		
		
		
		
	}

}
