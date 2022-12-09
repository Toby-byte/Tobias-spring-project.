package com.example.tobias_spring_project.Prices;

import javax.persistence.*;
// Skrevet af Tobias
@Entity
@Table
// Er til database
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "price_id", nullable = false)
    private Long price_id;
    private String item;
    private Integer price;

    public Long getPrice_id() {
        return price_id;
    }

    public void setPrice_id(Long price_id) {
        this.price_id = price_id;
    }

    public Price() {
    }

    // Constructor with id
    public Price(Long id, String item, Integer price) {
        this.price_id = id;
        this.item = item;
        this.price = price;
    }

    // Constructor without id
    public Price(String item, Integer price) {
        this.item = item;
        this.price = price;
    }

    public Long getId() {
        return price_id;
    }

    public void setId(Long id) {
        this.price_id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "id=" + price_id +
                ", item='" + item + '\'' +
                ", price=" + price +
                '}';
    }
}
