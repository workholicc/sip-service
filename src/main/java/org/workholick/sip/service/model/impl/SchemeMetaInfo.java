package org.workholick.sip.service.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 10-03-2022
 **/
@Getter
@Setter
public class SchemeMetaInfo {

    @JsonProperty("fund_house")
    private String fundHouse;

    @JsonProperty("scheme_type")
    private String schemeType;

    @JsonProperty("scheme_category")
    private String schemeCategory;

    @JsonProperty("scheme_code")
    private Long schemeCode;

    @JsonProperty("scheme_name")
    private String schemeName;

    @JsonProperty("data")
    private Collection<SchemeNavData> data;

}
