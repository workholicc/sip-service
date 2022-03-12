package org.workholick.sip.service.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.workholick.sip.service.model.http.Response;
import org.workholick.sip.service.model.http.SuccessResponse;
import org.workholick.sip.service.model.impl.LoginModel;
import org.workholick.sip.service.model.impl.UserModel;
import org.workholick.sip.service.services.LoginService;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 01-03-2022
 **/
@RestController
@RequestMapping(path = "/v1/login.json")
public class LoginController {

    @Autowired
    private LoginService<LoginModel, UserModel> loginService;

    @PostMapping
    public Response doLogin(@RequestBody LoginModel login){
        return new SuccessResponse() {
            public UserModel getUserDetails(){
                return loginService.doLogin(login);
            }
        };
    }

}
