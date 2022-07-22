package com.test.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Toy {
    @Id
    @JsonProperty
    private Long id;
    @JsonProperty
    private String name;
    @JsonProperty
    private Integer recommendedAge;
    @JsonProperty
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRecommendedAge() {
        return recommendedAge;
    }

    public void setRecommendedAge(Integer recommendedAge) {
        this.recommendedAge = recommendedAge;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
