package ru.softwerke.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.softwerke.tables.Client;

import java.time.LocalDate;

public class ClientRepositoryImpl implements ClientRepository {

    private final SessionFactory factory;

    public ClientRepositoryImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public Client create(String firstName, String lastName, String middleName, LocalDate birthDate) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Client client = new Client();
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setMiddleName(middleName);
        client.setBirthDate(birthDate);

        session.persist(client);

        transaction.commit();
        session.close();

        return client;
    }
}
