package org.rastalion.chapter21_lezen_en_schrijven.serializable.demo2;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Mrrobot on 5/06/2018 javabasics-workspace.
 */
public class PersonHeartbeat implements Serializable {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private transient Timer heartbeat;

    public PersonHeartbeat (String firstName, String lastName, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        heartbeat = new Timer(true);
        heartbeat.scheduleAtFixedRate(new HeartBeat(),0,1000);
    }

    private class HeartBeat extends TimerTask {
        @Override
        public void run () {
            System.out.println("*");
        }
    }

    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public LocalDate getBirthday () {
        return birthday;
    }

}
