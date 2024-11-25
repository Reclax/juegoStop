/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Juego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mateo
 */
public class ControlJuego implements ActionListener {
    Juego juego = new Juego();

    public ControlJuego(Juego juego) {
        this.juego=juego;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (true) {
            
        }
    }
    
}
