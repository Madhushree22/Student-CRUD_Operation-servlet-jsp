package adv_j_servlet06_stu_jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import adv_j_servlet06_stu_jsp.dao.StudentDao;
import adv_j_servlet06_stu_jsp.dto.StudentDto;
@WebServlet("/display")
public class DisplayServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		StudentDao s=new StudentDao();
//		StudentDto d1=s.displayStudent(id);
//		if(d1!=null)
//		{
//			PrintWriter p=resp.getWriter();
//			p.println("ADDRESS: "+d1.getAddress());
//			p.println("EMAIL_ID: "+d1.getEmail());
//			p.println("NAME: "+d1.getName());
//			p.println("PHONE_NO: "+d1.getPhno());
//			p.println("FEE: "+d1.getFee());
//			p.println("ID: "+d1.getId());
//		}
//		else
//		{
//			PrintWriter p=resp.getWriter();
//			p.print("ID IS NOT PRESENT IN DB..");
//		}
//	
}
//
}
