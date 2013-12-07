package me.zeph.springview.demo.controller;

import me.zeph.springview.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class IndexController {

	public static final String INDEX = "index";
	public static final String INDEX_CONFIRMATION = "index-confirmation";

	@RequestMapping(value = "/", method = GET)
	public String view(User user) {
		return INDEX;
	}

	@RequestMapping(value = "indexConfirm", method = POST)
	public String commit(User user, ModelMap modelMap) {
		modelMap.addAttribute("name", user.getName());
		return INDEX_CONFIRMATION;
	}
}
