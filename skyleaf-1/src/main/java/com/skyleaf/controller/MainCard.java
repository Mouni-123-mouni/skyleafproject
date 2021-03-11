package com.skyleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skyleaf.beans.Card;
import com.skyleaf.repository.Card1;
@RestController
@RequestMapping("/card")
public class MainCard
{
	
		@Autowired
		private Card1 repository ;
		@GetMapping("/readAll")
		public Iterable<Card>  readAll()
		{
		Iterable<Card> all=repository.findAll();
		return all;
		}
		
		
}
