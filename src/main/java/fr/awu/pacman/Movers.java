package fr.awu.pacman;

public abstract class Movers extends GameObject {
    private State state;

    public void moveUp(){
        this.setY(getY() + 1);
    }

    public void moveDown(){
        this.setY(getY() - 1);
    }

    public void moveLeft(){
        this.setX(getX() - 1);
    }

    public void moveRight(){
        this.setX(getX() + 1);
    }

    public void setState(State state){
        this.state = state;
    }

    public void clearState(){
        this.state = State.NEUTRAL;
    }

    public State getState(){
        return this.state;
    }

    public boolean collisionCheck(){
        //Je sais pas encore;
        return true;
    }
}
