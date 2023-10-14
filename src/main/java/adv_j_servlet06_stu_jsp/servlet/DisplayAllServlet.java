//package adv_j_servlet06_stu_jsp.servlet;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import adv_j_servlet06_stu_jsp.dao.StudentDao;
//import adv_j_servlet06_stu_jsp.dto.StudentDto;
//@WebServlet("/displayall")
//public class DisplayAllServlet extends HttpServlet{
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		StudentDao d= new StudentDao();
//		List<StudentDto> list=d.getStudentList();
//		for(StudentDto st:list)
//		{
//			if(st!=null)
//			{
//				req.setAttribute("listofw",list );
////				req.setAttribute("msg", "here u have all the data present in DB");
////				RequestDispatcher r=req.getRequestDispatcher("displayall.jsp");
////				r.forward(req, resp);
//				req.setAttribute("msg", "You Have LOOGED_IN Sucessfully...");
//		    	  RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
//		    		dispatcher.forward(req, resp);
//		    	  
//			
////				PrintWriter p=resp.getWriter();
////				p.println("ADDRESS: "+st.getAddress());
////				p.println("EMAIL_ID: "+st.getEmail());
////				p.println("NAME: "+st.getName());
////				p.println("PHONE_NO: "+st.getPhno());
////				p.println("FEE: "+st.getFee());
////				p.println("ID: "+st.getId());
////				p.println("---------------");
////				
//			}
//		}
//		
//	}
//
//}
