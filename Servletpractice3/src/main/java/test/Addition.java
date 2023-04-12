package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/smaller")
public class Addition extends GenericServlet {
   public void init()throws ServletException{
	   // no code
   }
   public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
	    int v1=Integer.parseInt(req.getParameter("v1"));
	    int v2=Integer.parseInt(req.getParameter("v2"));
	    int add;
	    add=v1+v2;
	    PrintWriter pw=res.getWriter();
	    res.setContentType("text/html");
	    pw.println("Addition:"+add);
	    RequestDispatcher rd=req.getRequestDispatcher("input.html");
	    rd.include(req, res);
   }
   public void destroy()
   {
	   //no code
   }
}
