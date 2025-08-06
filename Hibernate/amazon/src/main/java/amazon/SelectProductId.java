package amazon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SelectProductId {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Product p = em.find(Product.class, 5);
		
		System.out.println(p);
	}
}
