package ec.edu.ups.poo.MouseLis;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EsquemRaton implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Presionasteee el botonn " + e.getButton());

    }

    @Override
    public void mousePressed(MouseEvent e) {


    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Dejaste de presionar el Boton " + e.getComponent().getName());


    }

    @Override
    public void mouseEntered(MouseEvent e) {
        e.getComponent().setBackground(Color.red);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        e.getComponent().setBackground(Color.CYAN);

    }
}
