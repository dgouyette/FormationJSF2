package com.societe.managedbeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class HelloworldManagedbean {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloworldManagedbean.class);

    private String qui;

    private String message;


    private String email="";

    public String direBonjour() {
        LOGGER.info("Dit bonjour : {}", qui);
        message = "Bonjour " + qui;
        return "index";
    }


    public String getQui() {

        return qui;
    }

    public void setQui(String qui) {
        this.qui = qui;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
