package fr.awu.pacman;

public class Wall extends GameObject{
    private final double width;
    private final double height;

    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }

    @Override
    public String toString(){
        return "Wall"+super.toString();
    }
}
