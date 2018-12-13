package be.intecbrussel.alexander_oplossingen.ice_cream_shop.eatables;

public class Magnum implements Eatable {

    //DECLARATION
    private MagnumType type;

    //CONSTRUCTORS
    public Magnum () {
    }

    public Magnum (MagnumType type) {
        this.type = type;
    }

    public MagnumType getType () {
        return type;
    }

    //METHOD
    @Override
    public void eat () {
        System.out.println("       " + getType());
    }

    //INNER CLASS
    public enum MagnumType {
        MILKCHOCOLATE("Milk Chocolate"), WHITECHOCOLATE("White Chocolate"), BLACKCHOCOLATE("Black Chocolate"),
        ALPINENUTS("Alpine Nuts"), ROMANTICSTRAWBERRIES("Romantic Strawberries");

        //PROPERTIES
        String description;

        //CONSTRUCTOR
        private MagnumType (String description) {
            this.description = description;
        }

        //GETTER
        public String getDescription () {
            return description;
        }

        @Override
        public String toString () {
            return getDescription();
        }
    }
}
