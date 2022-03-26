package com.example.Postgresql.dto;

import java.io.Serializable;
import java.util.HashMap;

public class Cart implements Serializable {
    private int cartId;
    private int userId;
    private HashMap<Integer,Integer> cartList;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public HashMap<Integer, Integer> getCartList() {
        return cartList;
    }

    public void setCartList(HashMap<Integer, Integer> cartList) {
        this.cartList = cartList;
    }

    public Cart(int cartId, int userId, HashMap<Integer, Integer> cartList) {
        this.cartId = cartId;
        this.userId = userId;
        this.cartList = cartList;
    }
    public Cart(){}
}
