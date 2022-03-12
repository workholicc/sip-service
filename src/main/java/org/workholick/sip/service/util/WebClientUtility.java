package org.workholick.sip.service.util;

import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 06-03-2022
 **/
public class WebClientUtility {

    public static WebClient getWebClient(String baseUrl, Map<String, String> headers){
        WebClient.Builder builder= WebClient.builder();
        if(headers!=null)
            headers.entrySet().forEach(entrySet->builder.defaultHeader(entrySet.getKey(), entrySet.getValue()));
        return builder.baseUrl(baseUrl).build();
    }

}
