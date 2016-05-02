package com.ceste.objetosColecciones;

/**
 * Created by Mayorian on 25/04/2016.
 */
public class CarnetCruzRoja {

   private String Nombre;
   private String Apellidos;
   private String DNI;
   private String Provincia;
   private String Localidad;
   private String Servicio;
   private String Fecha_caducidad;

    public CarnetCruzRoja(String DNI){
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

    public String getFecha_caducidad() {
        return Fecha_caducidad;
    }


    public String toString() {
        return Nombre+""+ Apellidos+"/n"+ DNI+"/n"+ Provincia+""+ Localidad+"/n"+ Servicio+""+ Fecha_caducidad;
    }

}
