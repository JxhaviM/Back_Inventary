package com.inventario.inventario.service;

import com.inventario.inventario.model.Producto;

import java.util.List;

public interface ProductService {
    public Producto  saveProducto(Producto producto);
    public List<Producto> getAllProducto();
    public Producto updateProducto(String id,Producto producto);
    public void deleteProducto(String id);


}
