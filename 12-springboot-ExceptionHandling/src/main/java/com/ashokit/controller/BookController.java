package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashokit.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/findPriceById")
	public String getPriceById(@RequestParam("bookId") String bookId, Model model) {
		double bookPrice = bookService.findPriceById(bookId);
		model.addAttribute("price","Book Price:: "+bookPrice);
		return "display";
	}
}
