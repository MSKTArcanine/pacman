package fr.awu.pacman;

import javafx.scene.paint.Color;

public class Phantom extends Movers implements ICollider{
    private Color color;

    public Phantom(Color color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phantom "+ this.color.toString() + super.toString();
    }

    @Override
    public void onCollision(GameObject go) {
        if(go instanceof Player){
            this.setState(State.AFRAID);
        }
    }

    public Color getColor(){
        return this.color;
    }
}
