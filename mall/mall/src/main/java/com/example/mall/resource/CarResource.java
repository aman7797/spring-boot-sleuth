package com.example.mall.resource;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CarResource {

	public List<String> car() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://192.168.0.103:8083/item/car";
		ResponseEntity<List> response = restTemplate.postForEntity(url, null, List.class);
		return response.getBody();
	}

}
