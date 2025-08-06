package TimeStampAnnotation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveOrders {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Orders o = new Orders(0,"shashank",98274543,"banglore",null,null);
		
		
		et.begin();
		em.persist(o);
		et.commit();
	}
}
