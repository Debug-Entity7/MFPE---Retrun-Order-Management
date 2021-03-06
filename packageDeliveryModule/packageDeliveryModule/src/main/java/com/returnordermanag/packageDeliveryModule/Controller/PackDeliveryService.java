package com.returnordermanag.packageDeliveryModule.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/packdel")
public class PackDeliveryService {
	
	@SuppressWarnings("unused")
	@Autowired
    private RestTemplate restTemplate;
	
	@RequestMapping("/params/{cType}/{count}")
	public Map<String, String> packageDelivery(@PathVariable("cType") String cType, @PathVariable("count") int count) {
		float totalCharge;
		HashMap<String, String> map = new HashMap<>();
		if(!(cType.isEmpty()) && count > 0) {
			if (cType.equals("Integral")) 
			{
				totalCharge = (count * 200) + (count * 100);
				map.put("Pack&DelCahrge", Float.toString(totalCharge));
				return map;
				
			}
			else if (cType.equals("Accessory")) {
				totalCharge = (count * 100) + (count * 50);
				map.put("Pack&DelCahrge", Float.toString(totalCharge));
				return map;
			}
			else {map.put("Pack&DelCahrge", "error");return map;}
		}
		map.put("Pack&DelCahrge", "error");
		return map;
	}

	
	@RequestMapping("/checkme")
	public String checkme () {
		return "I'm Fine & working!!!!!!";
	}
}
