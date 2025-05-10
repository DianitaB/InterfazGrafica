package ec.edu.ups.poo.ItemList;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class InterrupcionesDeElemento implements ItemListener {
    public void itemStateChanged(ItemEvent e) {
        Checkbox componente = (Checkbox)e.getSource();
        boolean estado = componente.getState();
        int nuevoEstado = e.getStateChange();

        System.out.println("Componente: " + e.getItem());
        System.out.println("Estado actual: " + estado);

        if (nuevoEstado == ItemEvent.SELECTED) {
            System.out.println("Seleccionado");
        } else {
            System.out.println("No seleccionado");
        }
        System.out.println();
    }

}
