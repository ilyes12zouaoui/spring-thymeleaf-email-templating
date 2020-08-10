package com.lass.dynamictemplateemail.resource;

import com.lass.dynamictemplateemail.service.RenderEmailTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/emails")
public class Home {

    @Autowired
    private RenderEmailTemplateService renderEmailTemplateService;

    @GetMapping("/simple-email-1")
    public String simpleEmail1() {
        //return the rendered page as a string;
        return renderEmailTemplateService.renderSimpleEmail("BMW", 200L, LocalDate.of(1994, 1, 12));
    }


    @GetMapping("/simple-email-2")
    public String simpleEmail2() {
        return renderEmailTemplateService.renderSimpleEmail("BMW", 100L,LocalDate.of(1994, 1, 12));
    }
}
