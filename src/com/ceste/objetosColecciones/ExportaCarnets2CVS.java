package com.ceste.objetosColecciones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Mayorian on 16/05/2016.
 */
public class ExportaCarnets2CVS {

    private final ArrayList<CarnetCruzRoja> Carnets;
    private String fichero;

    public ExportaCarnets2CVS(ArrayList Carnets, String fichero){
        this.Carnets = Carnets;
        this.fichero = fichero;
    }

    public void guardarDatos(){
        try{
            FileWriter escribirDatos = new FileWriter(fichero);
            BufferedWriter almacenoDatos = new BufferedWriter(escribirDatos);
            for (int x = 0;x < Carnets.size();x++) {
                String cadena = Carnets.get(x).toString();
                almacenoDatos.write(cadena, 0, cadena.length());
                almacenoDatos.newLine();
            }
            almacenoDatos.flush();
            almacenoDatos.close();
        }
        catch (IOException  e)
        {
            e.printStackTrace();
        }

    }




}
