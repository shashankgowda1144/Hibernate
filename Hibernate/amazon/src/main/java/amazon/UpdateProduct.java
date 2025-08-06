package amazon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateProduct {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Product p = new Product();
		p.setId(8);
		p.setName("Pen");
		p.setBrand("writo meter");
		p.setDescription("non-stop write");
		p.setPrice(20);
		
		et.begin();
		
		em.merge(p);
		
		et.commit();
		
	}
	
}
