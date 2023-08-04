package com.gino.pc3.model;

public class Platillo extends Shows{
    private String descripcion;

    public Platillo(String name, String imgUrl, int precio, String descripcion) {
        super(name, imgUrl, precio);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
