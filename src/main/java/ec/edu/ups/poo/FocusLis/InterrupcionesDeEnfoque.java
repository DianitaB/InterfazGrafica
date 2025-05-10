package ec.edu.ups.poo.FocusLis;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class InterrupcionesDeEnfoque implements FocusListener {

    public InterrupcionesDeEnfoque() {
        super();
    }

    @Override
    public void focusGained(java.awt.event.FocusEvent e) {
        System.out.println("Se ha entrado en el componente");

    }

    @Override
    public void focusLost(java.awt.event.FocusEvent e) {
        System.out.println("Se ha salido del componente");

    }
}
