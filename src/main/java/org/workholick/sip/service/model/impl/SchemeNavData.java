package org.workholick.sip.service.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 10-03-2022
 **/
@Getter
@Setter
public class SchemeNavData {

    @JsonProperty("date")
    private Date date;

    @JsonProperty("nav")
    private Double nav;
}
