package instagram;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUser {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		User u = new User(0,"guru","guru@gmail.com",938777422,"442");
		
		et.begin();		
		em.persist(u);  //Persistence State
		et.commit();
	}//Detached state
}
