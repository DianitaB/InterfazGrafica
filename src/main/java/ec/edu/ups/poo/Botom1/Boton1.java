package ec.edu.ups.poo.Botom1;

import java.awt.*;

public class Boton1 {
    public static void main (String[] args) {
        // Creamos una nueva ventana
        Frame miVentana = new Frame();

        // Creamos un boton nuevo+
        Button botonHola = new Button("Hola");

        // Agregamos propieddes a ventana
        miVentana.setSize(400,200);
        miVentana.setTitle("Venatana con boton ");
        miVentana.setVisible(true);

        // Añadimos el boton a nuestra ventana
        miVentana.add(botonHola);
    }

}
