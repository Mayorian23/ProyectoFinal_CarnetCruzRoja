package com.ceste.objetosColecciones;

import java.util.ArrayList;

/**
 * Created by Mayorian on 25/04/2016.
 */
public class Main {
    public static void main (String [] args){

        ArrayList<CarnetCruzRoja> Carnets = new ArrayList<>();

        CarnetCruzRoja carnet1 = new CarnetCruzRoja("Y4587965254E");
        carnet1.setNombre("mayorian");
        carnet1.setApellidos("caballero");
        carnet1.setProvincia("zaragoza");
        carnet1.setLocalidad("zaragoza");
        carnet1.setFecha_caducidad("10-8-2016");

        CarnetCruzRoja carnet2 = new CarnetCruzRoja("Y8754985264E");
        carnet2.setNombre("carmen");
        carnet2.setApellidos("osorio");
        carnet2.setProvincia("zaragoza");
        carnet2.setLocalidad("zaragoza");
        carnet2.setFecha_caducidad("15-8-2016");

        CarnetCruzRoja carnet3 = new CarnetCruzRoja("Y7521354157E");
        carnet3.setNombre("luis");
        carnet3.setApellidos("calderin");
        carnet3.setProvincia("zaragoza");
        carnet3.setLocalidad("zaragoza");
        carnet3.setFecha_caducidad("8-8-2016");

        CarnetCruzRoja carnet4 = new CarnetCruzRoja("Y4874510215E");
        carnet4.setNombre("fitz");
        carnet4.setApellidos("barnez");
        carnet4.setProvincia("zaragoza");
        carnet4.setLocalidad("zaragoza");
        carnet4.setFecha_caducidad("11-8-2016");

        CarnetCruzRoja carnet5 = new CarnetCruzRoja("Y5489456214E");
        carnet5.setNombre("jorge");
        carnet5.setApellidos("garrido");
        carnet1.setProvincia("zaragoza");
        carnet1.setLocalidad("zaragoza");
        carnet1.setFecha_caducidad("20-9-2016");

        Carnets.add(carnet1);
        Carnets.add(carnet2);
        Carnets.add(carnet3);
        Carnets.add(carnet4);
        Carnets.add(carnet5);

    }
}
