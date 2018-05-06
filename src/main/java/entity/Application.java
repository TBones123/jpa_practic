package entity;


import javax.persistence.*;

@Entity

public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_application")
    private int id;
    private int sum;
    private String creditState;
    private String currency;


    @ManyToOne(fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
    private Client client;

    public Application() {
    }

    public Application(int sum, String creditState, String currency) {
        this.sum = sum;
        this.creditState = creditState;
        this.currency = currency;
    }

    public Application(int sum, String creditState, String currency, Client client) {
        this.sum = sum;
        this.creditState = creditState;
        this.currency = currency;
        this.client = client;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", sum=" + sum +
                ", creditState='" + creditState + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
