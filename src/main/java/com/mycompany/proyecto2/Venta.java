/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author oem
 */
public class Venta implements Serializable{
       private double total;
       private double iva;
       private String nit;
       private String nombre;
       private String direccion;
       private String vendedor;
       private LocalDateTime fechaHoraActual;
       private static ArrayList<LibrosV> librosV = new ArrayList<>();
       private static ArrayList<TablaVenta> dibujo = new ArrayList<>();

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva) {
        this.iva = iva;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the vendedor
     */
    public String getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the fechaHoraActual
     */
    public LocalDateTime getFechaHoraActual() {
        return fechaHoraActual;
    }

    /**
     * @param fechaHoraActual the fechaHoraActual to set
     */
    public void setFechaHoraActual(LocalDateTime fechaHoraActual) {
        this.fechaHoraActual = fechaHoraActual;
    }

    /**
     * @return the librosV
     */
    public static ArrayList<LibrosV> getLibrosV() {
        return librosV;
    }

    /**
     * @param aLibrosV the librosV to set
     */
    public static void setLibrosV(ArrayList<LibrosV> aLibrosV) {
        librosV = aLibrosV;
    }

    /**
     * @return the dibujo
     */
    public static ArrayList<TablaVenta> getDibujo() {
        return dibujo;
    }

    /**
     * @param aDibujo the dibujo to set
     */
    public static void setDibujo(ArrayList<TablaVenta> aDibujo) {
        dibujo = aDibujo;
    }
       
}
