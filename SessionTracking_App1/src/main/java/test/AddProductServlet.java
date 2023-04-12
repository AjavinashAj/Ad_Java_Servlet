package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/add")

public class AddProductServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws 
	 ServletException,IOException{
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		Cookie c[]=req.getCookies();//getting cookies from request object
		if(c==null) {
			
			pw.println("Session Expired...perform Login process...<br>");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}
		else
		{
			String Fname=c[0].getValue();
			ProductBean pb= new ProductBean();
			pb.setCode(req.getParameter("code"));
			pb.setName(req.getParameter("name"));
			pb.setPrice(Float.parseFloat(req.getParameter("price")));
			pb.setQty(Integer.parseInt(req.getParameter("qty")));
			int k=new InsertDAO().insert(pb);
			pw.println("Page of"+Fname+"<br>");
			if(k>0)
			{
				pw.println("Product Added Successfully....<br>");
			}
		}
		
		RequestDispatcher rd=req.getRequestDispatcher("link.html");
		rd.include(req, res);
		
	}

}
