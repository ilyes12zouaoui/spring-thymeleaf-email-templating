package com.lass.dynamictemplateemail.configs.email;

import java.time.LocalDate;

// representation of data in the thymeleaf template
public class SimpleEmailTemplateModel {

    private String name;
    private Long price;
    private LocalDate localDate;

    public SimpleEmailTemplateModel(String name, Long price, LocalDate localDate) {
        this.name = name;
        this.price = price;
        this.localDate = localDate;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
