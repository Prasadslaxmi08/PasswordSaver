package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/passForm")
public class Password extends HttpServlet
{
      protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
      {
    	  PrintWriter out = resp.getWriter();
    	  
    	  String semester = req.getParameter("name");
    	  String email = req.getParameter("email");
    	  String password = req.getParameter("pass");
    	  
    	  try 
    	  {
    		  Class.forName("com.mysql.cj.jdbc.Driver");
    		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laxmi","root","1234");
    		  
    		  PreparedStatement ps = con.prepareStatement("insert into pass values(?,?,?)");
    		  ps.setString(1, semester);
    		  ps.setString(2, email);
    		  ps.setString(3, password);
    		  
    		  int count = ps.executeUpdate();
    		  if(count>0)
    		  {
    			 resp.setContentType("text/html");
    			 out.print("<h3 style='color:green'> Registered successfully </h3>");
    			 
    			 RequestDispatcher rd = req.getRequestDispatcher("/Reg.jsp"); 
    			 rd.include(req, resp);
    		  }
    		  else
    		  {
    			  resp.setContentType("text/html");
     			  out.print("<h3 style='color:red'> Error </h3>");
     			 
     			  RequestDispatcher rd = req.getRequestDispatcher("/Reg.jsp"); 
     			  rd.include(req, resp);
    		  }
    	  }
    	  catch(Exception e)
    	  {
    		  e.printStackTrace();
    		  
    		  resp.setContentType("text/html");
 			  out.print("<h3 style='color:red'> Exception Occured : "+e.getMessage()+ "</h3>");
 			 
 			  RequestDispatcher rd = req.getRequestDispatcher("/Reg.jsp"); 
 			  rd.include(req, resp);
    	  }
      }
      
}
