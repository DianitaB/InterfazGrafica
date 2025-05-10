package ec.edu.ups.poo.MouseLis;

import java.awt.*;

public class Ejemplo {
    public static void main(String[] args) {
        Frame miVentana = new Frame("Esquema de eventos");
        Panel miPanel = new Panel();
        Button botonHola = new Button("Saludo");
        Button botonAdios = new Button("Despedida");
        miPanel.add(botonHola);
        miPanel.add(botonAdios);

        miVentana.add(miPanel);
        miVentana.setSize(200, 100);
        miVentana.setVisible(true);

        botonHola.addMouseListener(new EsquemRaton());
        botonAdios.addMouseListener(new EsquemRaton());
    }

}
