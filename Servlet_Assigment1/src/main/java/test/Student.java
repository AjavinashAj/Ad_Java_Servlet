package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class Student extends GenericServlet {
	public void init() throws ServletException{
		//No code
	}
public void service(ServletRequest req,ServletResponse res) throws ServletException,
IOException{
	String name=req.getParameter("name");
	String RollNo=req.getParameter("RollNo");
	int math =Integer.parseInt(req.getParameter("math"));
	int phy =Integer.parseInt(req.getParameter("phy"));
	int chem=Integer.parseInt(req.getParameter("chem"));
	int ethics=Integer.parseInt(req.getParameter("ethics"));
	int hindi=Integer.parseInt(req.getParameter("hindi"));
	int english =Integer.parseInt(req.getParameter("english"));
	
	PrintWriter pw =res.getWriter();
	res.setContentType("text/html");
	pw.println("****************************************************");
	pw.println("<br><br>Student Details.......");
	pw.println("<br><br>*****************************************************");
	pw.println("<br><br>Name:"+name);
	pw.println("<br><br>RollNo:"+RollNo);
	pw.println("<br><br>Maths:"+math);
	pw.println("<br><br>Physics:"+phy);
	pw.println("<br><br>Chemistry:"+chem);
	pw.println("<br><br>Ethics:"+ethics);
	pw.println("<br><br>Hindi:"+hindi);
	pw.println("<br><br>English:"+english);
	int tot=(math+phy+chem+ethics+hindi+english);
	float per=(float)tot/600;
	pw.println("<br><br>Total Marks:"+tot);
	pw.println("<br><br>Percentage:"+per);
	
}
}
