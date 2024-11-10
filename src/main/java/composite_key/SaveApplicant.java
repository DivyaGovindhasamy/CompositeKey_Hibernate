package composite_key;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveApplicant {
	public static void main(String[] args) {
		EntityManager em=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et=em.getTransaction();
		MyId myid=new MyId();
		myid.setEmail("deepa88@gmail.com");
		myid.setPhone(904432263);
		Applicant a=new Applicant(myid, "Divya","1234");
		et.begin();
		em.persist(a);
		et.commit();
		System.out.println("Done");
	}
}
