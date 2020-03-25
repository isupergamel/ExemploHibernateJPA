package pacote;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("joao", 30);
		Pessoa p2 = new Pessoa("maria", 31);
		System.out.println("ok");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("exemplo");
		EntityManager manager = factory.createEntityManager();
		
		
		manager.getTransaction().begin();
		manager.persist(p1);
		manager.persist(p2);
		manager.getTransaction().commit();
		
		manager.close();

	}

}
