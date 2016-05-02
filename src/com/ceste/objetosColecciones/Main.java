package com.ceste.objetosColecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main (String [] args){

        ArrayList<CarnetCruzRoja> Carnets = new ArrayList<>();

        CarnetCruzRoja carnet1 = new CarnetCruzRoja("Y4587965254E");
        carnet1.setNombre("mayorian");
        carnet1.setApellidos("caballero");
        carnet1.setProvincia("zaragoza");
        carnet1.setLocalidad("zaragoza");
        carnet1.setServicio("estudiante");
        carnet1.setFecha_caducidad("10-8-2016");

        CarnetCruzRoja carnet2 = new CarnetCruzRoja("Y8754985264E");
        carnet2.setNombre("carmen");
        carnet2.setApellidos("osorio");
        carnet2.setProvincia("zaragoza");
        carnet2.setLocalidad("zaragoza");
        carnet2.setServicio("estudiante");
        carnet2.setFecha_caducidad("15-8-2016");

        CarnetCruzRoja carnet3 = new CarnetCruzRoja("Y7521354157E");
        carnet3.setNombre("luis");
        carnet3.setApellidos("calderin");
        carnet3.setProvincia("zaragoza");
        carnet3.setLocalidad("zaragoza");
        carnet3.setServicio("estudiante");
        carnet3.setFecha_caducidad("8-8-2016");

        CarnetCruzRoja carnet4 = new CarnetCruzRoja("Y4874510215E");
        carnet4.setNombre("fitz");
        carnet4.setApellidos("barnez");
        carnet4.setProvincia("zaragoza");
        carnet4.setLocalidad("zaragoza");
        carnet4.setServicio("estudiante");
        carnet4.setFecha_caducidad("11-8-2016");

        CarnetCruzRoja carnet5 = new CarnetCruzRoja("Y5489456214E");
        carnet5.setNombre("jorge");
        carnet5.setApellidos("garrido");
        carnet5.setProvincia("zaragoza");
        carnet5.setLocalidad("zaragoza");
        carnet5.setServicio("estudiante");
        carnet5.setFecha_caducidad("20-9-2016");

        //Agregamos los objetos al arrayList.
        Carnets.add(carnet1);
        Carnets.add(carnet2);
        Carnets.add(carnet2);
        Carnets.add(carnet3);
        Carnets.add(carnet4);
        Carnets.add(carnet5);

        //System.out.println(Carnets);

        //Agregamos el HashSet.

        Set<CarnetCruzRoja> Cart = new HashSet<CarnetCruzRoja>();
        Cart.add(carnet1);
        Cart.add(carnet2);
        Cart.add(carnet2);
        Cart.add(carnet3);
        Cart.add(carnet4);
        Cart.add(carnet5);

        System.out.println(Cart);
    }
}
