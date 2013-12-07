package me.zeph.springmvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class IndexController {

	public static final String INDEX = "index";

	@RequestMapping(value = "/", method = GET)
	public String view() {
		return INDEX;
	}
}
