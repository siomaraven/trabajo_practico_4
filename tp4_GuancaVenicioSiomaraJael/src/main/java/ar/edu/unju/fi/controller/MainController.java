package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blue")
public class MainController {
	
	@GetMapping("/index")
	public String getIndexpage(){
		return "index";
	}
}
