//package com.example.Postgresql.entity;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Entity
//@Table(name="cart")
//public class UserHistoryEntity implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "userHistoryId", nullable = false)
//    private int userHistoryId;
//    private int userId;
//    private int productId;
//    private int merchantId;
//
//    public int getMerchantId() {
//        return merchantId;
//    }
//
//    public void setMerchantId(int merchantId) {
//        this.merchantId = merchantId;
//    }
//
//    private int quantity;
//
//    public UserHistoryEntity(int userId, int productId, int merchantId, int quantity) {
//        this.userId = userId;
//        this.productId = productId;
//        this.merchantId = merchantId;
//        this.quantity = quantity;
//    }
//
//    public int getQuantity() {
//
//        return quantity;
//
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public int getUserHistoryId() {
//        return userHistoryId;
//    }
//
//    public void setUserHistoryId(int userHistoryId) {
//        this.userHistoryId = userHistoryId;
//    }
//
//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }
//
//    public int getProductId() {
//        return productId;
//    }
//
//    public void setProductId(int productId) {
//        this.productId = productId;
//    }
//
//
//}
