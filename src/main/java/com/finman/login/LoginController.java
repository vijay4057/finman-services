package com.finman.login;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

@Controller
public class LoginController {

    @ApiOperation(value = "/login", httpMethod = "GET")
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginInfo(@ApiParam(value = "loginDTO", required = true) LoginDTO loginDTO, HttpSession session) {
        if (session.getAttribute("SESSION_USER") != null) {
            return "home";
        }
        return "login";

    }

}

