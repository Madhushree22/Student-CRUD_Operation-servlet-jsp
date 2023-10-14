package adv_j_servlet06_stu_jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import javax.persistence.Query;

import adv_j_servlet06_stu_jsp.dto.StudentDto;

public class StudentDao {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("madhu");
    EntityManager em=emf.createEntityManager();
    EntityTransaction et=em.getTransaction();
    
	

	public StudentDto saveStudent(StudentDto d) {
		
		et.begin();
		em.persist(d);
		et.commit();
		return d;
	}

	public StudentDto loginStudent(String email) {
		
		Query q=em.createQuery("select a from StudentDto a where a.email=?1");
		q.setParameter(1, email);
		StudentDto s=(StudentDto) q.getSingleResult();
		return s;
		
	}
	
	public List<StudentDto> getStudentList() {
		Query q=em.createQuery("select a from StudentDto a ");
		List<StudentDto> t=q.getResultList();
		return t;
	}

	public void deleteStudent(int id) {
		et.begin();
		StudentDto p1=em.find(StudentDto.class, id);
		em.remove(p1);
		et.commit();
	}

	public StudentDto getStudentById(int id) {
	StudentDto s=em.find(StudentDto.class, id);
		return s;
	}

	public void updateStudent(int id, StudentDto d) {
		StudentDto d1=em.find(StudentDto.class, id);
		et.begin();
		em.merge(d);
		et.commit();
	}

	

		
	
	
	
	
}



















//public StudentDto updateStudent(int id, String name) {
//	StudentDto s1=em.find(StudentDto.class, id);
//	if(s1!=null)
//	{
//		et.begin();
//		s1.setName(name);
//		em.merge(s1);
//		et.commit();
//		return s1;
//	}
//	else
//	{
//	return null;
//	}
//}
//
//public StudentDto displayStudent(int id) {
//	
//    StudentDto s1=em.find(StudentDto.class, id);
//    if(s1!=null)
//    {
//    	return s1;
//    }
//    else
//    {
//    	return null;
//    }
//
//	
//}
//
//public StudentDto deleteStudent(int id) {
////	StudentDto s1=em.find(StudentDto.class, id);
////	if(s1!=null)
////	{
////		et.begin();
////		em.remove(s1);
////		et.commit();
////		return s1;
////	}
////	else
////	{
////	return null;
////	}
//	
//	StudentDto e=em.find(StudentDto.class, id);
//	et.begin();
//	em.remove(e);
//	et.commit();
//}
//
//
//
//public List<StudentDto> displayAll() {
//	Query q=em.createQuery("select a from StudentDto a");
//	List<StudentDto> t=q.getResultList();
//	return t;
//}
