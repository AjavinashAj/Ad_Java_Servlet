package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class DisplayServlet extends GenericServlet{
	
	public void init() throws ServletException{
		//no code
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		String name=req.getParameter("uname");
		String Mail=req.getParameter("mid");
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("UserName:"+name+"<br>");
		pw.println("Mail:"+Mail);
	}
	public void destroy()
	{
		//no code
	}

}
