package app;
import java.io.*;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.annotation.*;
public class FirstServlet implements Servlet{
	//Servlet life cycle methods
	ServletConfig conf;
	public void init(ServletConfig conf)
	{
		this.conf=conf;
		System.out.println("creating object.........");
	}
	
	public void service(ServletRequest req,ServletResponse res) throws ServletException,
	IOException{
		
		System.out.println("Servicing......");
		res.setContentType("html/text");
		PrintWriter pw=res.getWriter();
		pw.print("<h1>this is my servlet page</h1>");
		pw.print("<h1> Todays date and time is"+new Date().toString()+"</h1>");
	}
	public void destroy()
	{
		System.out.println("destoy......");
		
	}
	//non -Servlet life cycle method
	
	public ServletConfig getServletConfig()
	{
		return conf;
	}
	public String getServletInfo()
	{
		return "this servlet created by Avinash";
	}

	
}
