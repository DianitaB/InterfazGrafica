package ec.edu.ups.poo.BorderLayout;

import java.awt.*;

public class BorderLayout1 {
    public static void main(String[] args){
        Frame miMarco = new Frame();
        Panel panelMenuNorte = new Panel();
        Panel panelGeneral = new Panel();

        panelGeneral.setLayout(new BorderLayout());
        panelMenuNorte.setLayout(new FlowLayout());

        Button botonOpcion1 = new Button("Opción 1");
        Button botonOpcion2 = new Button("Opción 2");
        Button botonOpcion3 = new Button("Opción 3");
        Button botonSur = new Button("Sur");
        Button botonEste = new Button("Este");
        Button botonOeste = new Button("Oeste");
        Button botonCentro = new Button("Centro");

        panelMenuNorte.add(botonOpcion1);
        panelMenuNorte.add(botonOpcion2);
        panelMenuNorte.add(botonOpcion3);

        panelGeneral.add(panelMenuNorte, BorderLayout.NORTH);
        panelGeneral.add(botonSur, BorderLayout.SOUTH);
        panelGeneral.add(botonEste, BorderLayout.EAST);
        panelGeneral.add(botonOeste, BorderLayout.WEST);
        panelGeneral.add(botonCentro, BorderLayout.CENTER);

        miMarco.add(panelGeneral);
        miMarco.setSize(400, 150);
        miMarco.setTitle("Ventana con BorderLayout");
        miMarco.setVisible(true);
    }
}

// Si queremos utilizar el BorderLayout - tenemos que mandarlo desde otro panel
