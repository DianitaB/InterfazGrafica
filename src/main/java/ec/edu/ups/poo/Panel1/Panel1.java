package ec.edu.ups.poo.Panel1;

import java.awt.*;

public class Panel1 {
    public static void main (String[] args) {
        Frame miMarco = new Frame();
        Panel panelPrincipal = new Panel();
        Panel panelIzq = new Panel();
        Panel panelDcha = new Panel();

        Button botonCorrer = new Button("Correr");
        Button botonSaltar = new Button("Saltar");
        Button botonDescansar = new Button("Descansar");

        miMarco.add(panelPrincipal);
        panelPrincipal.add(panelIzq);
        panelPrincipal.add(panelDcha);
        panelIzq.add(botonCorrer);
        panelIzq.add(botonSaltar);
        panelDcha.add(botonDescansar);

        miMarco.setSize (400,200);
        miMarco.setTitle("Ventana con paneles");
        miMarco.setVisible(true);
    }
}
