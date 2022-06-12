package dev.simplesolution.springbootbaseurl.util;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;

public class UrlUtil {

    /**
     * This method to get base URL of the application
     * @param request the HttpServletRequest object
     * @return the base URL
     */
    public static String getBaseUrl(HttpServletRequest request) {
        String baseUrl = ServletUriComponentsBuilder
                .fromRequestUri(request)
                .replacePath(null)
                .build()
                .toUriString();

        return baseUrl;
    }
}
