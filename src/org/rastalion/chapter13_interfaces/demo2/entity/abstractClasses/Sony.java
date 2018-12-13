package org.rastalion.chapter13_interfaces.demo2.entity.abstractClasses;

import org.rastalion.chapter13_interfaces.demo2.entity.enums.AdapterCable;
import org.rastalion.chapter13_interfaces.demo2.entity.enums.Controller;
import org.rastalion.chapter13_interfaces.demo2.entity.enums.OutputCable;
import org.rastalion.chapter13_interfaces.demo2.entity.interfaces.VideoGameConsole;

/**
 * Created by Mrrobot on 7/11/2017 videogame consoles.
 */
public abstract class Sony implements VideoGameConsole {

    private String manFactor = "Microsoft";
    private AdapterCable adpCable = null;
    private OutputCable outCable = null;
    private Controller contrl = null;

    private String description = "";
    private String nameConsole = "";

    boolean deviceWorking = false;

    public void setManFactor (String manFactor) {
        this.manFactor = manFactor;
    }

    public AdapterCable getAdpCable () {
        return adpCable;
    }

    public void setAdpCable (AdapterCable adpCable) {
        this.adpCable = adpCable;
    }

    public OutputCable getOutCable () {
        return outCable;
    }

    public void setOutCable (OutputCable outCable) {
        this.outCable = outCable;
    }

    public Controller getContrl () {
        return contrl;
    }

    public void setContrl (Controller contrl) {
        this.contrl = contrl;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public String getNameConsole () {
        return nameConsole;
    }

    public void setNameConsole (String nameConsole) {
        this.nameConsole = nameConsole;
    }

    public boolean isDeviceWorking () {
        return deviceWorking;
    }

    public void setDeviceWorking (boolean deviceWorking) {
        this.deviceWorking = deviceWorking;
    }

    public String getManFactor () {
        return manFactor;
    }

}
