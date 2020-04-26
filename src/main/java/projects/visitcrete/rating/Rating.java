package projects.visitcrete.rating;

import projects.visitcrete.tourpackage.TourPackage;
import projects.visitcrete.person.Person;

import javax.persistence.*;
import java.util.List;

@Entity
public class Rating {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "tourPackageId")
    private TourPackage tourPackage;

    @ManyToOne
    @JoinColumn(name = "personId")
    private Person person;

    private int score;

    @Column(length = 300)
    private String comments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }
}
