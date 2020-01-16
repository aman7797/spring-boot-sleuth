package com.example.mall.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CarResource {

	@Autowired
	private RestTemplate restTemplate;

	public List<String> car() {

		String url = "http://ITEM-SERVICE/item/car";
		ResponseEntity<List> response = restTemplate.postForEntity(url, null, List.class);
		return response.getBody();
	}
}
