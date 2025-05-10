package ec.edu.ups.poo.action;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterrupcionesDeAccion implements ActionListener {
    public void actionPerformed (ActionEvent e){
        Component componente = (Component)e.getSource();
        String accionRealizada = e.getActionCommand();
        System.out.println("Componente:  " + componente.getName());
        System.out.println("Suceso: " + accionRealizada);
        System.out.println();
    }
}
