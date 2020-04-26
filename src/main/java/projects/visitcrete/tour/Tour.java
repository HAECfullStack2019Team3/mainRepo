package projects.visitcrete.tour;


import projects.visitcrete.tourpackage.TourPackage;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tour {

    @Id
    @GeneratedValue
    private int id;

    @Column(length = 80)
    private String title;

    @Column(length = 200)
    private String description;

    private  int price;
    private int duration;

    @Column(length = 300)
    private  String keywords;

    private Region region;

    @ManyToMany
    @JoinTable(name = "packageTours" , joinColumns = @JoinColumn(name = "tourid") , inverseJoinColumns = @JoinColumn(name = "packageid"))
    private List<TourPackage> containdInTourPackages = new ArrayList<>();

    public List<TourPackage> getContaindInTourPackages() {
        return containdInTourPackages;
    }

    public void setContaindInTourPackages(List<TourPackage> containdInTourPackages) {
        this.containdInTourPackages = containdInTourPackages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}


