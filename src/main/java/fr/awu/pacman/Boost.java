package fr.awu.pacman;

public class Boost extends GameObject implements ICollectible {
    private final int points;

    public Boost(int x, int y){
        this.points = 10;
        this.setX(x);
        this.setY(y);
    }

    @Override
    public String toString() {
        return "Boost"+super.toString();
    }

    @Override
    public void onCollected(Player p) {
        p.setState(State.SUPER);
        p.addScore(points);
    }

}
