package lt.bit.java2.jpa;

import lt.bit.java2.jpa.entities.Employee;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");

        EntityManager em = EntityManagerHelper.entityManager();
        Employee employee = em.find(Employee.class, 10001);
        System.out.println(employee.getFirstName() + " " + employee.getBirthDate());

        em.getTransaction().begin();
        employee.setFirstName("Geogri");
//        em.persist(employee);
        em.getTransaction().commit();
        em.close();

    }
}
