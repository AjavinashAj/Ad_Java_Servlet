package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddBook extends GenericServlet {
	public BookBean bb=null;
	
	public void init() throws ServletException{
	    
		bb=new BookBean();//creating bean object
	
	}
	
	public void service(ServletRequest req,ServletResponse res) throws ServletException,
	
	IOException{
		
		
		bb.setBcode(req.getParameter("bcode"));
		bb.setBname(req.getParameter("bname"));
		bb.setBauthour(req.getParameter("bauthor"));
		bb.setPrice(Float.parseFloat(req.getParameter("price")));
		bb.setBqty(Integer.parseInt(req.getParameter("bqty")));
		
		int k=new InsertDAO().insert(bb);
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		if(k>0) {
			pw.println("Book Added Successfully......<br>");
			RequestDispatcher rd=req.getRequestDispatcher("book.html");
			  rd.include(req, res);
		}
	}
	
	

}
