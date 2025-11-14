package fr.awu.pacman;

import javafx.scene.Parent;
import javafx.scene.layout.Pane;

public class Window {
    private final double width;
    private final double height;

    public Window(){
        this.width = 640;
        this.height = 480;
    }

    public Window(double w, double h){
        this.width = w;
        this.height = h;
    }

    public Parent generateWindow(){
        Pane layout = new Pane();
        layout.setPrefSize(width, height);
        return layout;
    }

    public double getHeight(){
        return this.height;
    }

    public double getWidth(){
        return this.width;
    }

    //PAS DE RESIZE POUR LE MOMENT.
    //MANUEL UNIQUEMENT.
}
