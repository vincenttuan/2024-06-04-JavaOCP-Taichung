package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String hello(@RequestParam(required = false, defaultValue = "班長") String name) {
		return "Hello " + name;
	}
	
	/**
	 * 參數的應用 
	 * 網址: /bmi?h=170&w=60 
	 * */
	@GetMapping("/bmi")
	@ResponseBody
	public String getBmi(@RequestParam("h") double h, @RequestParam("w") double w) {
		double bmi = w / Math.pow(h/100, 2);
		return String.format("BMI %.2f", bmi);
	}
	
	/**
	 * 參數的應用 
	 * 尋找指定員工
	 * 網址: /employee?id=1 
	 * */
	@GetMapping("/employee")
	@ResponseBody
	public String getEmployee(@RequestParam Integer id) {
		List<String> employees = List.of("John", "Mary", "Jack", "Rose");
		String employee = employees.get(id);
		return employee;
	}
	
	/**
	 * 路徑參數
	 * 尋找指定員工
	 * 網址: /employee/1
	 * 網址: /employee/2
	 */
	@GetMapping("/employee/{id}")
	@ResponseBody
	public String getEmployee2(@PathVariable Integer id) {
		List<String> employees = List.of("John", "Mary", "Jack", "Rose");
		String employee = employees.get(id);
		return employee;
	}
	
	/**
	 * 多參數的應用 
	 * 學生資料
	 * 網址: /student?name=John&age=18&score=90 
	 * */
	@GetMapping("/student")
	@ResponseBody
	public String getStudent(@RequestParam String name, @RequestParam Integer age, @RequestParam Integer score) {
		// ... 其他處理
		return String.format("學生姓名: %s 年齡: %d 成績: %d", name, age, score);
	}
	
	/**
	 * 多參數的應用 
	 * 學生資料
	 * 網址: /student?name=John&age=18&score=90 
	 * */
	@GetMapping("/student")
	@ResponseBody
	public String getStudent2(Map<String, String> map) {
		// ... 其他處理
		System.out.println(map); // 印在 Console
		return String.format("學生姓名: %s 年齡: %s 成績: %s", map.get("name"), map.get("age"), map.get("score"));
	}
	
}
