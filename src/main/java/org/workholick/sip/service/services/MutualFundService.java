package org.workholick.sip.service.services;

import org.workholick.sip.service.model.impl.MutualFund;
import org.workholick.sip.service.model.impl.MutualFundSchemeDetails;

import java.util.Collection;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 10-03-2022
 **/
public interface MutualFundService {

    /**
     * Returns all the mutual funds available.
     * @return
     */
    public Collection<MutualFund> listAllMutualFunds();

    /**
     * returns mutual funds details based on scheme code.
     * @param schemeCode
     * @return
     */
    public MutualFundSchemeDetails getMutualFundDetails(Long schemeCode);

    /**
     * Search mutual fund using its name.
     * @param schemeName
     * @return
     */
    public Collection<MutualFund> searchMutualFund(String schemeName);
}
