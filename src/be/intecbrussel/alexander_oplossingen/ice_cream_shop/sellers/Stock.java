package be.intecbrussel.alexander_oplossingen.ice_cream_shop.sellers;

public class Stock {

    //PROPERTIES
    private int iceRocket;
    private int cones;
    private int balls;
    private int magni;


    //CONSTRUCTORS
    public Stock () {
        this(3, 2, 4, 5);
    }

    public Stock (int iceRocket, int cones, int balls, int magni) {
        this.iceRocket = iceRocket;
        this.cones = cones;
        this.balls = balls;
        this.magni = magni;
    }

    //GETTERS & SETTERS
    public int getIceRocket () {
        return iceRocket;
    }

    public void setIceRocket (int iceRocket) {
        this.iceRocket = iceRocket;
    }

    public int getCones () {
        return cones;
    }

    public void setCones (int cones) {
        this.cones = cones;
    }

    public int getBalls () {
        return balls;
    }

    public void setBalls (int balls) {
        this.balls = balls;
    }

    public int getMagni () {
        return magni;
    }

    public void setMagni (int magni) {
        this.magni = magni;
    }
}
