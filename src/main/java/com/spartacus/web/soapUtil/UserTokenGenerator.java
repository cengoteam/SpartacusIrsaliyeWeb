package com.spartacus.web.soapUtil;


import com.spartacus.web.soap.Integration10Soap;
import com.spartacus.web.soap.ModuleType;
import com.sun.xml.ws.fault.ServerSOAPFaultException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserTokenGenerator {
    @Value("${username.softnet}")
    private static String username;
    @Value("${password.softnet}")
    private static String password;
    public static String generateUserToken(){
        Integration10Soap client = SoapClient.getClient();
        String userToken = "";
        try{
            userToken  = client.createUserToken(username, password, ModuleType.E_DISPATCH);
        }catch(ServerSOAPFaultException e){
            System.out.println("System Cannot Receive Token");
            System.out.println("Error message is: " + e.getMessage());
            System.exit(-1);
        }
        return userToken;

    }
}
