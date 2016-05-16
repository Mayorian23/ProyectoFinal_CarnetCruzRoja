package com.ceste.objetosColecciones;

import java.text.ParseException;
import java.util.Comparator;

/**
 * Created by Mayorian on 07/05/2016.
 */
public class OrdenarPorFecha implements Comparator<CarnetCruzRoja> {

    @Override
    public int compare(CarnetCruzRoja o1, CarnetCruzRoja o2) {
        try {
            return (o1).getFecha_caducidad().compareTo((o2).getFecha_caducidad());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
