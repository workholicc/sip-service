package org.workholick.sip.service.model.impl;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 01-03-2022
 **/
@Getter
@Setter
public class LoginModel {

    private String userName;

    private String password;

    private String confirmPassword;

}
