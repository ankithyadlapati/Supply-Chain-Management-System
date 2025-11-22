package com.scm.core.domain;


import jakarta.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "products")
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@Column(nullable = false, unique = true)
private String sku;


@Column(nullable = false)
private String name;


private String description;
private BigDecimal weightKg;


public Product() {}


public Product(String sku, String name) {
this.sku = sku;
this.name = name;
}


// getters and setters
public Long getId() { return id; }
public void setId(Long id) { this.id = id; }
public String getSku() { return sku; }
public void setSku(String sku) { this.sku = sku; }
public String getName() { return name; }
public void setName(String name) { this.name = name; }
public String getDescription() { return description; }
public void setDescription(String description) { this.description = description; }
public BigDecimal getWeightKg() { return weightKg; }
public void setWeightKg(BigDecimal weightKg) { this.weightKg = weightKg; }
}
