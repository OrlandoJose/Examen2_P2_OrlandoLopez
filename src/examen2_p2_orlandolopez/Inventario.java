/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_p2_orlandolopez;
import java.util.ArrayList;
/**
 *
 * @author Home
 */
public class Inventario {
    ArrayList<Producto>producto=new ArrayList<>();
    String archivo;
    public void agregar(Producto p){
        producto.add(p);
    }
        public void buscar(ArrayList<Producto>producto){
            
    }

    public Inventario(String archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
        
}
