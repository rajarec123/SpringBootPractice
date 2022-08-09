package com.ashokit.exceptions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Model model) {
		model.addAttribute("errMsg", "Some problem occurred, Please Try After Sometime..!");
		return "error";
	}
	
	@ExceptionHandler(value=NoBookFoundException.class)
	public String handleNoBookFoundException() {
		return "customError";
	}
}
