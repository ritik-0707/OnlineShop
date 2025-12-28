package com.example.demo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private String category;
    private BigDecimal price;
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

    private  String imageName;
    private  String imageType;
    @Lob
    private  byte[] imageDate;


}

/*
INSERT INTO product (id,name, desc, brand, category, price, release_date, available, quantity) VALUES
  (1,'Galaxy S25', 'Flagship smartphone', 'Samsung', 'Smartphones', 999.99, '2025-11-01', TRUE, 150),
  (2,'AirPods Pro 3', 'Noise-cancelling earbuds', 'Apple', 'Audio', 249.00, '2025-09-20', TRUE, 300),
  (3,'ThinkPad X1', 'Ultrabook laptop', 'Lenovo', 'Laptops', 1799.50, '2024-03-15', TRUE, 0);
 */