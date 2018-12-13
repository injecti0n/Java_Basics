package be.intecbrussel.alexander_oplossingen.ice_cream_shop.sellers;

import be.intecbrussel.alexander_oplossingen.ice_cream_shop.eatables.Cone;
import be.intecbrussel.alexander_oplossingen.ice_cream_shop.eatables.IceRocket;
import be.intecbrussel.alexander_oplossingen.ice_cream_shop.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller {

    //DECLARATIONS
    private PriceList priceList;
    private double totalProfit;

    //CONSTRUCTOR
    public IceCreamSalon (PriceList priceList) {
        this.priceList = priceList;
    }

    //METHODS FOR ORDERS / TOTAL PROFIT
    @Override
    public Cone orderCone (Cone.Flavor[] balls) {
        totalProfit += priceList.getBallPrice() * balls.length;
        return new Cone(balls);
    }

    @Override
    public IceRocket orderIceRocket () {
        totalProfit += priceList.getRocketPrice();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum (Magnum.MagnumType type) {
        if (type.equals(Magnum.MagnumType.ALPINENUTS)) {
            totalProfit += priceList.getMagnumPrice() * 2;
        } else {
            totalProfit += priceList.getMagnumPrice();
        }
        return new Magnum(type);
    }

    @Override
    public double getProfit () {
        return totalProfit;
    }

    //ToSTRING
    @Override
    public String toString () {
        return "    <>> ICE-CREAM SALON AMANITA <>>\n" +
                "\n\n          <>>><<<>>><<>\n" +
                "          : PriceList :" +
                "\n          <>>><<<>>><<>\n\nCone                       " + priceList.getBallPrice() + " €\n" +
                "Ice Rocket                 " + priceList.getRocketPrice() +
                " €\nMagnum                     " + priceList.getMagnumPrice() + " €\n" +
                "Magnum Alpine nuts         " + (priceList.getMagnumPrice() * 2) + " €\n\n\n" +
                "            ORDER(S)\n" +
                "        <>>><<<>>><<<>>>\n\n";

    }
}
