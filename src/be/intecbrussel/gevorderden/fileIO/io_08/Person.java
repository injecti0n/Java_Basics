package io_08;

import java.io.*;
import java.time.*;
import java.util.*;

public class Person implements Serializable {
	private String firstName;

	private String lastName;

	private LocalDate birthDay;

	private transient Timer hartbeat;

	public Person(String fname, String lname, LocalDate birthDay) {
		this.firstName = fname;
		this.lastName = lname;
		this.birthDay = birthDay;
		hartbeat = new Timer(true);
		hartbeat.scheduleAtFixedRate(new Hartbeat(), 0, 1000);
	}

	private class Hartbeat extends TimerTask {
		public void run() {
			System.out.print("*");
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}
}
