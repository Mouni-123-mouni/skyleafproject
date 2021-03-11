package com.skyleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skyleaf.beans.BillingDetails;
import com.skyleaf.beans.CardExpiry;
import com.skyleaf.repository.BillingDetailsRepository;
import com.skyleaf.repository.CardRepository;

@RestController
@RequestMapping("/cardexpiry")
public class Card_ExpiryController
{
	@Autowired
	private CardRepository repository ;
	@GetMapping("/readAll")
	public Iterable<CardExpiry>  readAll()
	{
	Iterable<CardExpiry> all=repository.findAll();
	return all;
	}
	
	
}
