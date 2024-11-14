package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
	
	@GetMapping("/now")
	@ResponseBody
	public String now() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss.S E");
		Date today = new Date();
		return "現在時刻: " + sdf.format(today);
	}
	
	/**
	 * 參數的應用 
	 * 網址: /hello?name=John
	 * */
	@GetMapping("/hello")
	@ResponseBody
	public String hello(@RequestParam String name) {
		return "Hello " + name;
	}
	
	/**
	 * 參數的應用 
	 * 網址: /bmi?h=170&w=60 
	 * */
	@GetMapping("/bmi")
	@ResponseBody
	public String getBmi(@RequestParam double h, @RequestParam double w) {
		double bmi = w / Math.pow(h/100, 2);
		return String.format("BMI %.2f", bmi);
	}
	
}
