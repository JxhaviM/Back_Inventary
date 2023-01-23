package com.inventario.inventario.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Producto {
    @Id
    private String id;
    private String nombre;
    private String caracteristicas;
    private String marca;
    private String proveedor;
    private String categoria;
    private double precioPublico;
    private double precioSub;
    private double precioCosto;
    private int cantidad;



    public Producto(String caracteristicas,
                    String nombre,
                    String marca,
                    String proveedor,
                    String categoria,
                    double precioPublico,
                    double precioSub,
                    double precioCosto,
                    int cantidad){
        this.nombre=nombre;
        this.marca=marca;
        this.proveedor=proveedor;
        this.categoria=categoria;
        this.precioPublico=precioPublico;
        this.precioSub=precioSub;
        this.precioCosto=precioCosto;
        this.cantidad=cantidad;
        this.caracteristicas=caracteristicas;

    }
}


