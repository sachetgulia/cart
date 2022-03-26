package com.example.Postgresql.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="cart")
public class CartEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cartId", nullable = false)
    private int cartId;
    private int userId;
    private int productId;
    private int quantity;
    private int merchantId;


    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

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

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CartEntity(int userId, int productId, int quantity) {
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public CartEntity(int merchantId, int productId, int userId, int quantity ) {
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.merchantId = merchantId;
    }

    public  CartEntity(){}



}