package be.intecbrussel.alexander_oplossingen.ice_cream_shop.sellers;

public class PriceList {

    //PROPERTIES
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    //CONSTRUCTORS
    public PriceList () {
        this(1, 1.2, 1.5);
    }

    public PriceList (double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    //GETTERS
    public double getBallPrice () {
        return ballPrice;
    }

    public double getRocketPrice () {
        return rocketPrice;
    }

    public double getMagnumPrice () {
        return magnumStandardPrice;
    }


}
