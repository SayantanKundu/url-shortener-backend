package com.lowes.urlshortener.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lowes.urlshortener.model.URLModel;
import com.lowes.urlshortener.service.URLService;

@RestController
public class UrlShortenerController {
	
	@Autowired
	URLService urlService;
	
	@PostMapping(path = "/save")
	public String saveFullUrl(@RequestBody URLModel url){
		
		System.out.println(url.getFullUrl());
		urlService.save(url);
		return "Saved successfully";
	}
}
