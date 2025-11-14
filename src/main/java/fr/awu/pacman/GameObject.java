package fr.awu.pacman;

import java.util.List;

public abstract class GameObject {
    private int x;
    private int y;

    public List<Integer> getPosition(){
        return List.of(this.x, this.y);
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    @Override
    public String toString(){
        return " => x : "+ this.x +", y : "+ this.y;
    }
}
