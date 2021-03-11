package com.skyleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skyleaf.beans.BillingDetails;
import com.skyleaf.beans.PaymentMethod;
import com.skyleaf.repository.BillingDetailsRepository;
import com.skyleaf.repository.PaymentRepository;
@RestController
@RequestMapping("/billing/details")
public class BillingController
{
		@Autowired
		private BillingDetailsRepository repository ;
		@GetMapping("/readAll")
		public Iterable<BillingDetails>  readAll()
		{
		Iterable<BillingDetails> all=repository.findAll();
		return all;
		}
}
		