package org.workholick.sip.service.services;

import org.reactivestreams.Subscriber;
import org.workholick.sip.service.model.Context;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 10-03-2022
 **/
public interface ApiService {

    /**
     * Connects and reads mutual fund data.
     * @param subscriber
     */
    public void readAllMutualFunds(Context context,Subscriber subscriber);

    /**
     * search for mutual funds.
     * @param subscriber
     */
    public void searchMutualFund(Context context,String schemeName,Subscriber subscriber);

    /**
     * Get mutual funds details based on scheme code.
     * @param schemeCode
     * @param subscriber
     */
    public void getMutualFundDetails(Context context,Long schemeCode, Subscriber subscriber);

}
