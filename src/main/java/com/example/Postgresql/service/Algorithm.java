package com.example.Postgresql.service;

import java.util.List;
import java.util.PriorityQueue;

public class Algorithm {


    // (1) merchant total products - 1
    // (2) products sold by a merchant- 2
    // (3) current stock by a  merchant-1
    // (4) merchant rating - 3
    // (5) product price -4
    // (6) product Rating-4

    public static void sortingBasedOnWeightedAverage(List<Integer> merchants,int productId){
        PriorityQueue<Merchant>pq=new PriorityQueue<>();

    }
}
 class Merchant{
    int merchantId;
    int merchantTotalProducts;
    int productSold;
    int currentStock;
    int merchantRating;
    int productPrice;
    int productRating;

    public Merchant(int merchantId, int merchantTotalProducts, int productSold, int currentStock, int merchantRating, int productPrice, int productRating) {
        this.merchantId = merchantId;
        this.merchantTotalProducts = merchantTotalProducts;
        this.productSold = productSold;
        this.currentStock = currentStock;
        this.merchantRating = merchantRating;
        this.productPrice = productPrice;
        this.productRating = productRating;
    }
}
