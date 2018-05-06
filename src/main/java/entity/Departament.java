package entity;

import javax.persistence.*;

@Entity


public class Departament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departament")
    private int id;
    private String departmentCity;
    private String countOfWorkers;
    @ManyToOne(fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
    private Client client;

    public Departament() {
    }

    public Departament(String departmentCity, String countOfWorkers) {
        this.departmentCity = departmentCity;
        this.countOfWorkers = countOfWorkers;
    }

    public Departament(String departmentCity, String countOfWorkers, Client client) {
        this.departmentCity = departmentCity;
        this.countOfWorkers = countOfWorkers;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentCity() {
        return departmentCity;
    }

    public void setDepartmentCity(String departmentCity) {
        this.departmentCity = departmentCity;
    }

    public String getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(String countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "id=" + id +
                ", departmentCity='" + departmentCity + '\'' +
                ", countOfWorkers='" + countOfWorkers + '\'' +
                '}';
    }
}
