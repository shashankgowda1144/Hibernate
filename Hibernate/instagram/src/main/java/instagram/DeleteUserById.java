package instagram;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteUserById {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		User u =em.find(User.class, 7);  //Persistece State
		
		et.begin();
		em.persist(u);  //Removed State
		et.commit();
		
		
		
		
		
		
	}
}
