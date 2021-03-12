package com.returnordermanag.webPortal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.returnordermanag.webPortal.client.AuthenticationFeignClient;
import com.returnordermanag.webPortal.model.AuthenticationRequest;
import com.returnordermanag.webPortal.model.AuthenticationResponse;
import com.returnordermanag.webPortal.service.LoginService;

@Controller
public class HomeController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private AuthenticationRequest authenticationRequest;

	@Autowired
	private AuthenticationResponse authenticationResponse;

	@Autowired
	private AuthenticationFeignClient authenticationFeignClient;

	@RequestMapping("/")
	public String Open() {

		return "login.jsp";
	}

	@RequestMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password) {

		authenticationRequest.setUsername(username);
		authenticationRequest.setPassword(password);

		authenticationResponse = authenticationFeignClient.createAuthenticationToken(authenticationRequest);

		String jwtToken = authenticationResponse.getJwtToken();
		boolean isValid = authenticationResponse.getValid();
		int userID = 101; //authenticationResponse.getUserID();

		loginService.createUser(userID, username, password, jwtToken, isValid);

		if (authenticationResponse.getValid())
			return "home.jsp";

		return "login.jsp";

	}
}