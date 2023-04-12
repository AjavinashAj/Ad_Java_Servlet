package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddProductServlet extends GenericServlet {
	public ProductBean pb=null;
	
	public void init() throws ServletException{
		
		pb=new ProductBean();//Creating bean object
		
	}
	public void service(ServletRequest req,ServletResponse res) throws
	ServletException,IOException{
		pb.setCode(req.getParameter("code"));
		pb.setName(req.getParameter("name"));
		pb.setPrice(Float.parseFloat(req.getParameter("price")));
		pb.setQty(Integer.parseInt(req.getParameter("qty")));
		
		int k=new InsertDAO().insert(pb);
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		if(k>0) {
			
			pw.println("Product Added Successfully....<br>");
			RequestDispatcher rd=req.getRequestDispatcher("insertdb.html");
			rd.include(req, res);
		}
		
	}

}
