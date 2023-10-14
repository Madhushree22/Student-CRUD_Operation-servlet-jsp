package adv_j_servlet06_stu_jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import adv_j_servlet06_stu_jsp.dao.StudentDao;
import adv_j_servlet06_stu_jsp.dto.StudentDto;

@WebServlet("/update")
public class StudentUpdate extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		StudentDao s1=new StudentDao();
		
		StudentDto s2=s1.getStudentById(id);
//		
//		HttpSession session=req.getSession();
//		String nameofstudent=(String) session.getAttribute("name");
//		if(nameofstudent!=null)
//		{
//		  	
//			req.setAttribute("nameofstudent", nameofstudent);
//			RequestDispatcher dispatcher=req.getRequestDispatcher("edit.jsp");
//			dispatcher.forward(req, resp);
//		}
//		else
//		{
//			PrintWriter pw=resp.getWriter();
//			pw.print("cant do this");
//		}
		
		req.setAttribute("student", s2);
		req.setAttribute("update", "UPDATE DETAILS OVER HERE.....");
		RequestDispatcher dis=req.getRequestDispatcher("edit.jsp");
		dis.forward(req, resp);
	}
	
		
	}

