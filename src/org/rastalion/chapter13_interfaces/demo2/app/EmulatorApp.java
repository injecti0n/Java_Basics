package org.rastalion.chapter13_interfaces.demo2.app;

import org.rastalion.chapter13_interfaces.demo2.entity.impl.console.Emulator;
import org.rastalion.chapter13_interfaces.demo2.entity.impl.videogames.VideoGameCartridge;
import org.rastalion.chapter13_interfaces.demo2.entity.interfaces.VideoGame;

/**
 * Created by Mrrobot on 7/11/2017 videogame consoles.
 */
public class EmulatorApp {

    public static void main (String[] args) {

        Emulator emulator = Emulator.downloadEmulator();
        VideoGameCartridge cartridge = new VideoGameCartridge();
        emulator.insertGame((VideoGame) cartridge);

        System.out.println(emulator);

    }

}
