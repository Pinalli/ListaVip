package br.com.pinalli.listavip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {

	@RequestMapping("/")
	@ResponseBody
	String hello() {
		return "Bem vindo ao sitema Lista Vips";
	}
}
