package com.ashokit.service;

import org.springframework.stereotype.Service;

import com.ashokit.exceptions.NoBookFoundException;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public double findPriceById(String bookId) {
		if (bookId.equals("B101")) {
			return 450.00;
		} else {
			throw new NoBookFoundException("No Book Found With Given ID..!");
		}
	}
}