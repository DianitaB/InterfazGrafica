package ec.edu.ups.poo;
import java.awt.*;

public class Ejemplo {
    public static void main(String[] args) {
        Frame miVentana = new Frame();
        miVentana.setSize(600, 400);
        miVentana.setLocation(new Point(600,400));
        miVentana.setTitle("Mi ventana de ejemplo");
        miVentana.setVisible(true);
        miVentana.setLocationRelativeTo(null);

        // Creamos un panel
        Panel miPanelPrincipal = new Panel();
        Panel miPanelIzquierdo = new Panel ();
        Panel miPanelDerecho = new Panel ();

        // Creamos un boton

        Button boton1 = new Button("Click Me 1");
        Button boton2 = new Button("Click Me 2");
        Button boton3 = new Button("Click Me 3");

        // Añadimos los paneles secundarios al panel principal
        miPanelPrincipal.add(miPanelIzquierdo);
        miPanelPrincipal.add(miPanelDerecho);

        // Añadimos a la ventana mi panel
        miVentana.add(miPanelPrincipal);

        // Añadimos el panel a los botones

        miPanelIzquierdo.add(boton1);
        miPanelIzquierdo.add(boton2);
        miPanelDerecho.add(boton3);

        // Mis propias ventanas
        /*MiVentana v1 = new MiVentana();
        MiVentana v2 = new MiVentana("Ventana 2");
        v2.setSize(600, 400);
        MiVentana v3 = new MiVentana("Ventana 3",400,200);
        MiVentana v4 = new MiVentana("Ventana 4");
        v2.setLocationRelativeTo(null);
        v2.setBackground(Color.pink); */

        final int NUM_OPCIONES = 12;
        Label mensaje = new Label("Mensaje asociado al botón pulsado");
        Button [] botones = new Button[NUM_OPCIONES];

        for (int i = 0; i < NUM_OPCIONES; i++) {
            botones[i] = new Button("Opcion " + (i + 1));
            if ((i < 10)) {

                botones[i].setName(" O " + i);
            } else {
                botones[i].setName(String.valueOf(i));
            }
        }
        Frame miVentanaA = new Frame("Prueba de eventos de raton ");
        Panel panelPrincipal = new Panel(new GridLayout(NUM_OPCIONES + 1,1));
        panelPrincipal.add(mensaje);
        for (int i = 0; i < NUM_OPCIONES; i++) {
            panelPrincipal.add(botones[i]);
            miVentana.add(panelPrincipal);
            miVentana.setSize(400,600);
            miVentana.setVisible(true);
        }

        Frame miVentanaB = new Frame("Prueba eventos de ventana");
        miVentana.setSize(200, 100);
        miVentana.addWindowListener(new InterrupcionesDeVentana());
        miVentana.setVisible(true);
        Frame otraVentana = new Frame("Prueba eventos de ventana");
        otraVentana.setSize(100, 50);
        otraVentana.setLocation(200, 200);
        otraVentana.addWindowListener(new InterrupcionesDeVentana());
        otraVentana.setVisible(true);

    }
}