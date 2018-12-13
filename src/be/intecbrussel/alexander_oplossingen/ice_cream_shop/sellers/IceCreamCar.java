package be.intecbrussel.alexander_oplossingen.ice_cream_shop.sellers;


import be.intecbrussel.alexander_oplossingen.ice_cream_shop.eatables.Cone;
import be.intecbrussel.alexander_oplossingen.ice_cream_shop.eatables.IceRocket;
import be.intecbrussel.alexander_oplossingen.ice_cream_shop.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {
    //PROPERTIES
    private PriceList priceList;
    private Stock stock;
    private double profit;

    //CONSTRUCTOR
    public IceCreamCar (PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    //METHODS ORDER / PREPARE CONE / PROFIT
    @Override
    public Cone orderCone (Cone.Flavor[] balls) throws NoMoreIceCreamException {
        int stockBalls = stock.getBalls();
        int stockCones = stock.getCones();

        try {
            if (stockCones < 0 || stockBalls < balls.length) {
                profit += stock.getBalls() * priceList.getBallPrice();
                throw new NoMoreIceCreamException();
            } else {
                profit += balls.length * priceList.getBallPrice();
                stock.setBalls(stock.getBalls() - balls.length);
                stock.setCones(stock.getCones() - 1);
            }

        } catch (NoMoreIceCreamException re) {

            System.out.println("The last ordered flavor(s) is out of stock\n");
        }
        return prepareCone(balls);
    }

    private Cone prepareCone (Cone.Flavor[] balls) {
        return new Cone(balls);
    }

    @Override
    public IceRocket orderIceRocket () throws NoMoreIceCreamException {
        try {
            if (stock.getIceRocket() <= 0) {
                stock.getIceRocket();
                throw new NoMoreIceCreamException("below stock");
            } else {
                profit += priceList.getRocketPrice();
                stock.setIceRocket(stock.getIceRocket() - 1);
            }
        } catch (NoMoreIceCreamException ne) {
            System.out.println("The last ordered ice rocket is out of stock\n");
//            System.exit(1);
        }
        return prepareRocket();
    }

    private IceRocket prepareRocket () {
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum (Magnum.MagnumType type) throws NoMoreIceCreamException {

        try {
            if (stock.getMagni() <= 0) {
                stock.getMagni();
                throw new NoMoreIceCreamException("Below stock");
            } else {
                if (type.equals(Magnum.MagnumType.ALPINENUTS)) {
                    profit += priceList.getMagnumPrice() * 2;
                } else {
                    profit += priceList.getMagnumPrice();
                }
                stock.setMagni(stock.getMagni() - 1);
            }
        } catch (NoMoreIceCreamException ne) {
            System.out.println("The last ordered  magnum is out of stock\n");
            System.exit(1);
        }
        return prepareMagnum(type);
    }


    private Magnum prepareMagnum (Magnum.MagnumType type) {
        return new Magnum(type);
    }

    @Override
    public double getProfit () {
        return profit;
    }

    @Override
    public String toString () {
        return "   <>> ICE-CREAM CAR PEDRO <>>\n" +
                "\n\n         <>>><<<>>><<>\n" +
                "         : PriceList :" +
                "\n         <>>><<<>>><<>\n\nCone                       " + priceList.getBallPrice() + " €\n" +
                "Ice Rocket                 " + priceList.getRocketPrice() +
                " €\nMagnum                     " + priceList.getMagnumPrice() + " €\n" +
                "Magnum Alpine nuts         " + (priceList.getMagnumPrice() * 2) + " €\n\n\n" +
                "           ORDER(S)\n" +
                "       <>>><<<>>><<<>>>\n\n";
    }
}
