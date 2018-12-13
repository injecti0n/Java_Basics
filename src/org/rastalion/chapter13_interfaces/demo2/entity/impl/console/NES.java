package org.rastalion.chapter13_interfaces.demo2.entity.impl.console;

import org.rastalion.chapter13_interfaces.demo2.entity.abstractClasses.Nintendo;
import org.rastalion.chapter13_interfaces.demo2.entity.interfaces.VideoGame;

/**
 * Created by Mrrobot on 7/11/2017 videogame consoles.
 */
public class NES extends Nintendo {

    @Override
    public void insertGame (VideoGame game) {

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

}
