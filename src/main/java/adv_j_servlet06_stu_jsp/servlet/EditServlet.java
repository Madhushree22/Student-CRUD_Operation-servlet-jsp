package adv_j_servlet06_stu_jsp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import adv_j_servlet06_stu_jsp.dao.StudentDao;
import adv_j_servlet06_stu_jsp.dto.StudentDto;


@WebServlet("/edit")
public class EditServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String address=req.getParameter("address");
		long phno=Long.parseLong(req.getParameter("phno"));
		ServletContext c=getServletContext();
		String stringfee=c.getInitParameter("fee");
		double fee=Double.parseDouble(stringfee);
		StudentDao s1=new StudentDao();
		
		StudentDto d=new StudentDto();
	     d.setAddress(address);
         d.setEmail(email);
         d.setFee(fee);
         d.setId(id);
         d.setName(name);
         d.setPhno(phno);
         d.setPswd(stringfee);
		s1.updateStudent(id,d);
		
		List<StudentDto> s=s1.getStudentList();
		
		Cookie[] cookies=req.getCookies();
		String nameofstudent=null;
		for(Cookie cookie:cookies)
		{
			nameofstudent=cookie.getValue();
		}
		
		req.setAttribute("name", nameofstudent);
		
		
		req.setAttribute("listofw", s);
		req.setAttribute("updated", "THE DETAILS ARE UPDATED SUCCESSFULLY....");
		RequestDispatcher w=req.getRequestDispatcher("displayall.jsp");
		w.forward(req, resp);
		
	}
}
