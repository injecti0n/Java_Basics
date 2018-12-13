package org.rastalion.chapter6_objectgeoriënteerd_programmeren.inheritance;

import org.rastalion.chapter6_objectgeoriënteerd_programmeren.encapsulation.Mobile;

/**
 * Created by Mrrobot on 30/03/2018 javaBasics.
 */
public class Android extends Mobile {

    /*
    You need atleast one super reference to the mobile constructor,
    in every subclass of Mobile
     */
    public Android (String manufacturer, String os, String model, int cost) {
//        this.model = "new model"; first the super constructor needs to be called
        super(manufacturer, os, model, cost);
    }

    @Override
    public void ringMobile () {
        System.out.println("This is the ringtone of a Android");
    }

    @Override
    public String toString () {
        return "Android{" +
                "manufacturer='" + manufacturer + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }
}
