package ru.softwerke.repository;

import ru.softwerke.tables.Client;

import java.time.LocalDate;

public interface ClientRepository {
    Client create(String firstName, String lastName, String middleName, LocalDate birthDate);



}
