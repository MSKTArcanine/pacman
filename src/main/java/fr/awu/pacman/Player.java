package fr.awu.pacman;

public class Player extends Movers implements ICollider {
    private int score;
    private int lives;

    public Player(){
        this.score = 0;
        this.lives = 0;
    }

    private void decreaseLife(){
        this.lives -= 1;
    }

    public int getLives(){
        return this.lives;
    }

    public int getScore(){
        return this.score;
    }

    @Override
    public void onCollision(GameObject go) {
        if(go instanceof Phantom){
            this.decreaseLife();
        }
    }

    @Override
    public String toString(){
        return "Player"+super.toString();
    }
}
