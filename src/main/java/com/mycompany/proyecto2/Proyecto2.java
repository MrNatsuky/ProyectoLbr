/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Emmanuel
 */
public class Proyecto2 {
 
    public static void main(String[] args) {
        login n = new login();
        n.setVisible(true);

        ArrayList<Usuario> usuarios = (ArrayList<Usuario>) leerArchivoBinario("Usuarios.progra");
          for (Usuario l : usuarios) {
        Usuario u = new Usuario();      
        u.setNombre(l.getNombre());
        u.setPassword(l.getPassword());
        u.setRol(l.getRol());
        u.setUsuario(l.getUsuario());
        Programa.getUsuarios().add(u);
   }
        ArrayList<Libros> libros = (ArrayList<Libros>) leerArchivoBinario("Libros.progra");
          for (Libros l : libros) {
        Libros u = new Libros();      
        u.setTitulo(l.getTitulo());
        u.setAutor(l.getAutor());
        u.setGenero(l.getGenero());
        u.setPrecio(l.getPrecio());
        u.setCantidad(l.getCantidad());
        Programa.getLibros().add(u);
   }
        ArrayList<Cupones> cupones = (ArrayList<Cupones>) leerArchivoBinario("Cupones.progra");
          for (Cupones l : cupones) {
        Cupones u = new Cupones();      
        u.setCodigo(l.getCodigo());
        u.setDescuento(l.getDescuento());
        u.setFecha(l.getFecha());
        u.setTipo(l.getTipo());
        Programa.getCupones().add(u);
   }
        ArrayList<Venta> ventas = (ArrayList<Venta>) leerArchivoBinario("Ventas.progra");
          for (Venta l : ventas) {
        Venta u = new Venta();      
        u.setDireccion(l.getDireccion());
        u.setFechaHoraActual(l.getFechaHoraActual());
        u.setIva(l.getIva());
        u.setNit(l.getNit());
        u.setNombre(l.getNombre());
        u.setTotal(l.getTotal());
        u.setVendedor(l.getVendedor());
        Programa.getVentas().add(u);
   }
        ArrayList<Proveedores> proveedor = (ArrayList<Proveedores>) leerArchivoBinario("Proveedores.progra");
          for (Proveedores l : proveedor) {
        Proveedores u = new Proveedores();      
        u.setDireccion(l.getDireccion());
        u.setNit(l.getNit());
        u.setNombre(l.getNombre());
        u.setTelefono(l.getTelefono());
        Programa.getProveedor().add(u);
   }
          
          
          
  }
    
    public static Object leerArchivoBinario(String ruta){
        try{
            FileInputStream archivo = new FileInputStream(ruta);
            ObjectInputStream lee = new ObjectInputStream(archivo);
            return lee.readObject();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public static void escribirArchivoBinario(Object o, String ruta){
        try{
            FileOutputStream archivo = new FileOutputStream(ruta);
            ObjectOutputStream escribe = new ObjectOutputStream(archivo);
            escribe.writeObject(o);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
    