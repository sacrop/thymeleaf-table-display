package com.example2.tabledisplay.controllertable;

public class tableuser {
     private int id;
     private String name;
     private int price;
     private String productimageurl;
    public tableuser(int id, String name, int price, String productimageurl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productimageurl = productimageurl;
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
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getProductimageurl() {
        return productimageurl;
    }
    public void setProductimageurl(String productimageurl) {
        this.productimageurl = productimageurl;
    }
     
      
}
