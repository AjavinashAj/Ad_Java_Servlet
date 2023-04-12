/*package test;
import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.util.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewEmployee  extends GenericServlet{
	public RetrieveDAO ob=null;
	
	public void init() throws ServletException{
		
		ob=new RetrieveDAO();
	}
	

	public void service(ServletRequest req,ServletResponse res) throws ServletException,
	IOException{
		
		ArrayList<EmployeeBean>al=ob.retrieve();
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		if(al.size()==0) {
			
			pw.println("Employee not available.....<br>");
			
		}
		else
		{
			Spliterator<EmployeeBean>sp=al.spliterator();
			sp.forEachRemaining(K)->
			{
				EmployeeBean eb=(EmployeeBean)k;
				pw.println(eb.getId()+"&nbsp&nbsp"+eb.getName()+"&nbsp&nbsp"+eb.getDesgn()+"&nbsp&nbsp"
						+eb.getTotSal()+"<br>");
			};
		}
		
		RequestDispatcher rd= req.getRequestDispatcher("Employee48.html");
		       rd.include(req, res);
	}
	
	public void destroy() {
		
		ob=null;
	}
}
*/