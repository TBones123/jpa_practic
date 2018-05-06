import entity.Application;
import entity.Client;
import entity.Departament;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xxx");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();

        Client client1 = new Client(
                "andrey",
                "radushev",
                "aaa",
                "sadasd",
                "lviv",
                "25");
        List<Departament> departamentList = new ArrayList<Departament>();
        departamentList.add(new Departament("privat", "3", client1));
//        departamentList.add(new Departament("otp", "5", client1));
        client1.setDepartaments(departamentList);
        List<Application> applicationList = new ArrayList<Application>();
        applicationList.add(new Application(2900, "opem","ddd", client1));
        applicationList.add(new Application(3000, "close","ddd", client1));
        client1.setApplications(applicationList);
entityManager.persist(client1);





















        entityManager.getTransaction().commit();

entityManager.close();
factory.close();
    }
}
