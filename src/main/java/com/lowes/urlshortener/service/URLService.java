package com.lowes.urlshortener.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lowes.urlshortener.model.URLModel;
import com.lowes.urlshortener.repository.URLRepository;

@Service
public class URLService {

	@Autowired
	URLRepository urlRepository;
	
	public void save(URLModel url) {
		urlRepository.save(url);
	}
}
