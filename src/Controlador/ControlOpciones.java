/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Opciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mateo
 */
public class ControlOpciones implements ActionListener {
    Opciones op = new Opciones();

    public ControlOpciones(Opciones op) {
        this.op=op;;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
