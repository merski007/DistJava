package edu.wctc.dj.week4.model;

public interface ProductStrategy {
    public abstract String getSKU();
    public abstract void setSKU(String sku);
    
    public abstract String getName();
    public abstract void setName(String name);
    
    public abstract String getBrand();
    public abstract void setBrand(String brand);
    
    public abstract double getPrice();
    public abstract void setPrice(double price);
    
    public abstract String getImage();
    public abstract void setImage(String image);
    
    public abstract String getDescription();
    public abstract void setDescription(String description);
}
