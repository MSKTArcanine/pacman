package fr.awu.pacman;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.binding.BooleanBinding;
import javafx.scene.paint.Color;

public class GameState {
    private int score;
    private final Window window;
    private final Player player;
    private final List<Phantom> phantoms;
    private int points;
    private int boosts;
    private BooleanBinding isGameOver;


    public GameState(Window window){
        this.phantoms = new ArrayList<>();
        this.phantoms.add(new Phantom(Color.BLUE));
        this.phantoms.add(new Phantom(Color.RED));
        this.phantoms.add(new Phantom(Color.YELLOW));
        this.phantoms.add(new Phantom(Color.PINK));
        this.player = new Player();
        this.window = window;
    }
    public GameState(Window window, int points){
        this(window);
        this.points = points;
    }
    public GameState(Window window, int points, int boosts){
        this(window, points);
        this.boosts = boosts;
    }


    private void placePoints(){
        //Placer TOUT les points.
        //Faut qu'ils se suivent avec les murs.
    }

    private void placePhantoms(){
        //Pareil
    }
    private void placePlayer(){
        //Plus simple.
    }
    private GameObject getAt(int x, int y){
        return new Todo();
    }


}
