package projects.visitcrete.person;

import projects.visitcrete.rating.Rating;
import projects.visitcrete.tourpackage.TourPackage;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Person {

    @Id
    @GeneratedValue()
    private int id;

    @Column(length=30)
    private String name;

    @Column(length = 30)
    private String surName;

    @Column(length = 30)
    private String email;

    @OneToMany(mappedBy = "person")
    private List<Rating> ratings = new ArrayList<>();

    @ManyToMany(mappedBy = "personList")
    private List<TourPackage> tourPackageList = new ArrayList<>();

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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


