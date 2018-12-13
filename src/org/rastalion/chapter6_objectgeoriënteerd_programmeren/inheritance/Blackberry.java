package org.rastalion.chapter6_objectgeoriënteerd_programmeren.inheritance;

import org.rastalion.chapter6_objectgeoriënteerd_programmeren.encapsulation.Mobile;

/**
 * Created by Mrrobot on 30/03/2018 javaBasics.
 */

public class Blackberry extends Mobile {

    /*
    Added some more constructors in the subclass Blackberry
     */
    public Blackberry (String manufacturer) {
        this(manufacturer, "", "", 499);
    }

    public Blackberry (String manufacturer, String os) {
        this(manufacturer, os, "", 499);
    }

    public Blackberry (String manufacturer, String os, String model) {
        this(manufacturer, os, model, 499);
    }

    public Blackberry (String manufacturer, String os, String model, int cost) {
        //You atleast need 1 super call
        super(manufacturer, os, model, cost);
    }

    /*
    The ringMobile method is specific to each Subclass so Override that method
    like seen beneath.
     */
    @Override
    public void ringMobile () {
        System.out.println("This is the ringtone of a Blackberry");
    }

    @Override
    public String toString () {
        return "Blackberry{" +
                "manufacturer='" + manufacturer + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }
}
