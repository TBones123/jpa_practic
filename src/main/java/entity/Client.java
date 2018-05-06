package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity


public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private int id;
    private String firstName;
    private String lastName;
    private String education;
    private String pasporpt;
    private String city;
    private String age;
    @OneToMany(fetch = FetchType.LAZY,
    cascade = CascadeType.ALL,
    mappedBy = "client")
    private List<Departament> departaments = new ArrayList<Departament>();
    @OneToMany(fetch = FetchType.LAZY,
    cascade = CascadeType.ALL,
    mappedBy = "client")
    private List<Application> applications = new ArrayList<Application>();

    public Client() {
    }

    public Client(String firstName, String lastName, String education, String pasporpt, String city, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.education = education;
        this.pasporpt = pasporpt;
        this.city = city;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPasporpt() {
        return pasporpt;
    }

    public void setPasporpt(String pasporpt) {
        this.pasporpt = pasporpt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<Departament> getDepartaments() {
        return departaments;
    }

    public void setDepartaments(List<Departament> departaments) {
        this.departaments = departaments;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", education='" + education + '\'' +
                ", pasporpt='" + pasporpt + '\'' +
                ", city='" + city + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
