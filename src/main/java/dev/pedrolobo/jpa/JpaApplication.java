package dev.pedrolobo.jpa;

import dev.pedrolobo.jpa.domain.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaApplication {

  public static void main(String[] args) {

    Employee employee = new Employee();
    employee.setfName("Pedro");
    employee.setlName("Lobo");
    
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    entityManager.getTransaction().begin();
    entityManager.persist(employee);
    entityManager.getTransaction().commit();

    entityManager.close();
    entityManagerFactory.close();

  }

}
