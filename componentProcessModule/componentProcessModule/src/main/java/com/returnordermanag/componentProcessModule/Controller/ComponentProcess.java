package com.returnordermanag.componentProcessModule.Controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/comp")
public class ComponentProcess {

	@SuppressWarnings("unused")
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/ProcessDetail")
	public String ProcessDeatail() {
		return "";
	}

	@PostMapping("/CompleteProcessing/{RequestId}/{cCardNo}/{CreditLimit}/{ProcessCharge}")
	public String CompleteProcessing(@PathVariable("RequestId") String RequestId,
			@PathVariable("cCardNo") String cCardNo, @PathVariable("CreditLimit") int CreditLimit,
			@PathVariable("ProcessCharge") float ProcessCharge) {

		@SuppressWarnings("unchecked")
		HashMap<String, String> map = restTemplate.getForObject(
				"http://localhost:8083/payment/ProcessPayment/"+cCardNo+"/"+CreditLimit+"/"+ProcessCharge, HashMap.class);
		String mapValue = map.get("CurrentBalance");
		if (!(mapValue.equals("InffusicentFunds")) && !(mapValue.equals("InvalidData"))) {
			return "Payment is Succefull with Remaining value is "+mapValue;
		}

		return "Payment is Declined due to Inffusicent Funds";
	}

	@RequestMapping("/checkme")
	public String checkme() {
		return "I'm Fine & working!!!!!!";
	}

}
