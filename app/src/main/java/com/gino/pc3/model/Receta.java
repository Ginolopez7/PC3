package com.gino.pc3.model;

public class Receta extends Shows{

    private String ingredientes;

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Receta(String name, String imgUrl, int precio, String ingredientes) {
        super(name, imgUrl, precio);
        this.ingredientes = ingredientes;
    }
}
