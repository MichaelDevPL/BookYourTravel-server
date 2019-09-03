package pk.ap.bookyourtravelserwer.travel.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "travel")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String from_City;

    @NotNull
    private String to_City;

    @NotNull
    private String  depart_date;

    @NotNull
    private String depart_time;

    @NotNull
    private String  arrival_time;

    @NotNull
    private String arrival_date;

    @NotNull
    private int first_class;

    @NotNull
    private int second_class;

    @NotNull
    private int standing_places;

    @NotNull
    private float first_class_price;

    @NotNull
    private float second_class_price;

    @NotNull
    private float standing_places_price;

    @ManyToMany(mappedBy = "travel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<Ticket> tickets = new HashSet<>();

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFrom_City(String from_City) {
        this.from_City = from_City;
    }

    public void setTo_City(String to_City) {
        this.to_City = to_City;
    }

    public void setDepart_date(String depart_date) {
        this.depart_date = depart_date;
    }

    public void setDepart_time(String depart_time) {
        this.depart_time = depart_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public void setArrival_date(String arrival_date) {
        this.arrival_date = arrival_date;
    }

    public void setFirst_class(int first_class) {
        this.first_class = first_class;
    }

    public void setSecond_class(int second_class) {
        this.second_class = second_class;
    }

    public void setStanding_places(int standing_places) {
        this.standing_places = standing_places;
    }

    public void setFirst_class_price(float first_class_price) {
        this.first_class_price = first_class_price;
    }

    public void setSecond_class_price(float second_class_price) {
        this.second_class_price = second_class_price;
    }

    public void setStanding_places_price(float standing_places_price) {
        this.standing_places_price = standing_places_price;
    }

    public Long getId() {
        return id;
    }

    public String getFrom_City() {
        return from_City;
    }

    public String getTo_City() {
        return to_City;
    }

    public String getDepart_date() {
        return depart_date;
    }

    public String getDepart_time() {
        return depart_time;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public String getArrival_date() {
        return arrival_date;
    }

    public int getFirst_class() {
        return first_class;
    }

    public int getSecond_class() {
        return second_class;
    }

    public int getStanding_places() {
        return standing_places;
    }

    public float getFirst_class_price() {
        return first_class_price;
    }

    public float getSecond_class_price() {
        return second_class_price;
    }

    public float getStanding_places_price() {
        return standing_places_price;
    }
}