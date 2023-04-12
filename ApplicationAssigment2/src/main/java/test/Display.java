package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
/**
 * @author new
 *
 */
@SuppressWarnings("serial")
@WebServlet("/choice")
public class Display extends GenericServlet{

	public void init()throws ServletException{
		
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		
		String s1=req.getParameter("s1");
		if(s1.equals("Greater"))
		{
		RequestDispatcher rd=req.getRequestDispatcher("Greater");
		 rd.forward(req, res);
		}
		else if(s1.equals("Smaller"))
		{
		 RequestDispatcher rd=req.getRequestDispatcher("Smaller");
		 rd.forward(req, res);
		}
		else if(s1.equals("Add"))
		{
		 RequestDispatcher rd=req.getRequestDispatcher("Add");
		 rd.forward(req, res);
		}
	}
}
