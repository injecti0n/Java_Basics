package be.intecbrussel.alexander_oplossingen.ice_cream_shop.application;

import be.intecbrussel.alexander_oplossingen.ice_cream_shop.eatables.Cone;
import be.intecbrussel.alexander_oplossingen.ice_cream_shop.eatables.Eatable;
import be.intecbrussel.alexander_oplossingen.ice_cream_shop.eatables.Magnum;
import be.intecbrussel.alexander_oplossingen.ice_cream_shop.sellers.IceCreamSalon;
import be.intecbrussel.alexander_oplossingen.ice_cream_shop.sellers.IceCreamSeller;
import be.intecbrussel.alexander_oplossingen.ice_cream_shop.sellers.NoMoreIceCreamException;
import be.intecbrussel.alexander_oplossingen.ice_cream_shop.sellers.PriceList;

import java.time.LocalDate;

public class IceCreamApp {
    public static void main (String[] args) throws NoMoreIceCreamException {

        //INSTANTIATING
        LocalDate localDate = LocalDate.now();
        PriceList priceList = new PriceList(1, 1.2, 1.5);
        IceCreamSeller seller = new IceCreamSalon(priceList);
        Eatable[] eatables = new Eatable[8];

        //FILLING ARRAY WITH ORDERS
        eatables[0] = seller.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE);
        eatables[1] = seller.orderMagnum(Magnum.MagnumType.ALPINENUTS);
        eatables[2] = seller.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);
        eatables[3] = seller.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);
        eatables[4] = seller.orderIceRocket();
        eatables[5] = seller.orderCone(new Cone.Flavor[]{Cone.Flavor.PISTACHE});
        eatables[6] = seller.orderCone(new Cone.Flavor[]{Cone.Flavor.LEMON, Cone.Flavor.STRAWBERRY});
        eatables[7] = seller.orderCone(new Cone.Flavor[]{Cone.Flavor.MOKKA, Cone.Flavor.CHOCOLATE, Cone.Flavor.VANILLA});


        //PRINTING DATE , PRICE LIST , ORDERS , TOTAL PROFIT
        System.out.println("\n             " + localDate + "\n");
        System.out.println("\n" + seller.toString());

        //PRINTING ORDERS & TOTAL PRICE
        for (int i = 0; i < eatables.length; i++) {
            eatables[i].eat();
            System.out.println("             -  ");
        }
        System.out.println(" \n_______________________________" +
                "\nTotal profit            " + seller.getProfit() + " €");


    }
}
