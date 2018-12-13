package org.rastalion.chapter13_interfaces.demo2.entity.impl.console;


import org.rastalion.chapter13_interfaces.demo2.entity.enums.AdapterCable;
import org.rastalion.chapter13_interfaces.demo2.entity.enums.Controller;
import org.rastalion.chapter13_interfaces.demo2.entity.enums.OutputCable;
import org.rastalion.chapter13_interfaces.demo2.entity.interfaces.VideoGame;
import org.rastalion.chapter13_interfaces.demo2.entity.interfaces.VideoGameConsole;

/**
 * Created by Mrrobot on 7/11/2017 videogame consoles.
 */
public class Emulator implements VideoGameConsole {

    private String manFactor = "Pirate Bay";
    private AdapterCable adpCable;
    private OutputCable outCable;
    private Controller contrl;
    private VideoGame game;

    private String description;
    private String nameConsole;

    private boolean deviceWorking = false;

    public Emulator (String manFactor, AdapterCable adpCable, OutputCable outCable, Controller contrl,
                     String description, String nameConsole) {
        this.manFactor = manFactor;
        this.adpCable = adpCable;
        this.outCable = outCable;
        this.contrl = contrl;
        this.description = description;
        this.nameConsole = nameConsole;
    }

    @Override
    public void insertGame (VideoGame game) {
        this.game = game;
    }

    @Override
    public void startConsole () {

    }

    @Override
    public void saveGame (VideoGame game) {

    }

    @Override
    public void closeGame (VideoGame game) {

    }

    @Override
    public boolean turnOffConsole () {
        return false;
    }

    @Override
    public boolean consoleWorking () {
        return false;
    }

    public void setConsole (VideoGameConsole... arg) {

    }

    public static Emulator downloadEmulator () {
        return new Emulator("Pirate bay", AdapterCable.EMULATOR_ADAPTOR,
                OutputCable.HDMI, Controller.KEYBOARD, "Cheap as fuck",
                "SmartPeopleConsole");
    }

    private void setManFactor (String manFactor) {
        this.manFactor = manFactor;
    }

    private void setAdpCable (AdapterCable adpCable) {
        this.adpCable = adpCable;
    }

    private void setOutCable (OutputCable outCable) {
        this.outCable = outCable;
    }

    private void setContrl (Controller contrl) {
        this.contrl = contrl;
    }

    private void setDescription (String description) {
        this.description = description;
    }

    private void setNameConsole (String nameConsole) {
        this.nameConsole = nameConsole;
    }

    private void setDeviceWorking (boolean deviceWorking) {
        this.deviceWorking = deviceWorking;
    }

    @Override
    public String toString () {
        return "Emulator{" +
                "manFactor='" + manFactor + '\'' +
                ", adpCable=" + adpCable +
                ", outCable=" + outCable +
                ", contrl=" + contrl +
                ", description='" + description + '\'' +
                ", nameConsole='" + nameConsole + '\'' +
                '}';
    }
}
