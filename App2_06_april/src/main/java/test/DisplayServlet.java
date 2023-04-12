package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/dis")
@SuppressWarnings("serial")
public class DisplayServlet extends GenericServlet{
	public void init()throws ServletException
	{
		System.out.println("initialization");
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
	String name=req.getParameter("name");
	String code=req.getParameter("code");
	Double price=Double.parseDouble(req.getParameter("price"));
	Integer qty=Integer.parseInt(req.getParameter("qty"));
	PrintWriter pw=res.getWriter();
	res.setContentType("html/text");
	pw.print("Product Name:"+name);
	pw.print("<br>Product Code:"+code);
	pw.print("<br>Product price:"+price);
	pw.print("<br>Product qty:"+qty);
	System.out.println("service...");
	}
	public void destroy()
	{
		System.out.println("destroy....");
		
	}
}
