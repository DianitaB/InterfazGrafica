package ec.edu.ups.poo.KeyAdap;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InterrupcionesDeTeclado extends KeyAdapter {
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyChar());
        if (e.getKeyChar() == '*') {
            System.exit(0);
        }
    }
}

