package org.workholick.sip.service.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.workholick.sip.service.model.impl.MutualFund;
import org.workholick.sip.service.model.impl.MutualFundSchemeDetails;
import org.workholick.sip.service.services.ApiService;
import org.workholick.sip.service.services.MutualFundService;

import java.util.Collection;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 11-03-2022
 **/
@Service
public class MutualFundServiceImpl implements MutualFundService {

    @Autowired
    private ApiService apiService;

    @Override
    public Collection<MutualFund> listAllMutualFunds() {
        return null;
    }

    @Override
    public MutualFundSchemeDetails getMutualFundDetails(Long schemeCode) {
        return null;
    }

    @Override
    public Collection<MutualFund> searchMutualFund(String schemeName) {
        return null;
    }
}
