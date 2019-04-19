package model;

public class Products {

    private String name;
    private String price;
    private int imageId;
    private String details;

    public Products(String name, String price, int imageId, String details) {
        this.name = name;
        this.price = price;
        this.imageId = imageId;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
