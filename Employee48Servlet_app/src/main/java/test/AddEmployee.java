package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/addTo")
public class AddEmployee extends GenericServlet {
	
	public EmployeeBean eb=null;
	public InsertDAO ob=null;
	public void init() throws ServletException{
		
		eb=new EmployeeBean();
		ob=new InsertDAO();
	}
	public void service(ServletRequest req,ServletResponse res) throws ServletException,
	IOException{
		eb.setId(req.getParameter("id"));
		eb.setName(req.getParameter("name"));
		eb.setDesgn(req.getParameter("desgn"));
		eb.setBsal(Integer.parseInt(req.getParameter("bsal")));
		eb.setTotSal(eb.getTotSal()+(0.93F*eb.getBsal()+(0.63F*eb.getBsal())));
		
		int k=ob.insert(eb);
		PrintWriter pw =res.getWriter();
		res.setContentType("text/html");
		if(k>0) {
			
			pw.println("Employee Added Successfully.....<br>");
			RequestDispatcher rd=req.getRequestDispatcher("Employee48.html");
			
			rd.include(req,res);
		}
	}
	
	public void destroy()
	{
		ob=null;
		eb=null;
	}

}
