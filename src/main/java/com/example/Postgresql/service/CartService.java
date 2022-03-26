package com.example.Postgresql.service;

import com.example.Postgresql.dto.Cart;
import com.example.Postgresql.entity.CartEntity;

import java.util.List;

public interface CartService {
     void removeFromCart(int productId , int userId);
     void addToCart(Integer mid , Integer pid,Integer userId);
     void buyFromCart(int userId);
     List<CartEntity> getAllCartProducts(int userId);
}
