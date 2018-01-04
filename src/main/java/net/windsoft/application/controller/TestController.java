package net.windsoft.application.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.windsoft.webdevil.core.web.controller.BaseController;

@Controller
@RequestMapping("")
public class TestController extends BaseController {
	
	@RequestMapping("/test/page")
	public Map<String, Object> test() {
		System.out.println("test");
		return Map.of("id", "value");
	}
	
	@RequestMapping("/test")
	public String get() {
		return "test";
	}
	
}
