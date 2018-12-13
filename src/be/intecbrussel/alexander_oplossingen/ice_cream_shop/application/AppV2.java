package be.intecbrussel.alexander_oplossingen.ice_cream_shop.application;
/*
THERE ARE 2 POSSIBILITIES FOR WHEN YOU ORDER MORE ICE-CREAM THAN THERE IS IN STOCK.

1.WHEN EXCEPTION CAUGHT WILL ONLY PRINT MSG AND STOP PROGRAM

2.WHEN PUTTING System.exit(1) IN COMMENT (ORDER METHODS IN IceCreamCar) IT WILL PRINT THE CAUGHT EXCEPTION MSG ABOVE AND
THEN THE REST OF TEXTS
IN THIS CASE PRICE & STOCK WILL BE CALCULATED CORRECTLY , THE ONLY THING THAT I COULDN'T FIX IS THAT THE LIST OF ORDER(S)
SHOULDN'T PRINT THE TEXT OF THE ICE CREAM TYPE(S) THAT AREN'T AVAILABLE IN STOCK
 */

import be.intecbrussel.alexander_oplossingen.ice_cream_shop.eatables.Cone;
import be.intecbrussel.alexander_oplossingen.ice_cream_shop.eatables.Eatable;
import be.intecbrussel.alexander_oplossingen.ice_cream_shop.eatables.Magnum;
import be.intecbrussel.alexander_oplossingen.ice_cream_shop.sellers.*;

import java.time.LocalDate;

public class AppV2 {
    public static void main (String[] args) throws NoMoreIceCreamException {

        //INSTANTIATING
        LocalDate localDate = LocalDate.now();
        PriceList priceList = new PriceList(1, 1.5, 1.8);
        Stock stock = new Stock(1, 4, 3, 5);
        IceCreamSeller creamCar = new IceCreamCar(priceList, stock);


        //FILLING UP ARRAY WITH ORDERS
        Eatable[] cream = new Eatable[5];
        cream[0] = creamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.LEMON, Cone.Flavor.VANILLA, Cone.Flavor.PISTACHE});
        cream[1] = creamCar.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);
        cream[2] = creamCar.orderIceRocket();
        cream[3] = creamCar.orderIceRocket();
        cream[4] = creamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.LEMON, Cone.Flavor.VANILLA, Cone.Flavor.PISTACHE});


        //PRINTING DATE / PRICE LIST / ORDERS / TOTAL PROFIT / STOCK
        System.out.println("             " + localDate + "\n\n");
        System.out.println(creamCar.toString());

        for (int i = 0; i < cream.length; i++) {

            if (cream[i] != null)
                cream[i].eat();

            System.out.println("          <<-->>");
        }

        System.out.println(" \n_______________________________" +
                "\nTotal profit             " + creamCar.getProfit() + " €\n\n");

        System.out.println("\n         <<>>°<<>>\n" +
                "         : STOCK :\n" +
                "         <<>>°<<>>\n\n\n" +
                "Magnum                  " + stock.getMagni() + " pc\n" +
                "Cones                   " + stock.getCones() + " pc\n" +
                "Balls                   " + stock.getBalls() + " pc\n" +
                "Ice Rockets             " + stock.getIceRocket() + " pc");
    }
}
