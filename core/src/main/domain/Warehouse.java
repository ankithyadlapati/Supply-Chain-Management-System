package com.scm.core.domain;


import jakarta.persistence.*;


@Entity
@Table(name = "warehouses")
public class Warehouse {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@Column(nullable = false, unique = true)
private String code;


private String name;
private String address;
private double latitude;
private double longitude;


// capacity, zone, lead times
private int c
