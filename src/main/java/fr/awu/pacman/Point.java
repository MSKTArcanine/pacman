package fr.awu.pacman;

public class Point implements ICollectible{
    private int points;

    public Point(int points){
        this.points = points;
    }

    //FAUT CHANGER CA PLUS TARD.
    //LE POINT DOIT PAS MODIFIER LE SCORE DU JOUEUR
    //PASSER EN NOTIF VERS GAMESTATE JSAIPA
    //OU UN TRUC DU GENRE OU AUTRE CHOSE.
    @Override
    public void onCollected(Player p) {
        p.addScore(points);
    }

    public int getPoint(){
        return this.points;
    }
}
