/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author melcu
 */
public class Jugador {
    private String nombre;
    private List<String> palabras; // Lista de palabras ingresadas en orden de las categorías

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.palabras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getPalabras() {
        return palabras;
    }

    public void addWord(String word) {
        palabras.add(word);
    }

    public boolean hasCompletedAllCategories(int totalCategories) {
        return palabras.size() == totalCategories;
    }
}
