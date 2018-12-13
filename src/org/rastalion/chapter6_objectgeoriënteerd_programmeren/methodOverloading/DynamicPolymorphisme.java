package org.rastalion.chapter6_objectgeoriënteerd_programmeren.methodOverloading;

import org.rastalion.chapter6_objectgeoriënteerd_programmeren.encapsulation.Mobile;
import org.rastalion.chapter6_objectgeoriënteerd_programmeren.inheritance.Android;
import org.rastalion.chapter6_objectgeoriënteerd_programmeren.inheritance.Blackberry;

public class DynamicPolymorphisme {

    public static void main (String[] args) {

        //Creating obj of Mobile
        Mobile mobile = new Mobile("Nokia", "Windows 8", "Lumnia", 10_000);

        //Creating Object of Sublcass Android
        Mobile droidy = new Android("Samsung", "Android", "S8", 100_000);

        //Creating Object of Sublcass Blackberry
        Mobile berry = new Blackberry("Blackberry", "RIM", "Curve", 200_000);

        ringPhone(mobile);
        ringPhone(droidy);
        ringPhone(berry);

    }

    public static void ringPhone (Mobile device) {
        device.ringMobile();
    }

}
