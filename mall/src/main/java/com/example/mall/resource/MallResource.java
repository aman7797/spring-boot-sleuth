package com.example.mall.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MallResource {

	@Autowired
	// private Tracer tracer;

	Logger logger = LoggerFactory.getLogger("SleuthService");

	// public void newSpanWork() {
	// logger.info("Original span going on");
	//
	// Span newSpan = tracer.nextSpan().name("new sleuth span").start();
	//
	// try (Tracer.SpanInScope span = tracer.withSpanInScope(newSpan.start())) {
	// logger.info("This work is being done in the new span");
	// } finally {
	// newSpan.finish();
	// }
	//
	// logger.info("Back to original span");
	// }
}
