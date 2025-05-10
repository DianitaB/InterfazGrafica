package ec.edu.ups.poo.MouseAdap;

import java.awt.*;

public class Ejemplo {
    public static void main(String[] args) {
        final int NUM_OPCIONES = 12;
        Label mensaje = new Label("Mensaje asociado al botón pulsado");
        Button [] botones = new Button[NUM_OPCIONES];

        for (int i = 0; i < NUM_OPCIONES; i++) {
            botones[i] = new Button("Opcion " + (i + 1));
            if (i < 10) {
                botones[i].setName(" O " + i);
            } else {
                botones[i].setName(String.valueOf(i));
            }
        }
        Frame miVentana = new Frame("Prueba de eventos de raton ");
        Panel panelPrincipal = new Panel(new GridLayout(NUM_OPCIONES + 1,1));
        panelPrincipal.add(mensaje);
        for (int i = 0; i < NUM_OPCIONES; i++) {
            panelPrincipal.add(botones[i]);
        }
        miVentana.add(panelPrincipal);
        miVentana.setSize(400,600);
        miVentana.setVisible(true);
        for (int i = 0; i < NUM_OPCIONES; i++) {
            botones[i].addMouseListener(new interrupcionesDeRaton(mensaje));
        }
    }
}
// Clases internas o anónimas: Solo se pueden hacer en el panel

