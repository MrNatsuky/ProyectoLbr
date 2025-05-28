/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author oem
 */
public class Venta{
       public double total;
       public double iva;
       public String nit;
       public String nombre;
       public String direccion;
       public String vendedor;
       public LocalDateTime fechaHoraActual;
       public static ArrayList<LibrosV> librosV = new ArrayList<>();
       public static ArrayList<TablaVenta> dibujo = new ArrayList<>();
       
}
