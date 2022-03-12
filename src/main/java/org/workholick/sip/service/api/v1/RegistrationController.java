package org.workholick.sip.service.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.workholick.sip.service.model.http.ErrorResponse;
import org.workholick.sip.service.model.http.Response;
import org.workholick.sip.service.model.http.SuccessResponse;
import org.workholick.sip.service.model.impl.LoginModel;
import org.workholick.sip.service.services.RegistrationService;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 01-03-2022
 **/
@RestController
@RequestMapping(path = "/v1/register.json")
public class RegistrationController {

    @Autowired
    private RegistrationService<LoginModel> registrationService;

    @PostMapping
    public Response doRegistration(@RequestBody LoginModel login){
        if(registrationService.isValidRequest(login)){
            registrationService.doRegister(login);
            return new SuccessResponse() {
            };
        }else{
            return new ErrorResponse(){

            } ;
        }

    }

}
