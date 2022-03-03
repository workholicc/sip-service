package org.workholick.sip.service.services;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 01-03-2022
 **/
public interface RegistrationService< T extends Object > {

    /**
     * validates given model.
     * @param model
     * @return
     */
    public boolean isValidRequest(T model);

    /**
     * Register user.
     * @param model
     */
    public void doRegister(T model);

}
