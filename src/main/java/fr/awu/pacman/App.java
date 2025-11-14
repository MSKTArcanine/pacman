package fr.awu.pacman;

import javafx.scene.paint.Color;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Player p = new Player();
        Phantom f = new Phantom(Color.BLUE);

        System.out.println(p);
        System.out.println(f);
    }
}
