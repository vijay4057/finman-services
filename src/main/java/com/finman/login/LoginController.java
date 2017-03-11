package com.finman.login;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginInfo(@RequestBody LoginDTO loginDTO, HttpSession session) {
        if (session.getAttribute("SESSION_USER") != null) {
            return "home";
        }
        return "login";

    }

}

