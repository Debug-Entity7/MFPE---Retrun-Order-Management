package com.returnordermanag.packageDeliveryModule.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/packdel")
public class PackDeliveryService {
	
	@SuppressWarnings("unused")
	@Autowired
    private RestTemplate restTemplate;

	
	@RequestMapping("/checkme")
	public String checkme () {
		return "I'm Fine & working!!!!!!";
	}
}
