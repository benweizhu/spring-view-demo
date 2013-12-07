package me.zeph.springview.demo.controller;

import me.zeph.springview.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

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
	public String commit(@Valid User user, Errors errors, Model model) {
		if (errors.hasErrors()) {
			return INDEX;
		}
		model.addAttribute("name", user.getName());
		model.addAttribute("gender", user.getGender());
		model.addAttribute("channels", user.getChannels());
		model.addAttribute("server", user.getServer());
		model.addAttribute("agree", user.isAgree());
		return INDEX_CONFIRMATION;
	}
}
