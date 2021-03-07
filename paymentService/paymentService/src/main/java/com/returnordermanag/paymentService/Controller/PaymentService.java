package com.returnordermanag.paymentService.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.returnordermanag.paymentService.Model.PaymentData;

@RestController
@RequestMapping("/payment")
public class PaymentService {

	@SuppressWarnings("unused")
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private PaymentData paymentdata;

	@GetMapping("/ProcessPayment/{cCardNo}/{CreditLimit}/{ProcessCharge}")
	public Map<String, String> returnUserBalance(@PathVariable("cCardNo") String cCardNo,
			@PathVariable("CreditLimit") int CreditLimit, @PathVariable("ProcessCharge") float ProcessCharge) {
		
		HashMap<String, String> map = new HashMap<>();
		float CurrentBalance, RemainingBalance;
		if (!(cCardNo.isEmpty()) && CreditLimit>0 && ProcessCharge > 0 ) {
			CurrentBalance = paymentdata.ReturnCurrentBalnce(cCardNo);
			if (CreditLimit > ProcessCharge && CurrentBalance >= CreditLimit) {
				
				RemainingBalance = CurrentBalance - ProcessCharge;
				paymentdata.setCurrentBalance(RemainingBalance);
				
				map.put("CurrentBalance", Float.toString(RemainingBalance));
				return map;
				
			}
			else {
				map.put("CurrentBalance", "InffusicentFunds");
				return map;
			}
		}
		
		map.put("CurrentBalance", "InvalidData");
		return map;
	}

	@RequestMapping("/checkme")
	public String checkme() {
		return "I'm Fine & working!!!!!!";
	}

}
