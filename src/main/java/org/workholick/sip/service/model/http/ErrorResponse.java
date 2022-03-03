package org.workholick.sip.service.model.http;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 01-03-2022
 **/
public interface ErrorResponse extends Response{

    public default String getMessage(){
        return "Internal server error.";
    }

}
