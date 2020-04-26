package projects.visitcrete.tourpackage;

import projects.visitcrete.person.Person;
import projects.visitcrete.rating.Rating;
import projects.visitcrete.tour.Tour;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TourPackage {
    @Id
    private int id;

    @Column(length = 140)
    private String name;


    @OneToMany(mappedBy = "tourPackage")
    private List<Rating> ratings = new ArrayList<>();

    @ManyToMany(mappedBy = "containdInTourPackages")
    private List<Tour> toursInPackage = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "personTourPackage" , joinColumns = @JoinColumn(name = "personId") , inverseJoinColumns = @JoinColumn( name = "tourPackageId"))
    private List<Person> personList = new ArrayList<>();

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
