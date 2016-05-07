package com.ceste.objetosColecciones;

import java.util.Comparator;

/**
 * Created by Mayorian on 07/05/2016.
 */
public class OrdenarPorDNI implements Comparator<CarnetCruzRoja> {

    @Override
    public int compare(CarnetCruzRoja o1, CarnetCruzRoja o2) {
        return (o1).getDNI().compareTo((o2).getDNI());
    }
}
