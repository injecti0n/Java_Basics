package be.intecbrussel.alexander_oplossingen.ice_cream_shop.eatables;

public class Cone implements Eatable {

    //PROPERTIES
    private Flavor[] balls;

    //CONSTRUCTORS
    public Cone () {
    }

    public Cone (Flavor[] balls) {
        this.balls = balls;
    }

    //METHOD
    @Override
    public void eat () {
        System.out.print("       Cone\n");
        for (Flavor b : balls) {
            System.out.print("       + " + b + "\n");
        }
    }

    //INNER CLASS
    public enum Flavor {

        //INTRODUCE OBJECTS
        STRAWBERRY("Strawberry"), BANANA("Banana"), CHOCOLATE("Chocolate"), VANILLA("Vanilla"), LEMON("Lemon"),
        STRACIATELLA("Straciatella"), MOKKA("Mokka"), PISTACHE("Pistache");

        //PROPERTIES
        String balls;

        //CONSTRUCTOR
        Flavor (String balls) {
            this.balls = balls;
        }

        //ToSTRING
        @Override
        public String toString () {
            return balls;
        }
    }
}
