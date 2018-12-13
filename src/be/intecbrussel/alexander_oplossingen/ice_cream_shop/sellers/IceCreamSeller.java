package be.intecbrussel.alexander_oplossingen.ice_cream_shop.sellers;

import be.intecbrussel.alexander_oplossingen.ice_cream_shop.eatables.Cone;
import be.intecbrussel.alexander_oplossingen.ice_cream_shop.eatables.IceRocket;
import be.intecbrussel.alexander_oplossingen.ice_cream_shop.eatables.Magnum;

public interface IceCreamSeller extends Profitable {

    //ABSTRACT METHODS
    Cone orderCone (Cone.Flavor[] balls);

    IceRocket orderIceRocket ();

    Magnum orderMagnum (Magnum.MagnumType type);


}
