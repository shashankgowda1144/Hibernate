package instagram;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SelectUserById {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		EntityManager em1 = emf.createEntityManager();
		EntityManager em2 = emf.createEntityManager();
		EntityManager em3 = emf.createEntityManager();

//		User u =em.find(User.class, 3);  //Persistece State
		
		User u1 = em1.find(User.class, 1);  //persistece state
		User u2 = em2.find(User.class, 1);  //persistece state
		User u3 = em3.find(User.class, 1);  //persistece state
	
	}
}

