package edu.wctc.dj.week3.model;

public class Bike {

//    private String id;
//    private String name;
//    private String description;
//    private double price;
    private String id;
    private String manufacturer;
    private String modelName;
    private String modelDescription;
    private String modelImage;
    private double price;

    public Bike(String id, String manufacturer, String modelName, String modelDescription, String modelImage, double price) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.modelDescription = modelDescription;
        this.modelImage = modelImage;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelDescription() {
        return modelDescription;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }

    public String getModelImage() {
        return modelImage;
    }

    public void setModelImage(String modelImage) {
        this.modelImage = modelImage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
