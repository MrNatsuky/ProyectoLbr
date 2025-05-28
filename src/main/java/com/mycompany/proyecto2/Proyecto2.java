/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto2;

import java.util.ArrayList;

/**
 *
 * @author Emmanuel
 */
public class Proyecto2 {
 
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static ArrayList<Libros> libros = new ArrayList<>();
    public static ArrayList<Cupones> cupones = new ArrayList<>();
    public static ArrayList<Venta> ventas = new ArrayList<>();
    public static ArrayList<Proveedores> proveedor = new ArrayList<>();
    
    public static void main(String[] args) {
         Usuario u = new Usuario();
        u.nombre = "admin";
        u.password = "admin";
        u.rol = "A";
        u.usuario = "admin";
        usuarios.add(u);
        
        login l = new login();
        l.setVisible(true);
    }
}
    