package com.ceste.objetosColecciones;

        import java.io.*;
        import java.util.ArrayList;
        import java.util.Scanner;


public class CarnetsDb implements Serializable{
    private ArrayList<CarnetCruzRoja> carnets;
    private String fichero ;
    CarnetsDb(ArrayList carnets, String fichero) {
        this.carnets = carnets;
        this.fichero = fichero;

    }
    /**
     * Abre el fichero en modo lectura y carga sus datos en la variable carnets
     * Debes usar flujos de objetos (ObjectInputStream)
     */
    public void cargar() {
        try {
            FileInputStream fIs =new FileInputStream(fichero);
            ObjectInputStream oIs = new ObjectInputStream(fIs);
            CarnetCruzRoja cruzRojas = null;
            while((cruzRojas = (CarnetCruzRoja)oIs.readObject())!= null) {
                System.out.println(cruzRojas);
            }
            oIs.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    /**
     * Abre el fichero en modo escritura y vuelca en el contenido del atributo carnets
     * Debes usar flujos de objetos (ObjectOutputStream)
     */
    public void guardar() {
        try {
            FileOutputStream fOs = new FileOutputStream(fichero);
            ObjectOutputStream oOs = new ObjectOutputStream(fOs);
            for (int i = 0 ; i < carnets.size(); i++){
                oOs.writeObject(carnets.get(i));
                oOs.flush();
            }
            oOs.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(CarnetCruzRoja carnet){
        Scanner x = new Scanner(System.in);
        System.out.print("DNI: ");
        carnet.setDNI(x.nextLine());
        System.out.print("Nombre: ");
        carnet.setNombre(x.nextLine());
        System.out.print("Apellido: ");
        carnet.setApellidos(x.nextLine());
        System.out.print("Localidad: ");
        carnet.setLocalidad(x.nextLine());
        System.out.print("Provincia: ");
        carnet.setProvincia(x.nextLine());
        System.out.print("Servicio: ");
        carnet.setServicio(x.nextLine());
        System.out.print("Caducidad: ");
        carnet.setFecha_caducidad(x.nextLine());
        carnets.add(carnet);
    }
}
