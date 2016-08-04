package com.finman.login;

import javax.servlet.http.HttpSession;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getLoginInfo(LoginDTO loginDTO, HttpSession session) {
		if (session.getAttribute("SESSION_USER") != null) {
			return "home";
		}
		return "login";

	}
}
