package ru.softwerke.model;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Client entity
 */

public class Client {
    private static AtomicInteger atomicInteger = new AtomicInteger(0);
    private int clientId;
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate birthDate;

    public int getClientId() {
        return clientId;
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

    @Override
    public String toString() {
        return "Client: " +
                "Id= " + clientId +
                ", Name= '" + firstName + '\'' +
                ", Surname= '" + lastName + '\'' +
                ", Middle name = '" + middleName + '\'' +
                ", Date of birth - '" + birthDate +"'";
    }

    /**
     * Use of pattern builder to reduce string length and to be confident in order of client create
     *
     * @param builder
     */

    private Client(Builder builder) {
        this.clientId = atomicInteger.incrementAndGet();
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.birthDate = builder.birthDate;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String middleName;
        private LocalDate birthDate;

        public Builder() {}

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Client build() {
            return new Client(this);
        }
    }
}
