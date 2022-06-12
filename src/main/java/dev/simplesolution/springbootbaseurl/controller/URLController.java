package dev.simplesolution.springbootbaseurl.controller;

import dev.simplesolution.springbootbaseurl.util.UrlUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class URLController {

    @GetMapping("/getBaseUrl")
    public String getBaseUrl(HttpServletRequest request) {
        String baseUrl = UrlUtil.getBaseUrl(request);
        return baseUrl;
    }
}
