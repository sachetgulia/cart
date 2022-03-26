package com.example.Postgresql.Restcontroller;

import com.example.Postgresql.entity.CartEntity;
import com.example.Postgresql.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping
public class MyController {

    @Autowired
    CartService cartService;
//
//    @Autowired
//    MerchantInterface merchantServices;

//    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping(path="/cart")
    public List<CartEntity> getCartProduct(@RequestParam @Valid Integer userId){
        return cartService.getAllCartProducts(userId);
    }


    @PostMapping(path = "/add" , produces = "application/json")
    public void addToCart(@RequestParam @Valid Integer mid,@RequestParam Integer pid,@RequestParam Integer userId){
         cartService.addToCart(mid,pid,userId);
    }
//

    @PostMapping(path = "/remove" , produces = "application/json")
    public void removeFromCart(@RequestParam @Valid int productId,@RequestParam int userId){
        cartService.removeFromCart(productId,userId);
    }
//

    @PostMapping(path = "/buy" , produces = "application/json")
    public void buyFromCart(@RequestParam @Validated int userId){
        cartService.buyFromCart(userId);
    }


}
















