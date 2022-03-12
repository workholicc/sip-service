package org.workholick.sip.service.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.workholick.sip.service.entities.Login;
import org.workholick.sip.service.model.impl.LoginModel;
import org.workholick.sip.service.repos.RegistrationRepo;

import java.util.Locale;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 01-03-2022
 **/
@Service
@Transactional
public class RegistrationService<T extends LoginModel> implements org.workholick.sip.service.services.RegistrationService<T> {

    @Autowired
    private RegistrationRepo repo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public boolean isValidRequest(T model) {
        Login login=repo.findByUserName(model.getUserName().toUpperCase(Locale.ROOT));
        if(login==null || login.getId()==null){
            if(model.getPassword()!=null && model.getConfirmPassword()!=null){
                if(model.getPassword().equals(model.getConfirmPassword()) && model.getPassword().trim().length()>5)
                    return true;
            }
        }
        return false;
    }

    @Override
    public void doRegister(T model) {
        Login login=new Login();
        login.setUserName(model.getUserName());
        login.setPassword(passwordEncoder.encode(model.getPassword()));
        repo.save(login);
    }
}
