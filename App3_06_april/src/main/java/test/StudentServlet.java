package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/stu")
@SuppressWarnings("serial")
public class StudentServlet extends GenericServlet {
	public void init()throws ServletException
	{
		System.out.println("initialization....");
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		String name=req.getParameter("name");
		Integer Roll=Integer.parseInt(req.getParameter("roll"));
		Double marks=Double.parseDouble(req.getParameter("marks"));
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.print("Name:"+name);
		pw.print("<br>Roll No:"+Roll);
		pw.print("<br>Marks:"+marks);
		if(marks>80)
		{
			pw.print("<br>Grade A (Distinction)");
		}
		else if(marks>60 && marks<79)
		{
			pw.print("<br>Grade B (First)");
		}
		else if(marks>45 && marks<59)
		{
			pw.print("<br>Grade C(third)");
		}
		else
		{
			pw.print("<br>Fail");
		}
		
	}
	public void destroy()
	{
		System.out.println("destroy.....");
	}
}
