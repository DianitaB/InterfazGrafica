package ec.edu.ups.poo;


import java.awt.*;

public class Ejemplo2 {
    public static void main(String[] args) {
        Frame miVentana = new Frame("Prueba de eventos de raton");
        Panel miPanel = new Panel( );
        Button boton1 = new Button ("Silencio");
        Button boton2 = new Button ("Maquina de escribir");
        miPanel.add(boton1);
        miPanel.add(boton2);

        miVentana.add(miPanel);
        miVentana.setSize(400,400);
        miVentana.setVisible(true);

        boton2.addKeyListener(new InterrupcionesDeTeclado());

    }
}
