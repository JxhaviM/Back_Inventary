package com.inventario.inventario.repository;

import com.inventario.inventario.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Producto,String> {

}
