package com.lass.dynamictemplateemail.configs.email;

// representation of data in the thymeleaf template
public class SimpleEmailTemplateModel {

    private String name;
    private Long price;

    public SimpleEmailTemplateModel(String name, Long price) {
        this.name = name;
        this.price = price;
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
