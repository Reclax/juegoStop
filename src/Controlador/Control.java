/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Juego;
import Vista.Menu;
import Vista.Opciones;
import Vista.Plantilla;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author mateo
 */
public class Control implements ActionListener {

    Juego juego = new Juego();
    Menu menu = new Menu();
    Opciones op = new Opciones();
    Plantilla plantilla = new Plantilla();

    public Control(Juego juego, Menu menu, Opciones op, Plantilla plantilla) {
        this.juego = juego;
        this.menu = menu;
        this.op = op;
        this.plantilla = plantilla;
        this.menu.play.addActionListener(this);
        this.menu.play.setOpaque(false);
        this.menu.play.setContentAreaFilled(false);
        this.menu.play.setBorderPainted(false);
    }

    public void iniciar() {
        this.plantilla.setTitle("");
        this.plantilla.setLocationRelativeTo(null);
        this.plantilla.setResizable(false);
        this.plantilla.setSize(1188, 781);
        this.plantilla.jPanelPlantilla.revalidate();
        this.plantilla.jPanelPlantilla.repaint();
    }

    public void verPrincipal(JPanel p) {
        p.setSize(1188, 781);
        p.setLocation(0, 0);
        this.plantilla.jPanelPlantilla.removeAll();
        this.plantilla.jPanelPlantilla.add(p, BorderLayout.CENTER);
        this.plantilla.jPanelPlantilla.revalidate();
        this.plantilla.jPanelPlantilla.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.menu.play) {
            this.verPrincipal(this.op);
            this.op.setVisible(true);
        }
    }
}
