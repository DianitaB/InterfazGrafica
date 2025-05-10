package ec.edu.ups.poo.ItemList;

import java.awt.*;

public class Ejemplo {
    public static void main(String[] args) {
        Frame miVentana = new Frame("Prueba eventos de elemento");
        Panel miPanel = new Panel(new GridLayout(4,1));
        Checkbox diesel = new Checkbox("Diesel",true);
        Checkbox farosXenon = new Checkbox("Faros de Xenon",false);
        Checkbox llantasAleacion = new Checkbox("Llantas de Aleacion",false);
        Checkbox pinturaMetalizada = new Checkbox("Pintura Metalizada",true);

        miPanel.add(diesel);
        miPanel.add(farosXenon);
        miPanel.add(llantasAleacion);
        miPanel.add(pinturaMetalizada);

        diesel.addItemListener(new InterrupcionesDeElemento());
        farosXenon.addItemListener(new InterrupcionesDeElemento());
        llantasAleacion.addItemListener(new InterrupcionesDeElemento());
        pinturaMetalizada.addItemListener(new InterrupcionesDeElemento());

        miVentana.add(miPanel);
        miVentana.setSize(400,200);
        miVentana.setVisible(true);
    }
}
