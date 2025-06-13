/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author oem
 */
public class Programa implements Serializable{
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Libros> libros = new ArrayList<>();
    private static ArrayList<Cupones> cupones = new ArrayList<>();
    private static ArrayList<Venta> ventas = new ArrayList<>();
    private static ArrayList<Proveedores> proveedor = new ArrayList<>();        

    /**
     * @return the usuarios
     */
    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param aUsuarios the usuarios to set
     */
    public static void setUsuarios(ArrayList<Usuario> aUsuarios) {
        usuarios = aUsuarios;
    }

    /**
     * @return the libros
     */
    public static ArrayList<Libros> getLibros() {
        return libros;
    }

    /**
     * @param aLibros the libros to set
     */
    public static void setLibros(ArrayList<Libros> aLibros) {
        libros = aLibros;
    }

    /**
     * @return the cupones
     */
    public static ArrayList<Cupones> getCupones() {
        return cupones;
    }

    /**
     * @param aCupones the cupones to set
     */
    public static void setCupones(ArrayList<Cupones> aCupones) {
        cupones = aCupones;
    }

    /**
     * @return the ventas
     */
    public static ArrayList<Venta> getVentas() {
        return ventas;
    }

    /**
     * @param aVentas the ventas to set
     */
    public static void setVentas(ArrayList<Venta> aVentas) {
        ventas = aVentas;
    }

    /**
     * @return the proveedor
     */
    public static ArrayList<Proveedores> getProveedor() {
        return proveedor;
    }

    /**
     * @param aProveedor the proveedor to set
     */
    public static void setProveedor(ArrayList<Proveedores> aProveedor) {
        proveedor = aProveedor;
    }
    
}
