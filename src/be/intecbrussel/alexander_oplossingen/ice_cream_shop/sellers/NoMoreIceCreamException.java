package be.intecbrussel.alexander_oplossingen.ice_cream_shop.sellers;

public class NoMoreIceCreamException extends RuntimeException {

    public NoMoreIceCreamException () {
        super();
    }

    public NoMoreIceCreamException (String message) {
        super(message);
    }

}
