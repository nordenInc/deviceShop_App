package ru.softwerke.model;

import java.time.LocalDate;

public class Client {
    private static int id = 0;
    private int clientId;
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate birthDate;

    public Client(String firstName, String lastName, String middleName, LocalDate birthDate) {
        this.clientId = id++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthDate = birthDate;
    }

    public Client() {}

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {return middleName; }

    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
