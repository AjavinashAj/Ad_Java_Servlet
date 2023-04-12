package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/add")
@SuppressWarnings("serial")
public class AddProductServlet extends GenericServlet {
	
	public ProductBean pb=null;
	
	public void init() throws ServletException
	{
		pb=new ProductBean();//creating bean object
	}
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		pb.setCode(req.getParameter("code"));
		pb.setName(req.getParameter("name"));
		pb.setPrice(Double.parseDouble((req.getParameter("price"))));
		pb.setQty(Integer.parseInt(req.getParameter("qty")));
		PrintWriter pw=res.getWriter();
		res.setContentType("text/htm");
		InsertDAO ob=new InsertDAO();
		int l=ob.insert(pb);
		if(l>0)
		{
			pw.println("Product Added Successfully....");
			RequestDispatcher rd=req.getRequestDispatcher("product.html");
			rd.include(req, res);
		}
	}

}
