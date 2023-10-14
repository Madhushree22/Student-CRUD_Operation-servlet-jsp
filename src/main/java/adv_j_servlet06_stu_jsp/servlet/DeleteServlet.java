package adv_j_servlet06_stu_jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import adv_j_servlet06_stu_jsp.dao.StudentDao;
import adv_j_servlet06_stu_jsp.dto.StudentDto;
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		StudentDao d=new StudentDao();
		d.deleteStudent(id);
		List<StudentDto> s1=d.getStudentList();
		req.setAttribute("listofw", s1);
		req.setAttribute("delete", "THE RECORD IS DELETED SUCCESSFULLY....");
		RequestDispatcher dis=req.getRequestDispatcher("displayall.jsp");
		dis.forward(req, resp);
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
}
































//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		int id=Integer.parseInt(req.getParameter("id"));
//		
//		StudentDao s= new StudentDao();
//		StudentDto d=s.deleteStudent(id);
//		if(d!=null)
//		{
//			RequestDispatcher w=req.getRequestDispatcher("delete.jsp");
//			w.include(req, resp);
//			PrintWriter p=resp.getWriter();
//			p.print("The Record Is  Deleted...");
//			
//		}
//		else
//		{
//			RequestDispatcher w=req.getRequestDispatcher("delete.jsp");
//			w.include(req, resp);
//			PrintWriter p=resp.getWriter();
//			p.print("The Record Is Not Deleted As There Is No Id Present In DB...");
//			
//		}
//	}
//
//}
