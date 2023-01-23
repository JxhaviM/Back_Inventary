package com.inventario.inventario.controller;

import com.inventario.inventario.model.Producto;
import com.inventario.inventario.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;


    @PostMapping("/add")
    public  String add(@RequestBody Producto producto){
        productService.saveProducto(producto);
        return "Nuevo Producto Agregado";
    }

    @GetMapping("/getAll")
    public List<Producto> getAll() {
        return productService.getAllProducto();
    }

    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable String id, @RequestBody Producto producto){
        return productService.updateProducto(id,producto);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable String id){
        productService.deleteProducto(id);
    }


}
