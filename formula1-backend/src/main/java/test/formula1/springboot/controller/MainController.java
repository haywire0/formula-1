package test.formula1.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import test.formula1.springboot.service.ParsingService;



@Controller
public class MainController {
	
	private static final String MAIN_PAGE = "main";
	private static final String JSON_URL = "https://v1.formula-1.api-sports.io/teams";
	
	@Autowired
	private ParsingService parsingService;
	
	@RequestMapping
	public String main() {
		return MAIN_PAGE;
	}

}
