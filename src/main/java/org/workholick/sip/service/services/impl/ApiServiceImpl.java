package org.workholick.sip.service.services.impl;

import org.reactivestreams.Subscriber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.workholick.sip.service.model.Context;
import org.workholick.sip.service.services.ApiService;
import org.workholick.sip.service.util.Util;
import org.workholick.sip.service.util.WebClientUtility;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 11-03-2022
 **/
@Service
public class ApiServiceImpl implements ApiService {

    @Value("${mutual.fund.api.base.url}")
    private String mfBaseUrl;

    @Value("${mutual.fund.api.search.url}")
    private String mfSearchUrl;

    @Value("${mutual.fund.api.list.url}")
    private String listAllMfUrl;

    @Value("${mutual.fund.api.details.url}")
    private String mfDetailsUrl;

    private final Map<String,String> headers;

    {
        headers=new HashMap<String,String>(2){{this.put(Util.CONTENT_TYPE_HEADER_NAME, MediaType.APPLICATION_JSON_VALUE);
            this.put(Util.ACCEPT_HEADER, MediaType.APPLICATION_JSON_VALUE);}};
    }

    @Override
    public void readAllMutualFunds(Context context,Subscriber subscriber) {
        WebClientUtility.getWebClient(mfBaseUrl,headers).get().uri(listAllMfUrl).retrieve().bodyToFlux((Class<? extends Object>) context.get(Util.RESPONSE_CLASS_TYPE)).subscribe(subscriber);
    }

    @Override
    public void searchMutualFund(Context context,String schemeName, Subscriber subscriber) {
        WebClientUtility.getWebClient(mfBaseUrl,headers).get().uri(mfSearchUrl+schemeName).retrieve().bodyToFlux((Class<? extends Object>) context.get(Util.RESPONSE_CLASS_TYPE)).subscribe(subscriber);
    }

    @Override
    public void getMutualFundDetails(Context context,Long schemeCode, Subscriber subscriber) {
        WebClientUtility.getWebClient(mfBaseUrl,headers).get().uri(mfDetailsUrl+schemeCode).retrieve().bodyToFlux((Class<? extends Object>) context.get(Util.RESPONSE_CLASS_TYPE)).subscribe(subscriber);
    }
}
