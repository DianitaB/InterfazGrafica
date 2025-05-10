package ec.edu.ups.poo.WindowList;

import java.awt.*;

public class Ejemplo {
    public static void main(String[] args) {
        Frame miVentana = new Frame("Prueba eventos de ventana") ;
        miVentana.setSize(200,110);
        miVentana.setVisible (true);

        Frame otraVentana = new Frame ("Prueba eventos de ventana") ;
        otraVentana.setSize(100,500);
        otraVentana.setLocation(200,0);
        otraVentana.setVisible(true);

        miVentana.addWindowListener(new InterrupcionesDeVentana());
        otraVentana.addWindowListener(new InterrupcionesDeVentana());
    }
}

