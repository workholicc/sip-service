package org.workholick.sip.service.services;

import org.workholick.sip.service.model.http.impl.UserModel;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 01-03-2022
 **/
public interface LoginService <T extends Object, R extends UserModel>{

    /**
     * login
     * @param model
     * @return
     */
    public R doLogin(T model);

}
