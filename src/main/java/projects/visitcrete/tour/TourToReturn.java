package projects.visitcrete.tour;

public class TourToReturn {
    private  String title;
    private String Description;
    private int price;
    private int duration;
    private Region region;

    public TourToReturn() {
    }

    public TourToReturn(String title, String description, int price, int duration, Region region) {
        this.title = title;
        Description = description;
        this.price = price;
        this.duration = duration;
        this.region = region;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
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

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
