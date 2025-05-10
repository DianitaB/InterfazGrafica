package ec.edu.ups.poo.MiVentan;

import java.awt.*;

public class MiVentana extends Frame {
    public MiVentana (String titulo){
        this.setTitle(titulo);
        this.setVisible(true);
    }
    public MiVentana (String titulo, int ancho, int alto){
        this(titulo);
        this.setSize(ancho,alto);
    }
    public MiVentana (){
        this("Mi Ventana",600,400);
    }
    public MiVentana(String titulo, int ancho, int alto, int posX, int posY) {
        this(titulo,ancho,alto);
        this.setLocation(new Point(posX, posY));
    }
}
