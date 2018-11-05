/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hung.example;

import com.hung.session.UsersFacadeLocal;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hungn
 */
@WebService(serviceName = "LoginService")
public class LoginService {
    @EJB
    private UsersFacadeLocal usersFacede;
    @WebMethod
    public String hello(@WebParam(name = "name") String txt){
        return "Hello" + txt +" +!";        
    }
    @WebMethod
    public boolean checkLogin(@WebParam(name = "username") String username, @WebParam(name = "password")String password){
        return usersFacede.checkLogin(username, password);
    }

    
}
