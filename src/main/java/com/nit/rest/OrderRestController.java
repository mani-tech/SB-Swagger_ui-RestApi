package com.nit.rest;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Order;
import com.nit.model.Payment;

@RestController
public class OrderRestController {
	@PostMapping("/payment")
	public ResponseEntity<Payment> orderCost(@RequestBody Order order)
	{
		Payment pay=new Payment();
		pay.setProdName(order.getProdName());
		pay.setQunatity(order.getQuantity());
		pay.setDate(new Date());
		switch(order.getProdName())
		{
		case "Apple" :
			pay.setCost(20*order.getQuantity());
			break;
		case "Orange" :
			pay.setCost(10*order.getQuantity());
			break;
		case "Banana" :
			pay.setCost(5*order.getQuantity());
			break;
		}
			
		return new ResponseEntity<Payment>(pay, HttpStatus.CREATED);
	}
}
