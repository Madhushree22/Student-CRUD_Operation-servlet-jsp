package adv_j_servlet06_stu_jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import adv_j_servlet06_stu_jsp.dao.StudentDao;
import adv_j_servlet06_stu_jsp.dto.StudentDto;
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		//creation of object
		StudentDao d=new StudentDao();
		StudentDto r= new StudentDto();
		boolean cond=false;
		
		List<StudentDto> list=d.getStudentList();
		for(StudentDto st:list)
		{
		   if(st.getEmail().equals(email))
		{
				cond=true;
				break;
			}
		}
		
		       if(cond==true)
		      {
			          r=d.loginStudent(email);
			      if(r.getPswd().equals(password))
			      {
			    	  Cookie cookie=new Cookie("name",r.getName());
			    	  resp.addCookie(cookie);
			    	  
//			    	  HttpSession session=req.getSession();
//			    	  session.setAttribute("name", r.getName());
			    	  
			    	 req.setAttribute("listofw",list );
			    	  req.setAttribute("msgg", "You Have LOGED_IN SUCCESSFULLY....");
			    	  RequestDispatcher dispatcher=req.getRequestDispatcher("displayall.jsp");
			    		dispatcher.forward(req, resp);
			    	  
			    		
			    	 
			    	  
	                 }
			      else
			        {
			    	  req.setAttribute("psd", "THE PASSWORD IS INCORRECT....");
			    	  RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			    		dispatcher.include(req, resp);
//			    		PrintWriter p=resp.getWriter();
//			    		p.print("THE PASSWORD IS INCORRECT..");
			        }
		        }
		    else
		       {
			       
		    	req.setAttribute("emi", "THE EMAIL_ID IS NOT REGISTED....");
		    	 RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
		    		dispatcher.include(req, resp);
//		    		PrintWriter p=resp.getWriter();
//		    		p.print("THE EMAIL_ID IS NOT PRESENT IN DB..");
		        }
		}
	}
