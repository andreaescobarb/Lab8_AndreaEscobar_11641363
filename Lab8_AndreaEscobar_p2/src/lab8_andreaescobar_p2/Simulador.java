/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_andreaescobar_p2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ProgressBar;
import javax.swing.AbstractAction.*;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
/**
 *
 * @author andre
 */
public class Simulador extends Thread{
    private JProgressBar bar1;
    private JProgressBar bar2;
    private Hadas hada1;
    private Hadas hada2;

    public Simulador(JProgressBar bar1, JProgressBar bar2, Hadas hada1, Hadas hada2) {
        this.bar1 = bar1;
        this.bar2 = bar2;
        this.hada1 = hada1;
        this.hada2 = hada2;
    }

    public JProgressBar getBar1() {
        return bar1;
    }

    public void setBar1(JProgressBar bar1) {
        this.bar1 = bar1;
    }

    public JProgressBar getBar2() {
        return bar2;
    }

    public void setBar2(JProgressBar bar2) {
        this.bar2 = bar2;
    }

    public Hadas getHada1() {
        return hada1;
    }

    public void setHada1(Hadas hada1) {
        this.hada1 = hada1;
    }

    public Hadas getHada2() {
        return hada2;
    }

    public void setHada2(Hadas hada2) {
        this.hada2 = hada2;
    }

    @Override
    public void run() {
        bar1.setValue((int) hada1.getSalud());
        bar2.setValue((int) hada2.getSalud());
        bar1.setMaximum((int) hada1.getSalud());
        bar2.setMaximum((int) hada2.getSalud());
        String ganador = "";
        boolean bandera = true;
        while (bandera) {
            if ((hada1 instanceof Salamandra) && (hada2 instanceof Hamadriades)) {
                hada2.setSalud((int) (hada2.getSalud() - (hada1.getPoder() + (hada1.getPoder() * 0.37))));
            } else if ((hada1 instanceof Lamias) && (hada2 instanceof Salamandra)) {
                hada2.setSalud((int) (hada2.getSalud() - (hada1.getPoder() + (hada1.getPoder() * 0.42))));
            } else if ((hada1 instanceof Sifides) && (hada2 instanceof Salamandra)) {
                hada2.setSalud((int) (hada2.getSalud() - (hada1.getPoder() + (hada1.getPoder() * 0.37))));
            } else {
                hada2.setSalud((int) (hada2.getSalud() - hada1.getPoder()));
            }
            bar2.setValue((int) hada2.getSalud());
            
            if (hada2.getSalud() <= 0) {
                bandera = false;
                ganador = hada1.getNombre();
            }
            
            if (bandera) {
                if ((hada2 instanceof Salamandra) && (hada2 instanceof Hamadriades)) {
                    hada1.setSalud((int) (hada1.getSalud() - (hada2.getPoder() + (hada2.getPoder() * 0.37))));
                } else if ((hada2 instanceof Lamias) && (hada2 instanceof Salamandra)) {
                    hada1.setSalud((int) (hada1.getSalud() - (hada2.getPoder() + (hada2.getPoder() * 0.42))));
                } else if ((hada2 instanceof Sifides) && (hada2 instanceof Salamandra)) {
                    hada1.setSalud((int) (hada1.getSalud() - (hada2.getPoder() + (hada2.getPoder() * 0.37))));
                } else {
                    hada1.setSalud((int) (hada1.getSalud() - hada2.getPoder()));
                }
                bar1.setValue((int) hada1.getSalud());
                
                if (hada1.getSalud() >= 0) {
                    bandera = false;
                    ganador = hada2.getNombre();
                }
                try {
                    Thread.sleep(2000);
            }   catch (InterruptedException ex) {
                    Logger.getLogger(Simulador.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
        JOptionPane.showMessageDialog(null, "ganador es: " + ganador);
    
    }
    }
}
