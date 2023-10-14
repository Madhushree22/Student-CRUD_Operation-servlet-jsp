package adv_j_servlet06_stu_jsp.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import adv_j_servlet06_stu_jsp.dao.StudentDao;
import adv_j_servlet06_stu_jsp.dto.StudentDto;

public class StudSignup extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	long phone=Long.parseLong(req.getParameter("phno"));
	String address=req.getParameter("address");
	
	
	
	ServletContext c=getServletContext();
	
	String fee=c.getInitParameter("fee");
	double fee1=Double.parseDouble(fee);
	
	StudentDto d=new StudentDto();
	d.setId(id);
	d.setFee(fee1);
	d.setName(name);
	d.setEmail(email);
	d.setAddress(address);
	d.setPhno(phone);
	d.setPswd(password);
	
	
	StudentDao a= new StudentDao();
	boolean cond=false;
	List<StudentDto> t=a.getStudentList();
	
	for(StudentDto st:t)
	{
		if(st.getEmail().equals(email))
		{
			cond=true;
			break;
		}
	}
	if(cond==true)
	{
		req.setAttribute("msg", "EMAIL_ID IS ALREADY PRESENT IN THE DB TRY WITH ANOTHER EMAIL_ID ...");
		RequestDispatcher r=req.getRequestDispatcher("signup.jsp");
		r.include(req, resp);
//		PrintWriter p=resp.getWriter();
//		p.print("EMAIL_ID IS ALREADY PRESENT IN THE DB TRY WITH ANOTHER EMAIL_ID ...");
	}
	
	else
	{
		a.saveStudent(d);
		
		req.setAttribute("msg", "SIGNED_IN SUCCESSFULLY........");
		RequestDispatcher r=req.getRequestDispatcher("login.jsp");
		r.forward(req, resp);
		
	}
	
}
}
