package org.workholick.sip.service.model.http;

import org.springframework.http.HttpStatus;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 01-03-2022
 **/
public interface Response {

    public default int getCode(){
        return HttpStatus.OK.value();
    }

}
