package com.example.mall.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mall.resource.CarResource;

import brave.sampler.Sampler;

@RestController
public class MallController {

	@Autowired
	private CarResource carResource;

	public Logger LOGGER = LoggerFactory.getLogger(MallController.class);

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

	@RequestMapping("/menu")
	public String menu() {
		LOGGER.info("Menu called ::");
		return "Welcome to Mall \n" + menuItems();

	}

	@RequestMapping("/car")
	public List<String> car() {
		LOGGER.info("Car selected from menu");

		return carResource.car();

	}

	public List<?> menuItems() {
		LOGGER.info("Menu Items invoked");
		List itemList = new ArrayList<String>();
		itemList.add("Car");
		itemList.add("Electronic");
		itemList.add("Grocery");
		itemList.add("Mobile");
		LOGGER.info("Item List ::" + itemList);
		return itemList;
	}
}
