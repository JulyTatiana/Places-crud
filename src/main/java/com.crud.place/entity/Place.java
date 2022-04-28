package com.crud.place.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Place")
@Table(name = "place")
@Data
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String country;

    private Integer population;
}