package ec.edu.ups.poo;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLOutput;

public class interrupcionesDeRaton extends MouseAdapter {

    private Label mensaje;

    public interrupcionesDeRaton(Label mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Conviertiendo el source en un componente
        // Los Strings son un arreglo de caracteres y significa que tiene posiciones
        Component componente = (Component) e.getSource();
        String nombre = componente.getName();
        // SUBSTRING: Dame desde la posicion x hasta la posicion y
        String opcion = nombre.substring(nombre.length() - 2, nombre.length());
        System.out.println(opcion);
        mensaje.setText("Ejecutar la accion:" + opcion);


    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Component componente = e.getComponent();
        componente.setBackground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Component componente = e.getComponent();
        componente.setBackground(Color.orange);
    }
}
