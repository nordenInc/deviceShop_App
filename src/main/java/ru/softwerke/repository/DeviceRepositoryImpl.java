package ru.softwerke.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.softwerke.tables.Client;
import ru.softwerke.tables.Device;

import java.math.BigDecimal;

public class DeviceRepositoryImpl implements DeviceRepository {

    private final SessionFactory factory;

    public DeviceRepositoryImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public Device create(String manufacturer, String deviceType, String model, String color, BigDecimal devicePrice) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Device device = new Device();
        device.setManufacturer(manufacturer);
        device.setDeviceType(deviceType);
        device.setModel(model);
        device.setColor(color);
        device.setDevicePrice(devicePrice);

        session.persist(device);

        transaction.commit();
        session.close();

        return device;
    }
}
