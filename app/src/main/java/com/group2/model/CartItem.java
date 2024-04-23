package com.group2.model;

import java.util.ArrayList;

public class CartItem {
    String productCode;
    String thumb;
    String name;
    int price;
    int comparingPrice;
    int quantity;
    private boolean isChecked;

    public CartItem(String productCode, String thumb, String name, int price, int comparingPrice, int quantity, boolean isChecked) {
        this.productCode = productCode;
        this.thumb = thumb;
        this.name = name;
        this.price = price;
        this.comparingPrice = comparingPrice;
        this.quantity = quantity;
        this.isChecked = isChecked;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public int getComparingPrice() {
        return comparingPrice;
    }

    public void setComparingPrice(int comparingPrice) {
        this.comparingPrice = comparingPrice;
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

    public void setPrice( int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity( int quantity) {
        this.quantity = quantity;
    }

}
