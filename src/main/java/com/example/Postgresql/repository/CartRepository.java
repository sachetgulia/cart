package com.example.Postgresql.repository;

import com.example.Postgresql.entity.CartEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<CartEntity,Integer> {

}
