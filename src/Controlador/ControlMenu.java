/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mateo
 */
public class ControlMenu implements ActionListener {
    Menu menu = new Menu();

    public ControlMenu(Menu menu) {
        this.menu=menu;
        this.menu.play.addActionListener(this);
        this.menu.jPanel.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
