package com.inventario.inventario.service;

import com.inventario.inventario.model.Producto;
import com.inventario.inventario.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    public Producto saveProducto(Producto producto) {
        return productRepository.save(producto);
    }


    public List<Producto> getAllProducto() {
        return productRepository.findAll();

    }


    public Producto updateProducto(String id, Producto producto) {
        Producto productoDeMongo=productRepository
                .findById(id)
                .orElseThrow(RuntimeException::new);
        productoDeMongo.setCantidad(producto.getCantidad());
        productoDeMongo.setNombre(producto.getNombre());
        productoDeMongo.setCaracteristicas(producto.getCaracteristicas());
        productoDeMongo.setMarca(producto.getMarca());
        productoDeMongo.setProveedor(producto.getProveedor());
        productoDeMongo.setCategoria(productoDeMongo.getCategoria());
        productoDeMongo.setPrecioPublico(producto.getPrecioPublico());
        productoDeMongo.setPrecioSub(producto.getPrecioSub());
        productoDeMongo.setPrecioCosto(producto.getPrecioCosto());
        return productRepository.save(productoDeMongo);
    }

    //@Override
    public void deleteProducto(String id) {
        Producto producto=productRepository
                .findById(id)
                .orElseThrow(RuntimeException::new);
        productRepository.delete(producto);

    }

}
