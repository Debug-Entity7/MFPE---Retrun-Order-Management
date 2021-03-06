package com.returnordermanag.packageDeliveryModule.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.returnordermanag.packageDeliveryModule.Model.PackDeliveryData;

@RestController
@RequestMapping("/packdel")
public class PackDeliveryService {
	
	@SuppressWarnings("unused")
	@Autowired
    private RestTemplate restTemplate;
	
	@Autowired
	private PackDeliveryData packDelData;
	
	@RequestMapping("/params/{cType}/{count}")
	public Map<String, String> packageDelivery(@PathVariable("cType") String cType, @PathVariable("count") int count) {
		float totalCharge;
		HashMap<String, String> map = new HashMap<>();
		if(!(cType.isEmpty()) && count > 0) {
			if (cType.equals("Integral")) 
			{
				totalCharge = (count * packDelData.getIntergalDelivery()) + (count * packDelData.getIntergalPackaging());
				map.put("Pack&DelCahrge", Float.toString(totalCharge));
				return map;
				
			}
			else if (cType.equals("Accessory")) {
				totalCharge = (count * packDelData.getAccessoryDelivery()) + (count * packDelData.getAccessoryPacking());
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
