package edu.wctc.dj.week4.model;

public class Clothing implements ProductStrategy {

    private String sku;
    private String name;
    private String brand;
    private double price;
    private String image;
    private String description;

    private String size;

    public Clothing(String sku, String name, String brand, double price, String image, String description, String size) {
        setSKU(sku);
        setName(name);
        setBrand(brand);
        setPrice(price);
        setImage(image);
        setDescription(description);
        setSize(size);
    }

    @Override
    public final String getSKU() {
        return sku;
    }

    @Override
    public final void setSKU(String sku) {
        this.sku = sku;
    }

    @Override
    public final String getName() {
        return name;
    }

    @Override
    public final void setName(String name) {
        this.name = name;
    }

    @Override
    public final String getBrand() {
        return brand;
    }

    @Override
    public final void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public final double getPrice() {
        return price;
    }

    @Override
    public final void setPrice(double price) {
        this.price = price;
    }

    @Override
    public final String getImage() {
        return image;
    }

    @Override
    public final void setImage(String image) {
        this.image = image;
    }

    @Override
    public final String getDescription() {
        return description;
    }

    @Override
    public final void setDescription(String description) {
        this.description = description;
    }

    public final String getSize() {
        return size;
    }

    public final void setSize(String color) {
        this.size = color;
    }

}
