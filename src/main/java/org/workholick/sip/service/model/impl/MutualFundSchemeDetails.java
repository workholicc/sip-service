package org.workholick.sip.service.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 10-03-2022
 **/

@Getter
@Setter
public class MutualFundSchemeDetails {

    @JsonProperty("meta")
    private SchemeMetaInfo meta;

}
