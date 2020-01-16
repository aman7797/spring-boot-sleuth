package com.example.items.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import brave.sampler.Sampler;

@RestController
@RequestMapping("/item")
public class ItemController {

	public Logger LOGGER = LoggerFactory.getLogger(ItemController.class);

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

	@RequestMapping("/car")
	private List<String> carItem() {
		LOGGER.info("Car Items");
		List<String> carList = new ArrayList<String>();
		carList.add("Nano");
		carList.add("Sumo");
		carList.add("Kamo");
		carList.add("Riano");
		LOGGER.info("Car Items List :: " + carList);
		return carList;
	}

}
