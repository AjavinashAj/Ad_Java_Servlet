package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class ServletProduct extends GenericServlet {
	
	public void init() throws ServletException{
		
		//no code
	}
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
		
		String name=req.getParameter("name");
		String code=req.getParameter("code");
		float price=Float.parseFloat(req.getParameter("price"));
		int qty=Integer.parseInt(req.getParameter("qty"));
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("ProductName:"+name+"<br>");
		pw.println("ProductCode:"+code+"<br>");
		pw.println("ProductPrice:"+price+"<br>");
		pw.println("ProductQty:"+qty+"<br>");
		
	}
	public void destroy()
	{
		
	}

}
