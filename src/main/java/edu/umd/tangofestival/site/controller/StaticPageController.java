package edu.umd.tangofestival.site.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class StaticPageController {

    private static final Logger log = LoggerFactory.getLogger(StaticPageController.class);

    @RequestMapping
    public String showStaticPage(HttpServletRequest request) {
        return "";
    }

    private String getViewTemplatePathFromUrl(HttpServletRequest request) {
        return null;
    }
}
