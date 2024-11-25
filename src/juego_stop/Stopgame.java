/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_stop;

import Modelo.Jugador;
import Modelo.Categoria;
import java.util.*;

/**
 *
 * @author melcu
 */
public class Stopgame {

    private List<Jugador> jugadores;
    private List<Categoria> categorias;
    private boolean random;
    private int tiempo; // tiempo en segundos
    private char letra;

    public Stopgame(int tiempo, boolean random) {
        this.jugadores = new ArrayList<>();
        this.categorias = new ArrayList<>();
        this.tiempo = tiempo;
        this.random = random;
    }

    public void addPlayer(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void addCategory(Categoria categoria) {
        categorias.add(categoria);
    }

    public void startGame() {
        if (jugadores.isEmpty() || categorias.isEmpty()) {
            throw new IllegalStateException("Debe definir jugadores y categorías antes de iniciar el juego.");
        }

        if (random) {
            Collections.shuffle(jugadores);
        }

        while (true) {
            letra = (char) ('A' + new Random().nextInt(26));
            for (Jugador player : jugadores) {
                playTurn(player);
                if (player.hasCompletedAllCategories(categorias.size())) {
                    endGame(player);
                    return;
                }
            }
        }
    }

    private void playTurn(Jugador player) {
        System.out.println("Turno de " + player.getNombre() + ". Letra: " + letra);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Presiona Enter para comenzar...");
        scanner.nextLine();

        List<String> availableCategories = new ArrayList<>();
        for (Categoria category : categorias) {
            if (player.getPalabras().size() < categorias.size()
                    && player.getPalabras().size() == categorias.indexOf(category)) {
                availableCategories.add(category.getNombre());
            }
        }

        if (availableCategories.isEmpty()) {
            return;
        }

        String chosenCategory = availableCategories.get(0); // Toma la siguiente categoría en orden
        System.out.println("Categoría: " + chosenCategory);

        long startTime = System.currentTimeMillis();
        long endTime = startTime + tiempo * 1000;
        String word = "";

        while (System.currentTimeMillis() < endTime && word.isEmpty()) {
            System.out.println("Ingresa una palabra que empiece con " + letra + " para la categoría " + chosenCategory + ": ");
            word = scanner.nextLine();
            if (!word.toUpperCase().startsWith(String.valueOf(letra))) {
                word = "";
                System.out.println("La palabra no empieza con la letra " + letra);
            }
        }

        if (!word.isEmpty()) {
            System.out.println("Palabra ingresada: " + word);
            player.addWord(word);
        } else {
            System.out.println("Tiempo agotado. Turno perdido.");
        }
    }

    private void endGame(Jugador winner) {
        System.out.println("Stop! Ganador: " + winner.getNombre());
        jugadores.sort((p1, p2) -> p2.getPalabras().size() - p1.getPalabras().size());
        System.out.println("Resultados:");
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador player = jugadores.get(i);
            System.out.println((i + 1) + ". " + player.getNombre() + " - Categorías completadas: " + player.getPalabras().size());
        }
    }
}
