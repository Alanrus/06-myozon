package ru.itpark;

public class Lego {
    private long id;
    private String name;
    private String imageUrl;
    private String type;
    private int price;
    private int discount;
    private int numberStars;
    private boolean bestseller;
    private boolean available;

    public Lego(long id, String name, String imageUrl, String type, int price, int discaunt, int numberStars, boolean bestseller, boolean available) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.type = type;
        this.price = price;
        this.discount = discaunt;
        this.numberStars = numberStars;
        this.bestseller = bestseller;
        this.available = available;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscaunt() {
        return discount;
    }

    public int getNumberStars() {
        return numberStars;
    }

    public boolean isBestseller() {
        return bestseller;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscaunt(int discaunt) {
        this.discount = discaunt;
    }

    public void setNumberStars(byte numberStars) {
        this.numberStars = numberStars;
    }

    public void setBestseller(boolean bestseller) {
        this.bestseller = bestseller;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
