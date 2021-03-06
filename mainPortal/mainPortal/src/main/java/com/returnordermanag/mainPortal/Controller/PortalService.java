package com.returnordermanag.mainPortal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/portal")
public class PortalService {
	
	@SuppressWarnings("unused")
	@Autowired
    private RestTemplate restTemplate;
	
	@RequestMapping("/checkme")
	public String checkme () {
		return "I'm Fine & working!!!!!!";
	}

}
