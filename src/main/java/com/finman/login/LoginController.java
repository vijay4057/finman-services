package com.finman.login;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginInfo(LoginDTO loginDTO, HttpSession session) {
        if (session.getAttribute("SESSION_USER") != null) {
            return "home";
        }
        return "login";

    }

}

