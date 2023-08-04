package com.gino.pc3.model;

public class Shows {
    private String name;
    private String imgUrl;
    private int precio;

    public Shows(String name, String imgUrl, int precio) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
