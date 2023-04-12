package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/dis")
public class ServletDisplay extends GenericServlet {
	public void init()throws ServletException
	{
		//no code
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		String Name=req.getParameter("uname");
		String MailId=req.getParameter("mid");
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("=======Display=======");
		pw.println("<br>Name:"+Name);
		pw.println("<br>Mail:"+MailId);
	}
	public void destroy()
	{
		//no code
	}

}
