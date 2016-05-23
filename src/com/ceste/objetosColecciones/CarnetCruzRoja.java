package com.ceste.objetosColecciones;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Mayorian on 25/04/2016.
 */
public class CarnetCruzRoja implements Comparable<CarnetCruzRoja>, Serializable{

   private String Nombre;
   private String Apellidos;
   private String DNI;
   private String Provincia;
   private String Localidad;
   private String Servicio;
   private String Fecha_caducidad;

    public CarnetCruzRoja(){

    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDNI() {
        return DNI;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setProvincia(String provincia) {
        Provincia = provincia;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setLocalidad(String localidad) {
        Localidad = localidad;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setServicio(String servicio) {
        Servicio = servicio;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        Fecha_caducidad = fecha_caducidad;
    }

    public Date getFecha_caducidad() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = simpleDateFormat.parse(Fecha_caducidad);
        return date;
    }

    // Implementacion del metodo toString.

    public String toString() {
        return Nombre+"\t"+ Apellidos+"\t"+DNI+"\t"+Provincia+"\t"+ Localidad+"\t"+Servicio+"\t"+Fecha_caducidad;
    }

    //Implementacion de comparate.

    public int compareTo(CarnetCruzRoja a){

        int Apell = Apellidos.compareTo(a.Apellidos);
        return (Apell != 0 ? Apell : Nombre.compareTo(a.Nombre));

    }

}



