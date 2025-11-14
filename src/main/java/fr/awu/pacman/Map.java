package fr.awu.pacman;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Map {
    private int width;
    private int height;
    private final List<Wall> walls;
    private final List<Point> points;
    private final List<Boost> boosts;
    private final BitSet wallsMap;
    private final BitSet pointsMap;
    private final BitSet boostMap;

    public Map(int w, int h){
        this.width = w;
        this.height = h;
        this.walls = new ArrayList<>();
        this.points = new ArrayList<>();
        this.boosts = new ArrayList<>();
        this.wallsMap = new BitSet(w * h);
        this.pointsMap = new BitSet(w * h);
        this.boostMap = new BitSet(w * h);
    }

    public GameObject getAt(int x, int y){
        return new Todo(); // A FAIRE
    }

    public void addWalls(int x, int y){
        this.walls.add(new Wall(x, y));
    }
    public void addPoints(int x, int y){
        this.points.add(new Point(1, x, y));
    }
    public void addBoosts(int x, int y){
        this.boosts.add(new Boost(x, y));
    }

    public BitSet renderWalls(){
        //Render les wall ici
        return new BitSet();
    }

    public BitSet renderPoints(){
        //
        return new BitSet();
    }

    public BitSet renderBoosts(){
        //
        return new BitSet();
    }

    // public JESAIPAENKOR render(){}.
}
