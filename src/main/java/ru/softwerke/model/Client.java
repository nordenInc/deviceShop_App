package ru.softwerke.model;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;


import static sun.net.InetAddressCachePolicy.get;

public class Client {
    private static int id = 0;
    private int clientId;
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate birthDate;

//    public Client(String firstName, String lastName, String middleName, LocalDate birthDate) {
//        this.clientId = id++;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.middleName = middleName;
//        this.birthDate = birthDate;
//    }

    public Client() {}

    private Client(Builder builder) {
        this.clientId = id++;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.birthDate = builder.birthDate;
    }

    public static class Builder {
        private int clientId;
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

    @Override
    public String toString() {
        return "Client: " +
                "Id= " + clientId +
                ", Name= '" + firstName + '\'' +
                ", Surname= '" + lastName + '\'' +
                ", Middle name = '" + middleName + '\'' +
                ", Date of birth - '" + birthDate +"'";
    }

    //    private final AtomicLong value = new AtomicLong(0L);
//    public long get() {
//        return value.get();
//    }
//    public long incrementAndGet() {
//        for (;;) {
//            long current = get();
//            long next = current + 1;
//            if (compareAndSet(current, next))
//                return next;
//        }
//    }
//    public boolean compareAndSet(final long current, final long next) {
//        if (value.compareAndSet(current, next)) {
//            return true;
//        } else {
//            LockSupport.parkNanos(1);
//            return false;
//        }
//    }

}
