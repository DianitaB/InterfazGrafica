package ec.edu.ups.poo.GridLayout;

import java.awt.*;

public class GridLayout1 {
    public static void main(String[] args) {
        Frame miVentana = new Frame();
        Panel miPanel = new Panel();
        Panel miPanel2 = new Panel(new BorderLayout());

        // Configurar panel con BorderLayout
        Button botonArriba = new Button("Arriba");
        Button botonAbajo = new Button("Abajo");
        Button botonCentro = new Button("Centro");
        miPanel2.add(botonArriba, BorderLayout.NORTH);
        miPanel2.add(botonAbajo, BorderLayout.SOUTH);
        miPanel2.add(botonCentro, BorderLayout.CENTER);

        // Configurar panel con GridLayout
        GridLayout matriz = new GridLayout(2, 3);
        miPanel.setLayout(matriz);

        Button[] botones = new Button[6];
        for (int i = 0; i < 6; i++)
            botones[i] = new Button("Boton" + i);

        for (int i = 0; i < 6; i++)
            miPanel.add(botones[i]);

        // Configurar ventana principal
        miVentana.setLayout(new BorderLayout());
        miVentana.add(miPanel, BorderLayout.CENTER);
        miVentana.add(miPanel2, BorderLayout.WEST);

        miVentana.setSize(400, 150);
        miVentana.setTitle("Ventana con GridLayout");
        miVentana.setVisible(true);
    }
}

// Tabla donde nos permite tener n filas y n columnas
// 2 FORMAS DE HACERLO
// Se puede instanciar directamente en el constructor
// Instancio vacío y por medio de los getter y setter llamo a los mismos




