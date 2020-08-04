package com.lass.dynamictemplateemail.service;

import com.lass.dynamictemplateemail.configs.email.SimpleEmailTemplateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

@Service
public class RenderEmailTemplateService {

    private static final String SIMPLE_EMAIL = "simple-email";

    @Autowired
    private SpringTemplateEngine thymeleafTemplateEngine;

    public String renderSimpleEmail(String name, Long price){
        SimpleEmailTemplateModel simpleEmailTemplateModel = new SimpleEmailTemplateModel(name,price);
        Context thymeleafContext = new Context();
        thymeleafContext.setVariable("product", simpleEmailTemplateModel);
        return thymeleafTemplateEngine.process(SIMPLE_EMAIL, thymeleafContext);
    }
}
