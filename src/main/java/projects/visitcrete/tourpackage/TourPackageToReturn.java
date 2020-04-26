package projects.visitcrete.tourpackage;

public class TourPackageToReturn {
    private int id;
    private String name;

    public TourPackageToReturn() {
    }

    public TourPackageToReturn(int id, String name) {
        this.id = id;
        this.name = name;
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
