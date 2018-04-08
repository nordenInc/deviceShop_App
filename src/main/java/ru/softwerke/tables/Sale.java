package ru.softwerke.tables;

import javax.persistence.*;

@Entity
@Table(name = "sale")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "sale_id_generator")
    @SequenceGenerator(name = "sale_id_generator",
            sequenceName = "sale_id")
    private int saleId;



}
