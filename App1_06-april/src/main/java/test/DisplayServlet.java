package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class DisplayServlet extends GenericServlet{
	public void init()throws ServletException{
		//no code
	}
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		String name=req.getParameter("name");
		String mail=req.getParameter("mail");
		PrintWriter pw=res.getWriter();
		res.setContentType("html/text");
		pw.print("name:"+name);
		pw.print("<br>MailId:"+mail);
		
	}
	public void destroy()
	{
		//no code
	}
}
