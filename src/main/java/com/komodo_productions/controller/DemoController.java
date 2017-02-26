package com.komodo_productions.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/{name}")
	public String index(@PathVariable String name) {
		return "Welcome " + name;
	}
}
