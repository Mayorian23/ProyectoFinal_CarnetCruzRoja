package com.ceste.objetosColecciones;

import java.util.Comparator;

/**
 * Created by Mayorian on 07/05/2016.
 */
public class OrdenarPorFecha implements Comparator<CarnetCruzRoja> {

    @Override
    public int compare(CarnetCruzRoja o1, CarnetCruzRoja o2) {
        return (o1).getFecha_caducidad().compareTo((o2).getFecha_caducidad());
    }
}
