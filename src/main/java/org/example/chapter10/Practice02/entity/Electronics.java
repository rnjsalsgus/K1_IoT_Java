package org.example.chapter10.Practice02.entity;

public class Electronics extends Item{
    private String brand; // 브랜드
    private int warranty; // 보증기간

    public Electronics(String id, String name, int price, int quantity, String brand, int warranty){
        super(id, name, price, quantity);
        this.brand = brand;
        this.warranty = warranty;
    }

    public String getBrand() { return brand; }
    public int getWarranty() { return warranty; }
    @Override
    public String getCategory() {
        return "Electronics";
    }

    @Override
    public String toString() {
        return super.toString() + "// Brand: " + brand + ", Warranty: " + warranty;
    }
}
