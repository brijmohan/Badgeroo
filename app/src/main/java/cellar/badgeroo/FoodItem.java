package cellar.badgeroo;

/**
 * Created by brij on 24/7/15.
 */
public class FoodItem {
    private int photoUrl;
    private String name;
    private Double price;

    public int getPhotoUrl() {
        return photoUrl;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPhotoUrl(int photoUrl) {
        this.photoUrl = photoUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
