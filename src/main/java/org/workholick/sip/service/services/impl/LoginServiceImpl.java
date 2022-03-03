package org.workholick.sip.service.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.workholick.sip.service.entities.Login;
import org.workholick.sip.service.model.http.impl.LoginModel;
import org.workholick.sip.service.model.http.impl.UserModel;
import org.workholick.sip.service.repos.RegistrationRepo;
import org.workholick.sip.service.services.LoginService;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 03-03-2022
 **/
@Service
@Transactional
public class LoginServiceImpl<T extends LoginModel, R extends UserModel> implements LoginService<T,R> {

    @Autowired
    private RegistrationRepo repo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public R doLogin(T model) {
        Login login=repo.findByUserName(model.getUserName());
        if(login==null || login.getUserName()==null)
            return null;
        if(passwordEncoder.matches(login.getPassword(), model.getPassword())){
            UserModel userModel=new UserModel();
            userModel.setUserName(login.getUserName());
            return (R) userModel;
        }
        return null;

    }
}
