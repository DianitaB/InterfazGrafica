package ec.edu.ups.poo.TextField;

import java.awt.*;

public class CampoDeTexto1 {
    public static void main (String[] args) {
        Frame miMarco = new Frame();
        Panel entradaDeDatos = new Panel(new FlowLayout());
        TextField nombre = new TextField(15);
        TextField apellido = new TextField(60);
        TextField nacionalidad = new TextField("Española",15);

        entradaDeDatos.add(nombre);
        entradaDeDatos.add(apellido);
        entradaDeDatos.add(nacionalidad);

        miMarco.add(entradaDeDatos);
        miMarco.setSize(500,130);
        miMarco.setTitle("Ventana con campos de texto");
        miMarco.setVisible(true);
    }
}
