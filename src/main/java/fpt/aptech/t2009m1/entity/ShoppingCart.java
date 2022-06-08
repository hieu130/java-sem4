package fpt.aptech.t2009m1.entity;

import java.util.HashMap;

public class ShoppingCart {
    private double totalPrice;
    private String shipName;
    private String shipPhone;
    private String shipAddress;
    private String shipNote;
    private HashMap<Integer, CartItem> items;

    public ShoppingCart() {
    }

    public ShoppingCart(double totalPrice, String shipName, String shipPhone, String shipAddress, String shipNote, HashMap<Integer, CartItem> items) {
        this.totalPrice = totalPrice;
        this.shipName = shipName;
        this.shipPhone = shipPhone;
        this.shipAddress = shipAddress;
        this.shipNote = shipNote;
        this.items = items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipPhone() {
        return shipPhone;
    }

    public void setShipPhone(String shipPhone) {
        this.shipPhone = shipPhone;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipNote() {
        return shipNote;
    }

    public void setShipNote(String shipNote) {
        this.shipNote = shipNote;
    }

    public HashMap<Integer, CartItem> getItems() {
        return items;
    }

    public void setItems(HashMap<Integer, CartItem> items) {
        this.items = items;
    }

    public void remove(Integer productId) {
    }
}
