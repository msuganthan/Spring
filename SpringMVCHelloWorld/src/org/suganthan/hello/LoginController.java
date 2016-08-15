package org.suganthan.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping(value="/")
	public String login(ModelMap mMap) {
		mMap.addAttribute("login", "login");
		return "login";
	}
}
