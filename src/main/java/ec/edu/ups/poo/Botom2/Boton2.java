package ec.edu.ups.poo.Botom2;

import java.awt.*;

public class Boton2 {
    public static void main (String[] args) {
        Frame miVentana = new Frame();
        Panel miPanel = new Panel();
        Button botonArea= new Button("Calcular área");
        Button botonPerimetro= new Button("Calcular Perimetro");
        miVentana.setSize(400 ,200);
        miVentana.setTitle("Ventana con botones");
        miVentana.setVisible(true);
        miVentana.add(miPanel);
        miVentana.add(botonArea);
        miVentana.add(botonPerimetro);
    }
}
