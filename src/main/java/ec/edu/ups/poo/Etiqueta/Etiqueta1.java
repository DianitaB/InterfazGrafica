package ec.edu.ups.poo.Etiqueta;

import java.awt.*;

public class Etiqueta1 {
    public static void main (String[] args) {
        Frame MiMarco = new Frame();
        Label Titulo = new Label("Notas de matematicas");

        MiMarco.add(Titulo);

        MiMarco.setSize(200, 100);
        MiMarco.setTitle("Ventana con etiqueta");
        MiMarco.setVisible(true);
    }
}
// iNTERFACES : CONJUNTO DE METODOS ABTRACTOS QUE IBAN A SER IMPLEMENDATAS EN UNA CLASE ESPECIFICA
