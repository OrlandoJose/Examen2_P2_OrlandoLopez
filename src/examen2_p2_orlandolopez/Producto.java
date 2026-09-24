/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_p2_orlandolopez;

/**
 *
 * @author Home
 */
public class Producto {
   String Codigo;
    String Nombre;
         String Categoria;
String Precio;
int Cantidad;

    public Producto(String Codigo, String Nombre, String Categoria, String Precio, int Cantidad) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + ", Categoria=" + Categoria + ", Precio=" + Precio + ", Cantidad=" + Cantidad + '}';
    }

}
