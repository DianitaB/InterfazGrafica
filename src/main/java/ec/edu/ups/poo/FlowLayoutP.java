package ec.edu.ups.poo;
import java.awt.*;

public class FlowLayoutP {
    public static void main (String[] args) {
        Frame miVentana = new Frame ();
        Panel miPanelPrincipal = new Panel ();
        FlowLayout posicionamientoSecuencial = new FlowLayout();
        Button botonA = new Button ("Primer botón");
        Button botonB = new Button ("Segundo botón");
        Button botonC = new Button ( "Tercer botón");
        Button botonD = new Button ("Cuarto botón");
        miPanelPrincipal.setLayout(posicionamientoSecuencial);
        miVentana.add(miPanelPrincipal);
        miPanelPrincipal.add(botonA);
        miPanelPrincipal.add(botonB);
        miPanelPrincipal.add(botonC);
        miPanelPrincipal.add(botonD);
        miVentana.setSize(300, 100);
        miVentana.setTitle("Ventana con flow layout");
        miVentana.setVisible(true);
    }
}