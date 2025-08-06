package amazon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveProduct {

	public static void main(String[] args) {
		
		Product p = new Product(0, "Balls", "WIKI", 500, "Good Ball...");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();   //begin the Transaction
		
		em.persist(p);   //save the entity object to DB table
		
		et.commit();  //commit the Transaction
	}
	
}
