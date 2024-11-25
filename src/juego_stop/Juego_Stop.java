/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego_stop;

import Controlador.Control;
import Controlador.ControlJuego;
import Controlador.ControlOpciones;
import Modelo.Jugador;
import Modelo.Categoria;
import Vista.Juego;
import Vista.Menu;
import Vista.Opciones;
import Vista.Plantilla;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoDeepOceanIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightContrastIJTheme; //op
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubContrastIJTheme; //opcion
import java.util.Scanner;
import javax.swing.UIManager;

/**
 *
 * @author melcu
 */
public class Juego_Stop {

    public static void main(String[] args) {
        //visual------------------------------------------
        
        try {
            
            UIManager.setLookAndFeel(new FlatGradiantoDeepOceanIJTheme());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        Juego juego = new Juego();
        Menu menu = new Menu();
        Plantilla plantilla = new Plantilla();
        Opciones op = new Opciones();
        ControlJuego cJuego = new ControlJuego(juego);
        ControlOpciones controlOp = new ControlOpciones(op); 
        Control control = new Control(juego,menu,op,plantilla);
        control.iniciar();
        plantilla.setVisible(true);
        control.verPrincipal(menu);
        menu.jButton1.doClick();
        
        
        
        
        
        
        //consola--------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a Stop!");
        System.out.print("Ingrese el tiempo por turno (segundos): ");
        int timePerTurn = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("¿Desea orden aleatorio de jugadores? (s/n): ");
        boolean randomOrder = scanner.nextLine().equalsIgnoreCase("s");

        Stopgame game = new Stopgame(timePerTurn, randomOrder);

        System.out.print("Ingrese el número de jugadores: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Ingrese el nombre del jugador " + (i + 1) + ": ");
            String name = scanner.nextLine();
            game.addPlayer(new Jugador(name));
        }

        System.out.print("Ingrese el número de categorías (5-10): ");
        int numCategories = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < numCategories; i++) {
            System.out.print("Ingrese el nombre de la categoría " + (i + 1) + ": ");
            String categoryName = scanner.nextLine();
            game.addCategory(new Categoria(categoryName));
        }

        game.startGame();
    }

}
