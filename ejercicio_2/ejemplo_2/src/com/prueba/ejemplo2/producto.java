package com.prueba.ejemplo2;

public class producto {
    /*codigo unico, precio, nombre, marca, categoria*/
    private  String codigo;
    private String nombre;
    private float precio;
    private String marca;
    private String categoria;

    public void Producto(){
        codigo = "";
        nombre = "";
        precio = 0.0f;
        marca = "";
        categoria = "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
