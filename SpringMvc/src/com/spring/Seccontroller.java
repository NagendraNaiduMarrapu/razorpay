package com.spring;

import java.util.Map;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@Controller
public class Seccontroller {

	@PostMapping("/payment")
	@ResponseBody
	public String processPayment(@RequestBody Map<String, Object> data) throws RazorpayException {
		int amount = Integer.parseInt((String) data.get("amount"));

		System.out.println("Received payment request for amount: " + amount);

		RazorpayClient razorpay = new RazorpayClient("rzp_test_4jwnZunhRo2Y9N", "QJKxF1QeJtOSTtYDINz0Hcyy");

		JSONObject orderRequest = new JSONObject();
		orderRequest.put("amount", amount * 100);
		orderRequest.put("currency", "INR");
		orderRequest.put("receipt", "vamsi_tax");

		Order orders = razorpay.Orders.create(orderRequest);
		System.out.println(orders);
		return orders.toString();
	}
}
