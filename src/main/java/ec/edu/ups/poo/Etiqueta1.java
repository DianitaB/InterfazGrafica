package ec.edu.ups.poo;
import java.awt.Frame;
import java.awt.Label;

// iNTERFACES : CONJUNTO DE METODOS ABTRACTOS QUE IBAN A SER IMPLEMENDATAS EN UNA CLASE ESPECIFICA

public class Etiqueta1 {
    public static void main (String[] args) {
        Frame MiMarco = new Frame();
        Label Titulo = new Label("Notas de matematicas");

        MiMarco.add(Titulo);

        MiMarco.setSize(600, 400);
        MiMarco.setTitle("Ventana con etiqueta");
        MiMarco.setVisible(true);
    }

}
